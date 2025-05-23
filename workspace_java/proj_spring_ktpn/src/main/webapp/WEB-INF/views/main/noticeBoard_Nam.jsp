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
<!-- 여기에 대시보드 css 파일옮기기 -->
<link rel="stylesheet" href="resources/css/noticeBoard_Nam.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/chart.js@4.4.7/dist/chart.umd.min.js"></script>
<script src="resources/js/noticeBoard_Nam.js"></script>
<style>
/******************
        모바일 버전 구현(불량쪽 차트는 ....)
        *******************/
</style>
</head>

<body>

	<div class="menuPage-con">
		<!-- html 들어갈 곳 -->
		<div class='pageAll'>
			<div class='boardarea'>
				<div class="margin-con">
					<div class='pagecon'>
						<p id='pageinfo'>공지사항</p>
					</div>
					<div class='middle_board'>
						<div class='searcharea'>
							<div class='selectbox'>
								<form>
									<select name='viewfilter' id='viewfilter'>
										<option value='allview'>모두</option>
										<option value='tilteview'>제목</option>
										<option value='contentview'>내용</option>
										<option value='writeuserview'>작성자</option>
									</select>
								</form>
							</div>
							<div class='fillvalue'>
								<input type='text' id='fillvalue' placeholder="검색어를 입력해주세요">
							</div>
							<div class='searchB'>
								<button type="button" id='search'>검색</button>
							</div>
						</div>
						<hr>
						<div>
							<table class='boardtable'>
								<tr class='boardlist th' style="height: 30px;">
									<td class='num'>번호</td>
									<td class='writetitle'>제목</td>
									<td class='writeuser'>작성자</td>
									<td class='writedate'>작성일</td>
									<td class='viewcount'>조회수</td>
								</tr>
								<tr class='boardlist' style="height: 30px;">
									<td class='num'>3</td>
									<td class='writetitle'>오늘 식단표</td>
									<td class='writeuser'>직원1</td>
									<td class='writedate'>2025-02-03</td>
									<td class='viewcount'>47</td>
								</tr>
								<tr class='boardlist' style="height: 30px;">
									<td class='num'>2</td>
									<td class='writetitle'>신규직원 오리엔테이션 안내</td>
									<td class='writeuser'>직원1</td>
									<td class='writedate'>2025-02-03</td>
									<td class='viewcount'>65</td>
								</tr>
								<tr class='boardlist' style="height: 30px;">
									<td class='num'>1</td>
									<td class='writetitle'>사내규정</td>
									<td class='writeuser'>직원1</td>
									<td class='writedate'>2025-02-03</td>
									<td class='viewcount'>59</td>
								</tr>
							</table>
						</div>
						<div class="page-num-con">
							<div class="page-num">
								<div class="page pre-page">< 이전</div>
								<div class="page">
									<span class="num bold">1</span> <span class="num">2</span> <span
										class="num">3</span> <span class="num">4</span> <span
										class="num">5</span>
								</div>
								<div class="page next-page">다음 ></div>
							</div>
							<div class="add-con">
								<div class="add">추가</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>

</html>