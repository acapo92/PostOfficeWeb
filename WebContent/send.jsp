<%@ page language="java" contentType="text/html; charset=Utf-8"
    pageEncoding="Utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=Utf-8">
<title>Insert title here</title>
</head>
<body>



<form action="packageSent" method="post">
Ko salje:
<input type="text" name="sender" >
Ko prima:
<input type="text" name="recipient" >
Tezina:
<input type="text" name="weight" >
Nacin slanja:
<select name="wayToSending">
<option value="1">Preporuceno</option>
<option value="2">Hitno</option>
<option value="3">Vrednosno</option>
</select>

<input type="submit" value="Posalji">
</form>
<% String msg = (String)request.getAttribute("msg");
				if(msg != null && msg.length()>0){
				%>
				<%= msg %>
				<% } %>

<a href="package.jsp">BACK</a>
</body>
</html>