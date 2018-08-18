$(window).on('load',()=>{
    $.ajax({
        type:'get',
        url:'http://127.0.0.1:8086/xxnc/api/commoditys',
        dataType:'json',
        success:function (data) {
            let text = ``
            data.forEach((commodity, i) => {
                // console.log(car.name)
                text += `
        <div class="tplist1" style="margin-left:0px;">
                <div class="tplist1_1"><img src="${commodity.simg}" onclick=" findBysid(${commodity.sid})" width="296" height="185" /></div>
            <div class="tplist_yy"></div>
                <div class="tplist_mc">${commodity.sname}</div>
            <div class="tplist_mcjg"><span  class="tejia">特卖价￥${commodity.sprice} </span></div>
            </div>
          `
            })
            $('#sp').append(text)
        //
        //     $("#spec-list ul img").attr("src",${commodity.simg});
        //     $('#spn').append(${commodity.sname});
        //     $('#swegiht').append(${commodity.swegiht});
        //     $('#sprice').append('￥'${commodity.sprice});
        //     $('#sautochthonous').append('￥'${commodity.sautochthonous});
        //     $('#spredicable').append('￥'${commodity.spredicable});
            // ssuggest'产品介绍
            // svender'生产厂家'
            // service'售后服务'
        }
    })
    // $("#sp .tplist1 .tplist1_1").click(()=>{
    //     console.log("asd")
    // })
    // <a href="cpxq.html?sid=${commodity.sid}">
})
function findBysid(sid) {
    localStorage.setItem('sid',sid);
    window.location.href = 'cpxq.html'
}