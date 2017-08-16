<%@page import="sun.misc.Cleaner"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%@ page import="factory.ClientDAO"%>
<%@ page import="model.Client"%>
<%@ page import = "java.util.*"%>

<%HttpSession sesija = request.getSession();
			Client client = (Client)sesija.getAttribute("Client");
if( client != null){
%>

<body>



Ime: <%= client.getName() %>
Prezime: <%= client.getLast_name() %>
Stanje na racunu: <%= client.getBalance() %>

<form action="changeBalance" method="post">

<input type="text" name="sum">
<input type="hidden" value="<%= client.getAccount() %>" name="account">
<input type="hidden" value="<%= client.getBalance() %>" name="balance">
<input type="submit" value="Isplati" name="send">
</form>
<% String msg = (String)request.getAttribute("msg");
				if(msg != null && msg.length()>0){
				%>
				<%= msg %>
				<% } %>

</body>


<%
} 
else{
	response.sendRedirect("index.jsp");
} 
  %>

</html>