<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<!-- 여기에 css,js 파일옮기기 -->
<link rel="stylesheet" href="Production management_tak.css">
<!-- <script src="Production management_tak.js"></script> -->

</head>

<body>
	<!-- 생산라인수정창 -->
	<div class="ssretouch_box">
		<dlv class="pm_correction">
		<div class="boxTit">생산 관리</div>
		<div class="pm_ssmanu">
			<form method="post" action="tb_pr_mt">
				<div class="ssTitle">생산 설비 관리</div>
				<div style="display: flex;">
					<div class="pm_correction_con">
                        <div>라인 :</div>
                        <select type="1100" name="command">
                            <option>A라인 1호기</option>
                            <option>A라인 2호기</option>
                            <option>A라인 3호기</option>
                            <option>B라인 1호기</option>
                            <option>B라인 2호기</option>
                            <option>B라인 3호기</option>
                            <option>C라인 1호기</option>
                            <option>C라인 2호기</option>
                            <option>C라인 3호기</option>
                        </select>
                    </div>
				</div>
				<div class="pm_correction_con">
					<div style="width: 100px;">제품코드:</div>
					<input type="text" placeholder="B25-0204-015">
				</div>
				<div class="pm_correction_con">
					<div style="width: 100px;">생산시작시간:</div>
					<input id="newDate" type="text" style="color: gray;" value="현재 시간">
				</div>
				<div class="pm_correction_con">
					<div style="width: 100px;">생산자:</div>
					<select>
						<option>김잔업</option>
						<option>박퇴근</option>
						<option>이출근</option>
						<option>신조퇴</option>
						<option>차반차</option>
					</select>
				</div>
				<div class="pm_correction_con">
					<div style="width: 100px;">품명:</div>
					<select>
						<option>싹싹지우개</option>
						<option>처음처럼지우개</option>
						<option>우유빛지우개</option>
						<option>뭐든지우개</option>
						<option>리셋지우개</option>
					</select>
				</div>
				<div class="pm_correction_but">
					<select class="pm_correction_but_con">
						<option>완료</option>
						<option>수정</option>
						<option>삭제</option>
						<option>초기화</option>
					</select> <input class="pm_correction_but_con" type="button" value="등록">
			</form>
		</div>
	</div>
	</dlv>
	</div>
</body>
<script>
	setInterval(
			function() {
				let currentDate = new Date();
				const formattedDate = `${currentDate.getFullYear()}-${currentDate.getMonth() + 1}-${currentDate.getDate()} ${currentDate.getHours()}:${currentDate.getMinutes()}:${currentDate.getSeconds()}`;
				let newDate = document.querySelector('#newDate').value = formattedDate;
				$("#count").text(time_text);
				time--;
			}, 1000);
	// let currentDate = new Date();
	// const formattedDate = `${currentDate.getFullYear()}-${currentDate.getMonth() + 1}-${currentDate.getDate()} ${currentDate.getHours()}:${currentDate.getMinutes()}:${currentDate.getSeconds()}`;
	// let newDate = document.querySelector('#newDate').value = formattedDate
</script>

</html>
