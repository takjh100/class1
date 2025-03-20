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
					<div class="pm_correction_con" style="margin: 10px 20px 5px 0;">
						<div style="margin-right: 60px;">라인 :</div>
						<div>
							<select name="LIUN_NM">
								<c:forEach var="dto" items="${LineList }">
									<option value="${dto.mt_mng_nm }">${dto.mt_mng_nm }</option>
								</c:forEach>
							</select>
						</div>

					</div>
					<div class="pm_correction_con" style="margin: 10px 20px 5px 0;">
						<div style="width: 80px;">생산 코드 :</div>
						<div>
							<select id="select" name="PROD_CD" onchange="changeI()">
								<c:forEach var="dto" items="${workList }">
									<option value="${dto.prod_cd }" 
											indc_qntt1="${dto.indc_qntt }"
											>
											${dto.prod_cd }
											</option>
								</c:forEach>
							</select>
						</div>
					</div>
				</div>
				
				<script>
				function changeI() {
					
					var select = document.getElementById('select');
					var select_option = select.options[select.selectedIndex];
					
					
					var indc_qntt = select_option.getAttribute("indc_qntt1");
					console.log("indc_qntt : ", indc_qntt);
					document.getElementById('indc_qntt').value = indc_qntt;
				}
				</script>
				
				<input type="hidden" id="indc_qntt" name="indcQntt" value="${dto.indc_qntt }">
				
				<div class="pm_correction_con">
					<div style="width: 100px;">품목코드:</div>
					<select class="itemCd" name="ITEM_CD">
						<c:forEach var="dto" items="${StandardList }">
							<option value="${dto.mt_mng_cd }">${dto.mt_mng_cd }</option>
						</c:forEach>
					</select>
					<!-- <div class="itemCd" type="text" style="width: 50px;">SS-01</div> -->
				</div>
				<div class="pm_correction_con">
					<div style="width: 100px;">생산시작시간:</div>
					<input id="newDate" type="text" style="color: gray;"
						name="PROD_STRT_TIME" value="현재 시간">
				</div>
				<div class="pm_correction_con">
					<div style="width: 100px;">생산자:</div>
					<select name="WORK_NM">
						<c:forEach var="dto" items="${wemberList }">
							<option value="${dto.mbr_nm }">${dto.mbr_nm }</option>
						</c:forEach>
					</select>
				</div>
				<div class="pm_correction_con">
					<div style="width: 100px;">품명:</div>
					<select class="itemNm" name="ITEM_NM">
						<c:forEach var="dto" items="${StandardList }">
							<option value="${dto.mt_mng_nm }">${dto.mt_mng_nm }</option>
						</c:forEach>
					</select>
				</div>

				<div class="ttssText1">
					<div class="pm_correction_con" style="margin: 10px 20px 5px 0;">
						<div class="sstext" style="width: 100px;">생산량 :</div>
						<input name="prodQntt" value="">
					</div>
				</div>
				<div class="ttssText2 hide">
					<div class="pm_correction_con" style="margin: 10px 20px 5px 0;">
						<div class="sstext" style="width: 100px;">불량률 :</div>
						<input name="DFC_RT" value="">
					</div>
				</div>
				<div class="pm_correction_but">
					<select class="pm_correction_but_con" name="command">
						<option value="insert">시작</option>
						<option value="update">수정</option>
						<option value="complete">완료</option>
					</select> <input type="hidden" name="type" value="${type}">
					<div class="end" style="margin: 0;">
						<input class="pm_correction_but_con" type="submit" value="등록">
						
						<!--<button type="submit" name="command", value="update">등록</button> -->
					</div>
				</div>
			</form>
		</div>
		</dlv>
	</div>
</body>

</html>
