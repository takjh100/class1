<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<!-- 여기에 css,js 파일옮기기 -->
<link rel="stylesheet" href="Production management_tak.css">
<script src="pm_popup_tak.js"></script>
<!-- <script src="Production management_tak.js"></script> -->

</head>

<body>
	<!-- 생산라인수정창 -->
	<div class="ssretouch_box">
		<dlv class="pm_correction">
		<div class="boxTit">생산 관리</div>
		<div class="pm_ssmanu">
			<form method="post" action="tb_pr_mt">
				<div>
					<div class="pm_correction_con">
						<div>라인 :</div>
						<div>
							<select name="LIUN_NM">
								<option value="A라인1호기">A라인 1호기</option>
								<option value="A라인2호기">A라인 2호기</option>
								<option value="A라인3호기">A라인 3호기</option>
								<option value="B라인1호기">B라인 1호기</option>
								<option value="B라인2호기">B라인 2호기</option>
								<option value="B라인3호기">B라인 3호기</option>
								<option value="C라인1호기">C라인 1호기</option>
								<option value="C라인2호기">C라인 2호기</option>
								<option value="C라인3호기">C라인 3호기</option>
							</select>
						</div>
					</div>
					<div class="pm_correction_con">
						<div style="width: 80px;">생산 번호 :</div>
						<div>
							<select name="PROD_CD">
								<option value="${PROD_CD }">${PROD_CD }</option>

							</select>
						</div>
					</div>
				</div>
				<div class="pm_correction_con">
					<div style="width: 100px;">제품코드:</div>
					<select class="itemCd" name="ITEM_CD">
						<option value="SS-01">SS-01</option>
						<option value="HH-01">HH-01</option>
					</select>
					<!-- <div class="itemCd" type="text" style="width: 50px;">SS-01</div> -->
				</div>
				<div class="pm_correction_con">
					<div style="width: 100px;">생산시작시간:</div>
					<input id="newDate" type="text" style="color: gray;" name="PROD_STRT_TIME" value="현재 시간">
				</div>
				<div class="pm_correction_con">
					<div style="width: 100px;">생산자:</div>
					<select name="WORK_NM">
						<option value="김잔업">김잔업</option>
						<option value="박퇴근">박퇴근</option>
						<option value="이출근">이출근</option>
						<option value="신조퇴">신조퇴</option>
						<option value="차반차">차반차</option>
					</select>
				</div>
				<div class="pm_correction_con">
					<div style="width: 100px;">품명:</div>
					<select class="itemNm" name="ITEM_NM">
						<option value="싹싹지우개">싹싹지우개</option>
						<option value="하츄핑지우개">하츄핑지우개</option>
					</select>
				</div>
				<div class="pm_correction_con">
					<div style="width: 100px;">생산량 :</div>
					<input name="PROD_QNTT" value="">
				</div>
				<div class="pm_correction_but">
					<select class="pm_correction_but_con" name="command">
						<option type="1100" value="insert">시작</option>
						<option type="1100" value="update">수정</option>
						<option type="1100" value="complete">완료</option>
					</select>
					<input type="hidden" name="type" value="${type}">
					<div class="end" style="margin: 0;">
						<input class="pm_correction_but_con" type="submit" value="등록">
					</div>
				</div>
			</form>
		</div>
	</dlv>
	</div>
</body>

</html>
