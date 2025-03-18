window.addEventListener('load', init)

function init() {
    
    setInterval(function () {
        let currentDate = new Date();
        const formattedDate = `${currentDate.getFullYear()}-${currentDate.getMonth() + 1}-${currentDate.getDate()} ${currentDate.getHours()}:${currentDate.getMinutes()}:${currentDate.getSeconds()}`;
        let newDate = document.querySelector('#newDate').value = formattedDate;
        
    }, 1000);
    // let currentDate = new Date();
    // const formattedDate = `${currentDate.getFullYear()}-${currentDate.getMonth() + 1}-${currentDate.getDate()} ${currentDate.getHours()}:${currentDate.getMinutes()}:${currentDate.getSeconds()}`;
    // let newDate = document.querySelector('#newDate').value = formattedDate
    
    
    let itemNm = document.querySelector('.itemNm');
    console.log("itemNm : ", itemNm);

    itemNm.addEventListener('change', function (evt) {  // 'click'을 'change'로 변경
        let itemNms = evt.target.value;  // 선택된 옵션의 값 가져오기
        console.log("itemNms : ", itemNms);

        let itemCd = document.querySelector('.itemCd');  // itemCd 요소 가져오기
        console.log("bbbbb", itemCd.value);  // 기존 itemCd 값 출력

        // itemCd 값을 업데이트
        if (itemNms == "싹싹지우개") {
            itemCd.value = "SS-01";  // itemCd의 값을 'SS-01'로 변경
        } else if (itemNms == "하츄핑지우개") {
            itemCd.value = "HH-01";  // itemCd의 값을 'HH-01'로 변경
        }
        console.log("Updated itemCd : ", itemCd.value);  // 변경된 itemCd 값 출력
    });
    
    //epdpspepwpe
    let itemCd = document.querySelector('.itemCd');
    console.log("itemCd : ", itemCd);

    itemCd.addEventListener('change', function (evt) {  // 'click'을 'change'로 변경
        let itemCds = evt.target.value;  // 선택된 옵션의 값 가져오기
        console.log("itemCds : ", itemCds);

        let itemNm = document.querySelector('.itemNm');  // itemCd 요소 가져오기
        console.log("bbbbb", itemCd.value);  // 기존 itemCd 값 출력

        // itemCd 값을 업데이트
        if (itemCds == "SS-01") {
            itemNm.value = "싹싹지우개";  // itemCd의 값을 'SS-01'로 변경
        } else if (itemCds == "HH-01") {
            itemNm.value = "하츄핑지우개";  // itemCd의 값을 'HH-01'로 변경
        }
        console.log("Updated itemNm : ", itemNm.value);  // 변경된 itemCd 값 출력
    });
    

}
    document.querySelector('.end').addEventListener('click', function () {
        window.open('a','_self').close();
        opener.parent.location.reload();
    });