$(window).on('load',()=>{
    localStorage.removeItem('yname')
    localStorage.removeItem('yid')
 $('#dl').click(()=>{
     var zh=$.trim($('#zh').val())
     var mm=$.trim($('#mm').val())
     console.log(zh,mm)
     // let data = {
     //     yname:zh,
     //     ypassword:mm
     // }
     $.ajax({
         type:'get',
         url:'http://127.0.0.1:8086/xxnc/api/users',
         data:{
             yname:zh,
             ypassword:mm
         },
         success: function (data) {
             if (data==400) {
                 console.log("1")
                 alert("账号密码错误或账号不存在")
             }else {
                  localStorage.setItem('yname',data.yname)
                  localStorage.setItem('yid',data.yid)
                  window.location.href = 'index.html'
             }
         }
     })
 })
})