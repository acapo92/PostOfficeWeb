<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1 align="center">Dobrodosli u POSTEXPRES</h1> <br>

<script type="text/javascript">

function onSentClick(){
	
	window.location.replace("send.jsp");
	
}

</script>

<script type="text/javascript">

function onReceiveClick(){
	
	window.location.replace("receive.jsp");
	
}

</script>

</script>

<script type="text/javascript">

function informationClick(){
	
	window.location.replace("information.jsp");
	
}

</script>

<input align="middle"  type="button" name="go_to_sent" value ="        SLANJE        " onclick="onSentClick()" >

<input align="middle"  type="button" name="go_to_receive" value ="        PRIJEM        " onclick="onReceiveClick()" >

<input align="middle"  type="button" name="go_to_information" value ="        INFO        " onclick="informationClick()" >

<a href="index.jsp">BACK</a>
</body>
</html>