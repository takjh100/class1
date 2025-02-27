<!-- 디렉티브 태그 -->
<%@ page
    language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import= "java.util.List"
    import= "java.util.ArrayList"
%>
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

<!-- 스크립틀릿 scriptlet -->
<% 
// 여기는 java 땅입니다
System.out.println("java");
List list = new ArrayList();
%>

<%
for(int i=0; i<9; i++){
%>
    <h1>
    <% out.write(""+i); %>
    <% out.println(""+i); %>
    </h1>
<%     	
}
%>
<%
      int a = 10;
      System.out.println("a : "+ a);
%>

<div><% out.print(a); %> </div>
<div><%= a %> </div>

<%!
      //선언문
      //필드선언
      String str = "글씨";
      //메소드 선언
      String getStr(){
    	  return this.str;
      }
%>

<%@ include file="header.jsp" %>

<!-- 
   jsp에 직접 text에 1234라는 값을 보내고 
   jsp에서 html로 그값을 출력하시오 
-->


<% String text = request.getParameter("text");
		System.out.println("text : " + text);
%>
<div><%= text %> </div>


</body>
</html>