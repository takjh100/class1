


window.addEventListener("load", function () {
    const login = document.querySelector("#login");
    login.addEventListener("click", function () {
        const id = document.querySelector("#id").value;
        const pw = document.querySelector("#pw").value;
        if (id == '' && pw == '') {
            document.querySelector("#view2").style.color = "red";
            document.querySelector("#view2").innerHTML = "아이디와 비밀번호는 필수입니다."
        } else if (id == '') {
            document.querySelector("#view2").style.color = "red";
            document.querySelector("#view2").innerHTML = "아이디는 필수입니다."
        } else if (pw == '') {
            document.querySelector("#view2").style.color = "red";
            document.querySelector("#view2").innerHTML = "비밀번호는 필수입니다."
        } else {
            document.querySelector("#view2").innerHTML = '';
        }

    })



    let time = setInterval(function () {
        let now = new Date();
        console.log(now);

        let h = now.getHours();
        let m = now.getMinutes();
        let s = now.getSeconds();
        let pmam = 0;
        if (h <= 12) {
            pmam = 'AM';
        } else if (h > 12 && h <= 24) {
            pmam = 'PM';
        }
        console.log(h, m, s);
        console.log('현재 시간' + h + '시', m + '분', s + '초');
        let nowtime = document.querySelector("#time").innerHTML = '현재 시간 : ' + pmam + h + '시' + m + '분' + s + '초';
    }, 250)

    //시간종료
    clearInterval(time);

});

window.addEventListener('load',function(){
    let alarmbtn = document.querySelector('#alarmbtn');
    alarmbtn.addEventListener("click", function () {
        let alarm = document.querySelector('#alarm').value;
        // if(h,m == alarm){
            if(alarm <'12:00'){
                document.querySelector('#bell').innerHTML = '알람 시간 AM '+alarm+'입니다';
                
            }else if(alarm >'12:00' && alarm <'24:00'){
                document.querySelector('#bell').innerHTML = '알람 시간 PM '+alarm+'입니다';
            }
            console.log(alarm);
        // }

})
})




// let arr = [];
// let str = 0;
// let lotto = 0;

// console.log(arr);
// console.log(str);

window.addEventListener("load", function () {
    let ltbtn = document.querySelector('#ltbtn');
    ltbtn.addEventListener('click', function () {

        let arr = [];
        let str = 0;
        let lotto = 0;
        if (str != -1) {
            for (let i = 0; i < 6; i++) {
                lotto = parseInt(Math.random() * 45) + 1;
                str = arr.indexOf(lotto);
                arr.push(lotto);
                if (str != -1) {
                    arr.pop();
                    i--;
                }


            }
        }
        arr.sort((x, y) => x - y);
        console.log(arr);
        document.querySelector('#ltnumber').innerHTML = arr;

    })
}
)

// 로또 강사님 풀이




    



// const domain = "cafe.naver.com";
// let idx = domain.indexOf('.');
// const domain2 = domain.substr(idx + 1);
// console.log(domain2)
// idx = domain.indexOf('.');
// const domain3 = domain2.substr(0, idx +1);
// console.log(domain3)