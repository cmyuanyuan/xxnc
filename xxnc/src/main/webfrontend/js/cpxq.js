$(window).on('load',()=>{
    var sid=localStorage.getItem('sid')
    console.log(sid)
    localStorage.removeItem('sid')
    $.ajax({
        type:'get',
        url:'http://127.0.0.1:8086/xxnc/api/commoditys/'+sid,
        dataType:'json',
        success:function (data) {
            console.log(data)
            $("#img").attr("src",data.simg);
            $("#spec-list ul img").attr("src",data.simg);
            $('#spn').append(data.sname);
            $('#spn1').append(data.sname);
            $('#spn2').append(data.sname);
            $('#swegiht').append(data.swegiht+"千克");
            $('#swegiht1').append(data.swegiht+"千克");
            $('#sprice').append('￥'+data.sprice);
            $('#sprice').val(data.sprice);
            $('#sautochthonous').append(data.sautochthonous);
            $('#sautochthonous1').append(data.sautochthonous);
            $('#sautochthonous2').append(data.sautochthonous);
            $('#spredicable').append(data.spredicable);
            $(".wntj_lb .wntj_bt1 img").attr("src",data.simg);
            $(".wntj_lb .wntj_bt2 .wntj_mc").append(data.sname);
            $(".wntj_lb .wntj_bt2 .wntj_jg").append(data.sprice);
            $("#img12").attr("src",data.simg);
            // ssuggest'产品介绍
            // svender'生产厂家'
            // service'售后服务'
}
})
    $("#jian").click(()=>{
        var sz=$("#sz").val()
        if (Number(sz)>1){
            $("#sz").val(Number(sz)-1)
        }
    })
    $("#jia").click(()=>{
        var sz=$("#sz").val()
        $("#sz").val(Number(sz)+1)
    })
    $("#dg").click(()=>{
        let data = {
            gnumber: $("#sz").val(),
            sid: sid,
            yid: localStorage.getItem('yid'),
            gprice:$('#sprice').val()
        }
        console.log(data)
        $.ajax({
            type:'post',
            url:'http://127.0.0.1:8086/xxnc/api/shoppings',
            data: JSON.stringify(data),
            contentType: 'application/json',
            success:function (data) {
                console.log(data)
            }
        })
    })

})