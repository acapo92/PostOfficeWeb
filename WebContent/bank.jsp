<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1 align="center">DOBRODOSLI U BANKU</h1> <br>

<script type="text/javascript">

function onCheckClick(){
	
	window.location.replace("ClientLogIn.jsp");
	
}

</script>

<script type="text/javascript">

function onPaymentClick(){
	
	window.location.replace("Payment.jsp");
	
}

</script>

<input align="middle"  type="button" name="go_to_payment" value ="        UPLATA        " onclick="onPaymentClick()" >

<input align="middle"  type="button" name="go_to_login" value ="        PROVERA/ISPLATA        " onclick="onCheckClick()" >
<a href="index.jsp">BACK</a>

</body>
</html>