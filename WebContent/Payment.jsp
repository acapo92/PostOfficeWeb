<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="changeBalance" method="post">

suma<input type="text" name="sum">
racun<input type="text"  name="account">

<input type="submit" value="Uplati" name="send">
</form>
<% String msg = (String)request.getAttribute("msg");
				if(msg != null && msg.length()>0){
				%>
				<%= msg %>
				<% } %>
</body>
</html>