<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<link rel="stylesheet" href="Production management_tak.css">
<script src="pr_popup_tak.js"></script>
<!-- <script src="Production management_tak.js"></script> -->
</head>

<body>
	<div class="ssretouch_box">
		<dlv class="pm_correction">
		<div class="boxTit">생산 관리</div>
		<div class="pr_ssmanu">
			<div class="ssTitle">생산 일정 관리</div>
			<form method="post" action="tb_pr_mt">
				<div class="pr_correction_con">
					<div style="width: 100px;">품명:</div>
					<select class="itemNm" type="1110" name="ITEM_NM">
						<option value="싹싹지우개">싹싹지우개</option>
						<option value="하츄핑지우개">하츄핑지우개</option>
					</select>
				</div>
				<div class="pr_correction_con">
					<div style="width: 100px;">품번 코드:</div>
					<select class="itemCd" type="1110" name="ITEM_CD">
						<option value="SS-01">SS-01</option>
						<option value="HH-01">HH-01</option>
					</select>
				</div>
				<div class="pr_correction_con">
					<div style="width: 100px;">목표 수량:</div>
					<input type="text" style="height: 18px;" name="INDC_QNTT" value="">
				</div>
				<div class="pr_correction_con">
					<div style="width: 150px;">기한설정:</div>
					<div class="pr_date">
						<input type="date" name="PROD_STRT_TIME" style="height: 20px; width: 60%;">&nbsp;&nbsp;부터&nbsp;&nbsp;
						<input type="date" name="PROD_END_TIME" style="height: 20px; width: 60%;">&nbsp;&nbsp;까지&nbsp;&nbsp;
					</div>
				</div>
				<div class="pr_correction_but" style="margin: 20px 0 0;">
					<div class="add">추가</div>
					<div class="retouch">수정</div>
					<div class="delete">삭제</div>
				</div>
			</form>
		</div>
	</div>
	</div>
</body>
<script>
	
</script>

</html>