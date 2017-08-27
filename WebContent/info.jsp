<%@ page language="java" contentType="text/html; charset=Utf-8"
    pageEncoding="Utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=Utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="check" method="post">
Unesite broj pošiljke: <input type="text" name="id">
<input type="submit" value="Proveri"> 

</form>

<% String msg = (String)request.getAttribute("msg");
				if(msg != null && msg.length()>0){
				%>
				<%= msg %>
				<% } %>

</body>
</html>