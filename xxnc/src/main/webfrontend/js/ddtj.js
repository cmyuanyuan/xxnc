$(window).on('load',()=>{
    $.ajax({
        type:'get',
        url:'http://127.0.0.1:8086/xxnc/api/shoppings',
        dataType:'json',
        success:function (data) {
            let text = ``
            data.forEach((shoppings, i) => {
                text += `
<div class="dingd_sl">
<table width="0" border="0" cellspacing="0" cellpadding="0">
  <tr style=" font-family:微软雅黑; text-align:center; font-size:14px;">
    <td width="43" height="87"><input class="spxz" name="" type="checkbox" value=""/></td>
    <td width="305"><span class="ddtp_3"><img src='${shoppings.simg}' width="59" height="58" /></span><span class="ddmc_xq"><a href="#">${shoppings.sname}</a></span></td>
    <td width="116">${shoppings.swegiht}</td>
    <td width="114" style="color:#F00;">￥${shoppings.sprice}</td>
    <td width="147"><input name="" value="-" type="button" / style="background: url(images/jia.jpg); width:19px; height:19px;">
<input type="text" value="${shoppings.gnumber}" / style="width:40px; text-align:center; height:18px; border:1px solid #dddddd;" >  <input name="" value="+" type="button" / style="background: url(images/jia.jpg); width:19px; height:19px;"></td>
    <td width="118" style="color:#F00;">￥<span vaule="${shoppings.gprice}">${shoppings.gprice}</span></td>    
    <td width="72"><a href="#">删除</a></td>
  </tr>
</table>
</div>
          `
            })
            $('#gws').append(text)
            console.log(data)
        }
    })
    console.log($(".spxz input[type='checkbox']").attr('checked'))
    // console.log($("input[type='checkbox']").attr('checked'));
    console.log($(".spxz input[type='checkbox']").is(':checked'));
})