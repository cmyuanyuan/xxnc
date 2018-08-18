$(window).on('load',()=>{
    var id=localStorage.getItem("id");
    $.ajax({
        type:'get',
        url:'http://127.0.0.1:8086/xxnc/api/commoditys/'+id,
        dataType:'json',
        success:function (data) {
            $("#spec-list ul img").attr("src",${data.simg});
            $('#spn').append(${data.sname});
            $('#swegiht').append(${data.swegiht});
            $('#sprice').append('￥'${data.sprice});
            $('#sautochthonous').append('￥'${data.sautochthonous});
            $('#spredicable').append('￥'${data.spredicable});
            // ssuggest'产品介绍
            // svender'生产厂家'
            // service'售后服务'
        }
    })
})
