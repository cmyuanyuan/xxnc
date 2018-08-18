$(window).on('load',()=>{
    $("#zc").click(()=>{
        var zh=$.trim($('#zh').val())
        var mm1=$.trim($('#mm1').val())
        var mm2=$.trim($('#mm2').val())
        var yhm=$.trim($('#yhm').val())
        var sj=$.trim($('#sj').val())
        var yx=$.trim($('#yx').val())
        var yzm=$.trim($('#yzm').val())
        if (mm1!=mm2){
            alert("两次密码不相同")
        }
        var data={
            yname:zh,
            ypassword:mm1,
            yusername:yhm,
            phone:sj,
            yemail:yx
        }
        $.ajax({
            type:'post',
            url:'http://127.0.0.1:8086/xxnc/api/users',
            data:JSON.stringify(data),
            contentType: 'application/json',
            success: function (data) {
                if (data==1) {
                    alert("注册成功！可以登录了")
                    window.location.href = 'denglu.html'
                }else {
                    console.log("失败")
                }
            }
        })
    })

})