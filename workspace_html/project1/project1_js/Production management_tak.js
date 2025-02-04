window.addEventListener('load', init)


function init() {
    //라인별 메뉴 클릭시 색변경 코드
    let ssLine = document.querySelector('.ssLine')
    ssLine.addEventListener('click', function (evt) {
        console.log("1", evt.target)
        console.log("2", evt.target.parentNode.children)
        let ssLines = evt.target.parentNode.children
        for (let i = 0; i < ssLines.length; i++) {
            ssLines[i].classList.remove('point')
        }
        evt.target.classList.add('point')
        console.log(evt.target.getAttribute('class'))
        let evtId = evt.target.getAttribute('class').split(' ')
        console.log(evtId[0])
        const ssLineId = document.querySelectorAll("[id^=ssLine]")
        console.log(ssLineId)

        for (let j = 0; j < ssLineId.length; j++) {
            ssLineId[j].classList.add('hide')
        }
        document.querySelector("#" + evtId[0]).classList.remove('hide')
    })

    // 라인별 생산관리 관련 
    let ssTables = document.querySelector('.ssTable')
    ssTables.addEventListener('click', function (evt) {
        //생산 관리 관련 수정창 클릭시 표시
        document.querySelector('.pr_correction').classList.add('hide')
        document.querySelector('.pm_correction').classList.remove('hide')
        // 라인별 목록에 줄클릭시 point 클래스 add하는 js 
        let ssTable = evt.target.parentNode.parentNode.children
        for (let i = 0; i < ssTable.length; i++) {
            ssTable[i].classList.remove('point')
        }
        evt.target.parentNode.classList.add('point')
    })


    let pr_table = document.querySelector('.pr_table')
    pr_table.addEventListener('click', function (evt) {
        
        //생산 관리 관련 수정창 클릭시 표시
        document.querySelector('.pm_correction').classList.add('hide')
        document.querySelector('.pr_correction').classList.remove('hide')
        // 라인별 목록에 줄클릭시 point 클래스 add하는 js 
        let pr_tables = evt.target.parentNode.parentNode.children
        for (let i = 0; i < pr_tables.length; i++) {
            pr_tables[i].classList.remove('point')
        }
        evt.target.parentNode.classList.add('point')
    })
}