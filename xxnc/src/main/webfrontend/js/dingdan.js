$(window).on('load',()=>{
    $.ajax({
        type:'get',
        url:'http://127.0.0.1:8086/xxnc/api/orde',
        dataType:'json',
        success:function (data) {
            console.log(data)
            let text=``
            data.forEach((orde,i)=>{
                //console.log(leaveword.yusername)
                text +=`
                    <tr id="${orde.did}">
                    <td>${orde.yusername}</td>
                    <td>${orde.sname}</td>
                    <td>${orde.simg}</td>
                    <td>${orde.ddate}</td>
                    <td>${orde.dnumber}</td>
                    <td>${orde.dprice}</td>
                    <td>${orde.dstatus}</td>
                    </tr>
                    `
            })
            $('tbody').append(text)
        }
    })
})



