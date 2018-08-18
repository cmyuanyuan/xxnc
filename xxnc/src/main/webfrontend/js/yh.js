$(window).on('load',()=>{
    var yh=localStorage.getItem("yname");
    if(yh==""||yh==null){
        $('#yh').append(`<a href="denglu.html"> [请登录]</a> <a href="zhuce.html">[免费注册]</a>`);
        window.location.href = 'denglu.html'
    }else{
        yh+=`&nbsp;&nbsp;<a id="zx">注销</a>`;
        $('#yh').append(yh);
    }
    $('#zx').click(() => {
        localStorage.removeItem("yname");
        window.location.href = 'index.html'
    })
})
