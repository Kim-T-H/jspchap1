<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@page import="java.util.Calendar"%>
<%-- /WebContent/currentTime.jsp --%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>현재 시간</title>
</head>
<body>
<% //자바 코드
  Calendar c = Calendar.getInstance();
  int h = c.get(Calendar.HOUR_OF_DAY);
  int m = c.get(Calendar.MINUTE);
  int s = c.get(Calendar.SECOND);
%>
<h1>현재 시간은 <%=h %>시<%=m %>분<%=s %>초 입니다.</h1>
</body>
</html>