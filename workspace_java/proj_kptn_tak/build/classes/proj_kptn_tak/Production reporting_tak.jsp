<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <!-- 여기에 대시보드 css 파일옮기기 -->
    <link rel="stylesheet" href="layOut_tak.css">
    <link rel="stylesheet" href="Production reporting_tak.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
    <script src="https://cdn.jsdelivr.net/npm/chart.js@4.4.7/dist/chart.umd.min.js"></script>
    <script src="layOut_tak.js"></script>
    <script src="Production reporting_tak.js"></script>
    <style>
        /******************
        모바일 버전 구현(불량쪽 차트는 ....)
        *******************/
    </style>
</head>

<body>

    <div class="menu-con work">
        <div>
            <div id="title-name">
                <div class="titleName">
                    <i id="ham" class=" main-menu fas fa-solid fa-bars fa-lg"></i>&nbsp;&nbsp;<div class="logo"><i class="fas fa-solid fa-infinity fa-lg"></i>&nbsp;Human MES solution</div>
                </div>
                <div class="icon-sub">
                    관리자님 환영합니다.
                    <!-- <i class="fas fa-solid fa-gear fa-lg" style="display: flex; width: 60px; justify-content: space-between;" > -->
                    <i class="fas fa-regular fa-arrow-right-from-bracket fa-md">
                        <span class="subBut">로그아웃</span>
                    </i>
                    <!-- </i> -->
                </div>
            </div>
        </div>
        <div class="main-menu-con">
            <!-- <div class="main-menu" id="main-menu">MENU 닫기</div> -->
            <div class="menu">기준관리</div>
            <div class="menu">작업관리</div>
            <div class="menu">생산관리</div>
            <div class="menu">생산리포팅</div>
            <div class="menu">자재관리</div>
            <div class="menu">품질관리</div>
        </div>
    </div>
    <div class="board">

        <div class="mainmenu" id="work1">
            <div class="menuBut">대시보드</div>
            <div class="menuBut">게시판</div>
            <div class="menuBut">공지사항</div>
            <!-- <div class="menuBut">기준관리</div> -->
        </div>

        <div class="bome-con">
            <!-- 배경색 -->
            <!-- style="background-color: rgba(87, 59, 27, 0.329);" -->
            <div class="menuPage-con">
                <!-- html 들어갈 곳 -->
                <div id="work4">
                    <div class="pr_box1">
                        <div class="date_box">
                            <table class="date_box_manu">
                                <tr>
                                    <td class="date_point date_ssManu1 date_ssList1 point2">일별 생산량</td>
                                    <td class="date_point date_ssManu2 date_ssList2">주간별 생산량</td>
                                    <td class="date_point date_ssManu3 date_ssList3">월별생산량</td>
                                    <td class="date_point date_ssManu4 date_ssList4">월별주문/판매량</td>
                                </tr>
                            </table>
                            <div class="ssgraph" id="date_ssManu1">
                                <div class="graph_wrap">
                                        <div class="tit">라인 일별 생산량</div>
                                    <div class="graph">
                                        <!-- 기준 -->
                                        <ul class="y-axis">
                                            <li><span>100</span></li>
                                            <li><span>90</span></li>
                                            <li><span>80</span></li>
                                            <li><span>70</span></li>
                                            <li><span>60</span></li>
                                            <li><span>50</span></li>
                                            <li><span>40</span></li>
                                            <li><span>30</span></li>
                                            <li><span>20</span></li>
                                            <li><span>10</span></li>
                                            <li><span>0</span></li>
                                        </ul>
                                        <!-- 목록 -->
                                        <ul class="x-axis">
                                            <li><span>A. 투입량</span></li>
                                            <li><span>A. 생산량</span></li>
                                            <li><span>A. 불량률</span></li>
                                            <li><span>B. 투입량</span></li>
                                            <li><span>B. 생산량</span></li>
                                            <li><span>B. 불량률</span></li>
                                            <li><span>C. 투입량</span></li>
                                            <li><span>C. 생산량</span></li>
                                            <li><span>C. 불량률</span></li>
                                        </ul>
                                        <!-- 바 그래프 (백분율 만큼 height값) -->
                                        <ul class="bar" style="bottom: -118px;">
                                            <li class="hovertext" data-hover="34ea" style="height:34%;"><span></span>
                                            </li>
                                            <li class="hovertext" data-hover="33ea" style="height:33%;"><span></span>
                                            </li>
                                            <li class="hovertext" data-hover="1ea" style="height:1%;"><span></span></li>
                                            <li class="hovertext" data-hover="39ea" style="height:39%;"><span></span>
                                            </li>
                                            <li class="hovertext" data-hover="39ea" style="height:39%;"><span></span>
                                            </li>
                                            <li class="hovertext" data-hover="0ea" style="height:0%;"><span></span></li>
                                            <li class="hovertext" data-hover="51ea" style="height:51%;"><span></span>
                                            </li>
                                            <li class="hovertext" data-hover="49ea" style="height:49%;"><span></span>
                                            </li>
                                            <li class="hovertext" data-hover="2ea" style="height:2%;"><span></span></li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                            <div class="ssgraph hide" id="date_ssManu2">
                                <div class="graph_wrap">
                                    <div class="tit">라인 주간별 생산량</div>
                                    <div class="graph">
                                        <!-- 기준 -->
                                        <ul class="y-axis">
                                            <li><span>1000</span></li>
                                            <li><span>900</span></li>
                                            <li><span>800</span></li>
                                            <li><span>700</span></li>
                                            <li><span>600</span></li>
                                            <li><span>500</span></li>
                                            <li><span>400</span></li>
                                            <li><span>300</span></li>
                                            <li><span>200</span></li>
                                            <li><span>100</span></li>
                                            <li><span>0</span></li>
                                        </ul>
                                        <!-- 목록 -->
                                        <ul class="x-axis">
                                            <li><span>A. 투입량</span></li>
                                            <li><span>A. 생산량</span></li>
                                            <li><span>A. 불량률</span></li>
                                            <li><span>B. 투입량</span></li>
                                            <li><span>B. 생산량</span></li>
                                            <li><span>B. 불량률</span></li>
                                            <li><span>C. 투입량</span></li>
                                            <li><span>C. 생산량</span></li>
                                            <li><span>C. 불량률</span></li>
                                        </ul>
                                        <!-- 바 그래프 (백분율 만큼 height값) -->
                                        <ul class="bar" style="bottom: -118px;">
                                            <li style="height:43%;"><span></span></li>
                                            <li style="height:41%;"><span></span></li>
                                            <li style="height:2%;"><span></span></li>
                                            <li style="height:51%;"><span></span></li>
                                            <li style="height:50%;"><span></span></li>
                                            <li style="height:1%;"><span></span></li>
                                            <li style="height:46%;"><span></span></li>
                                            <li style="height:44%;"><span></span></li>
                                            <li style="height:2%;"><span></span></li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                            <div class="ssgraph hide" id="date_ssManu3">
                                <div class="graph_wrap">
                                    <div class="tit">라인 월별 생산량</div>
                                    <div class="graph">
                                        <!-- 기준 -->
                                        <ul class="y-axis">
                                            <li><span>10000</span></li>
                                            <li><span>9000</span></li>
                                            <li><span>8000</span></li>
                                            <li><span>7000</span></li>
                                            <li><span>6000</span></li>
                                            <li><span>5000</span></li>
                                            <li><span>4000</span></li>
                                            <li><span>3000</span></li>
                                            <li><span>2000</span></li>
                                            <li><span>1000</span></li>
                                            <li><span>0</span></li>
                                        </ul>
                                        <!-- 목록 -->
                                        <ul class="x-axis">
                                            <li><span>A. 투입량</span></li>
                                            <li><span>A. 생산량</span></li>
                                            <li><span>A. 불량률</span></li>
                                            <li><span>B. 투입량</span></li>
                                            <li><span>B. 생산량</span></li>
                                            <li><span>B. 불량률</span></li>
                                            <li><span>C. 투입량</span></li>
                                            <li><span>C. 생산량</span></li>
                                            <li><span>C. 불량률</span></li>
                                        </ul>
                                        <!-- 바 그래프 (백분율 만큼 height값) -->
                                        <ul class="bar" style="bottom: -90px;">
                                            <li style="height:54%;"><span></span></li>
                                            <li style="height:51%;"><span></span></li>
                                            <li style="height:3%;"><span></span></li>
                                            <li style="height:61%;"><span></span></li>
                                            <li style="height:59%;"><span></span></li>
                                            <li style="height:2%;"><span></span></li>
                                            <li style="height:66%;"><span></span></li>
                                            <li style="height:65%;"><span></span></li>
                                            <li style="height:1%;"><span></span></li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                            <div class="ssgraph hide" id="date_ssManu4">
                                <div class="graph_wrap">
                                    <div class="tit">월별 주문/판매량</div>
                                    <div class="graph">
                                        <!-- 기준 -->
                                        <ul class="y-axis">
                                            <li><span>100</span></li>
                                            <li><span>90</span></li>
                                            <li><span>80</span></li>
                                            <li><span>70</span></li>
                                            <li><span>60</span></li>
                                            <li><span>50</span></li>
                                            <li><span>40</span></li>
                                            <li><span>30</span></li>
                                            <li><span>20</span></li>
                                            <li><span>10</span></li>
                                            <li><span>0</span></li>
                                        </ul>
                                        <!-- 목록 -->
                                        <ul class="x-axis">
                                            <li><span>싹싹지우개</span></li>
                                            <li><span>처음처럼지우개</span></li>
                                            <li><span>우유빛지우개</span></li>
                                            <li><span>뭐든지우개</span></li>
                                            <li><span>리셋지우개</span></li>
                                        </ul>
                                        <!-- 바 그래프 (백분율 만큼 height값) -->
                                        <ul class="bar" style="bottom: -44px;">
                                            <li style="height:85%;"><span></span></li>
                                            <li style="height:2%;"><span></span></li>
                                            <li style="height:88%;"><span></span></li>
                                            <li style="height:5%;"><span></span></li>
                                            <li style="height:90%;"><span></span></li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="numberBox">
                                <div class="pr_boxTit">호기별 생산량 조회</div>
                            <hr>
                            <div style="display: flex; justify-content: space-evenly; margin-bottom: 15px;">
                                <div>라인 :</div>
                                <select>
                                    <option>A라인</option>
                                    <option>B라인</option>
                                    <option>C라인</option>
                                </select>
                                <div>호기:</div>
                                <select>
                                    <option>1호기</option>
                                    <option>2호기</option>
                                    <option>3호기</option>
                                    <option>4호기</option>
                                    <option>5호기</option>
                                </select>
                            </div>
                            <div class="ssTable">
                                <table>
                                    <tr>
                                        <th class="es1">기간별</th>
                                        <th class="es2">생산량</th>
                                    </tr>
                                    <tr>
                                        <td class="es1">금일 생산량</td>
                                        <td class="es2">34 ea</td>
                                    </tr>
                                    <tr>
                                        <td class="es1">금주 생산량</td>
                                        <td class="es2">125 ea</td>
                                    </tr>
                                    <tr>
                                        <td class="es1">금월 생산량</td>
                                        <td class="es2">521 ea</td>
                                    </tr>
                                    <tr>
                                        <td class="es1">금월 불량률</td>
                                        <td class="es2">2%</td>
                                    </tr>
                                </table>
                            </div>
                        </div>
                    </div>
                    <div class="pr_box2">
                        <div class="date_list">
                            <!-- 일별,품목별 총생산량 박스 -->
                            <div class="date_ssBox" id="date_ssList1">
                                <div class="date_ssBox_tit">일별 생산량</div>
                                <div class="date_ssTable">
                                    <table>
                                        <tr>
                                            <th class="es3">설비명</th>
                                            <th class="es4">생산량</th>
                                            <th class="es5">설비명</th>
                                            <th class="es6">생산량</th>
                                            <th class="es7">설비명</th>
                                            <th class="es8">생산량</th>
                                        </tr>
                                        <tr>
                                            <td class="es3">A라인 1호기</td>
                                            <td class="es4">15 ea</td>
                                            <td class="es5">B라인 1호기</td>
                                            <td class="es6">19 ea</td>
                                            <td class="es7">C라인 1호기</td>
                                            <td class="es8">17 ea</td>
                                        </tr>
                                        <tr>
                                            <td class="es3">A라인 2호기</td>
                                            <td class="es4">12 ea</td>
                                            <td class="es5">B라인 2호기</td>
                                            <td class="es6">13 ea</td>
                                            <td class="es7">C라인 2호기</td>
                                            <td class="es8">11 ea</td>
                                        </tr>
                                        <tr>
                                            <td class="es3">A라인 3호기</td>
                                            <td class="es4">15 ea</td>
                                            <td class="es5">B라인 3호기</td>
                                            <td class="es6">13 ea</td>
                                            <td class="es7">C라인 3호기</td>
                                            <td class="es8">11 ea</td>
                                        </tr>
                                        <tr>
                                            <td class="es3">A라인 4호기</td>
                                            <td class="es4">13 ea</td>
                                            <td class="es5">B라인 4호기</td>
                                            <td class="es6">15 ea</td>
                                            <td class="es7">C라인 4호기</td>
                                            <td class="es8">10 ea</td>
                                        </tr>
                                    </table>
                                </div>
                                <div class="date_ssBox_tit">품목별 금일 총 생산량
                                </div>
                                <select class="pr_bay" style="margin-left: 20px;">
                                    <option value="1">싹싹지우개</option>
                                    <option value="2">처음처럼지우개</option>
                                    <option value="3">우유빛지우개</option>
                                    <option value="4">뭐든지우개</option>
                                    <option value="5">리셋지우개</option>
                                </select>
                                <div class="ssTotal" id="ssTotal1">24ea</div>
                            </div>
                            <!-- 주간별,품목별 총생산량 박스 -->
                            <div class="date_ssBox hide" id="date_ssList2">
                                <div class="date_ssBox_tit">주간별 생산량</div>
                                <div class="date_ssTable">
                                    <table>
                                        <tr>
                                            <th class="es3">설비명</th>
                                            <th class="es4">생산량</th>
                                            <th class="es5">설비명</th>
                                            <th class="es6">생산량</th>
                                            <th class="es7">설비명</th>
                                            <th class="es8">생산량</th>
                                        </tr>
                                        <tr>
                                            <td class="es3">A라인 1호기</td>
                                            <td class="es4">56 ea</td>
                                            <td class="es5">B라인 1호기</td>
                                            <td class="es6">67 ea</td>
                                            <td class="es7">C라인 1호기</td>
                                            <td class="es8">65 ea</td>
                                        </tr>
                                        <tr>
                                            <td class="es3">A라인 2호기</td>
                                            <td class="es4">58 ea</td>
                                            <td class="es5">B라인 2호기</td>
                                            <td class="es6">64 ea</td>
                                            <td class="es7">C라인 2호기</td>
                                            <td class="es8">59 ea</td>
                                        </tr>
                                        <tr>
                                            <td class="es3">A라인 3호기</td>
                                            <td class="es4">71 ea</td>
                                            <td class="es5">B라인 3호기</td>
                                            <td class="es6">68 ea</td>
                                            <td class="es7">C라인 3호기</td>
                                            <td class="es8">61 ea</td>
                                        </tr>
                                        <tr>
                                            <td class="es3">A라인 4호기</td>
                                            <td class="es4">59 ea</td>
                                            <td class="es5">B라인 4호기</td>
                                            <td class="es6">67 ea</td>
                                            <td class="es7">C라인 4호기</td>
                                            <td class="es8">81 ea</td>
                                        </tr>
                                    </table>
                                </div>

                                <div class="date_ssBox_tit">품목별 주간 총 생산량</div>
                                <select class="pm_week" style="margin-left: 20px;">
                                    <option value="1">싹싹지우개</option>
                                    <option value="2">처음처럼지우개</option>
                                    <option value="3">우유빛지우개</option>
                                    <option value="4">뭐든지우개</option>
                                    <option value="5">리셋지우개</option>
                                </select>
                                <div class="ssTotal" id="ssTotal2">213ea</div>
                            </div>
                            <!-- 월별,품목별 총생산량 박스 -->
                            <div class="date_ssBox hide" id="date_ssList3">
                                <div class="date_ssBox_tit">월별 생산량</div>
                                <div class="date_ssTable">
                                    <table>
                                        <tr>
                                            <th class="es3">설비명</th>
                                            <th class="es4">생산량</th>
                                            <th class="es5">설비명</th>
                                            <th class="es6">생산량</th>
                                            <th class="es7">설비명</th>
                                            <th class="es8">생산량</th>
                                        </tr>
                                        <tr>
                                            <td class="es3">A라인 1호기</td>
                                            <td class="es4">246 ea</td>
                                            <td class="es5">B라인 1호기</td>
                                            <td class="es6">278 ea</td>
                                            <td class="es7">C라인 1호기</td>
                                            <td class="es8">263 ea</td>
                                        </tr>
                                        <tr>
                                            <td class="es3">A라인 2호기</td>
                                            <td class="es4">269 ea</td>
                                            <td class="es5">B라인 2호기</td>
                                            <td class="es6">283 ea</td>
                                            <td class="es7">C라인 2호기</td>
                                            <td class="es8">258 ea</td>
                                        </tr>
                                        <tr>
                                            <td class="es3">A라인 3호기</td>
                                            <td class="es4">304 ea</td>
                                            <td class="es5">B라인 3호기</td>
                                            <td class="es6">285 ea</td>
                                            <td class="es7">C라인 3호기</td>
                                            <td class="es8">294 ea</td>
                                        </tr>
                                        <tr>
                                            <td class="es3">A라인 4호기</td>
                                            <td class="es4">279 ea</td>
                                            <td class="es5">B라인 4호기</td>
                                            <td class="es6">286 ea</td>
                                            <td class="es7">C라인 4호기</td>
                                            <td class="es8">283 ea</td>
                                        </tr>
                                    </table>
                                </div>
                                <div class="date_ssBox_tit">품목별 월 총 생산량</div>
                                <select class="pm_month" style="margin-left: 20px;">
                                    <option value="1">싹싹지우개</option>
                                    <option value="2">처음처럼지우개</option>
                                    <option value="3">우유빛지우개</option>
                                    <option value="4">뭐든지우개</option>
                                    <option value="5">리셋지우개</option>
                                </select>
                                <div class="ssTotal" id="ssTotal3">935ea</div>
                            </div>
                            <!-- 월별 총주문량 박스 -->
                            <div class="date_ssBox hide" id="date_ssList4">
                                <div class="date_ssBox_tit">품목 별 월 판매량</div>
                                <div class="sale_ssTable">
                                    <table>
                                        <tr>
                                            <th class="es1">품목명</th>
                                            <th class="es2">판매량</th>
                                        </tr>
                                        <tr>
                                            <td class="es1">싹싹지우개</td>
                                            <td class="es2">1250 ea</td>
                                        </tr>
                                        <tr>
                                            <td class="es1">처음처럼지우개</td>
                                            <td class="es2">1500 ea</td>
                                        </tr>
                                        <tr>
                                            <td class="es1">우유빛지우개</td>
                                            <td class="es2">2000 ea</td>
                                        </tr>
                                        <tr>
                                            <td class="es1">뭐든지우개</td>
                                            <td class="es2">1000 ea</td>
                                        </tr>
                                        <tr>
                                            <td class="es1">리셋지우개</td>
                                            <td class="es2">700 ea</td>
                                        </tr>
                                    </table>
                                </div>
                                <div class="date_ssBox_tit">품목별 월 총 주문량</div>
                                <select class="item_sl pm_month_sel">
                                    <option value="1">싹싹지우개</option>
                                    <option value="2">처음처럼지우개</option>
                                    <option value="3">우유빛지우개</option>
                                    <option value="4">뭐든지우개</option>
                                    <option value="5">리셋지우개</option>
                                </select>
                                <div class="ssTotal" id="ssTotal4">1500ea</div>
                            </div>

                        </div>
                        <!-- 가동설비현황 박스 -->
                        <div class="ingBox">
                            <div class="pr_boxTit">가동 설비 현황</div>
                            <hr>
                            <div class="ssTable">
                                <table>
                                    <tr>
                                        <th class="es1">설비명</th>
                                        <th class="es2">가동상태</th>
                                    </tr>
                                    <tr>
                                        <td class="es1">A라인 1호기</td>
                                        <td class="es2">가동중</td>
                                    </tr>
                                    <tr>
                                        <td class="es1">A라인 2호기</td>
                                        <td class="es2">가동중</td>
                                    </tr>
                                    <tr>
                                        <td class="es1">A라인 3호기</td>
                                        <td class="es2 stop">정지(유휴시간)</td>
                                    </tr>
                                    <tr>
                                        <td class="es1">A라인 4호기</td>
                                        <td class="es2">가동중</td>
                                    </tr>
                                    <tr>
                                        <td class="es1">A라인 5호기</td>
                                        <td class="es2">가동중</td>
                                    </tr>
                                    <tr>
                                        <td class="es1">A라인 6호기</td>
                                        <td class="es2">가동중</td>
                                    </tr>
                                    <tr>
                                        <td class="es1">B라인 1호기</td>
                                        <td class="es2">가동중</td>
                                    </tr>
                                    <tr>
                                        <td class="es1">B라인 2호기</td>
                                        <td class="es2">가동중</td>
                                    </tr>
                                    <tr>
                                        <td class="es1">B라인 3호기</td>
                                        <td class="es2">가동중</td>
                                    </tr>
                                    <tr>
                                        <td class="es1">B라인 4호기</td>
                                        <td class="es2">가동중</td>
                                    </tr>
                                    <tr>
                                        <td class="es1">C라인 1호기</td>
                                        <td class="es2 stop">정지(유휴시간)</td>
                                    </tr>
                                    <tr>
                                        <td class="es1">C라인 2호기</td>
                                        <td class="es2">가동중</td>
                                    </tr>
                                    <tr>
                                        <td class="es1">C라인 3호기</td>
                                        <td class="es2">가동중</td>
                                    </tr>
                                    <tr>
                                        <td class="es1">C라인 4호기</td>
                                        <td class="es2">가동중</td>
                                    </tr>
                                    <tr>
                                        <td class="es1">A라인 1호기</td>
                                        <td class="es2">가동중</td>
                                    </tr>
                                </table>
                            </div>
                        </div>
                    </div>

                </div>
            </div>

        </div>
    </div>

</body>

</body>

</html>