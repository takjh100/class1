setInterval(function () {
    let currentDate = new Date();
    const formattedDate = `${currentDate.getFullYear()}-${currentDate.getMonth() + 1}-${currentDate.getDate()} ${currentDate.getHours()}:${currentDate.getMinutes()}:${currentDate.getSeconds()}`;
    let newDate = document.querySelector('#newDate').value = formattedDate;
    
}, 1000);
// let currentDate = new Date();
// const formattedDate = `${currentDate.getFullYear()}-${currentDate.getMonth() + 1}-${currentDate.getDate()} ${currentDate.getHours()}:${currentDate.getMinutes()}:${currentDate.getSeconds()}`;
// let newDate = document.querySelector('#newDate').value = formattedDate


let ITEM_NM = document.querySelector(".ITEM_NM");
console.log(ITEM_NM);
ITEM_NM.addEventListener('click', function (evt) {
    if(evt.value=="싹싹지우개"){
        let ITEM_NM_CD = document.querySelector(".ITEM_NM_CD");
        ITEM_NM_CD.innerHTMl="SS-01";
    }else if(evt.value=="하츄핑지우개"){
        let ITEM_NM_CD = document.querySelector(".ITEM_NM_CD");
        ITEM_NM_CD.innerHTMl="HH-01";
    }
})