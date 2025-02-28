<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page 
    import= "java.util.List"
    import= "java.util.ArrayList"
    import= "java.util. * "
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<!-- 액션 태그 -->
<!-- 
     class의 클래스를 생성해서 
     id를 key로
     scope에 setAttribute 해줌
     scope 속성을 생략하면 page가 기본값이다
 -->

<!-- id는 키값, 클래스를 new해서 dto에 넣은 것 -->
<jsp:useBean id="dto" class="kr.or.human.a.MamberDTO" scope="page"/>
<!-- name는 키값 property는 대문자로 바꿔서 setID 처럼 붙여준다  -->
<jsp:setProperty name="dto" property="id" value="idid"/>
\${ dto.id } : ${ dto.id }<br>
\${ dto["id"] } : ${ dto["id"] }<br>
<jsp:setProperty name="dto" property="pw" value='<%= request.getParameter("pw") %>'/><br>
<jsp:setProperty name="dto" property="pw" value="${param.pw}"/><br>
jsp:getProperty : <jsp:getProperty name="dto" property="pw"/><br>


<!--property="*" : 모두 다 set해준다 -->
<jsp:useBean id="dto4" class="kr.or.human.a.MamberDTO" scope="page"/>
<jsp:setProperty name="dto4" property="*"/>
${ dto4.id }<br>
${ dto4.pw }<br>
${ dto4.id[0] }<br>
${ dto4.id[1] }<br>


</body>
</html>