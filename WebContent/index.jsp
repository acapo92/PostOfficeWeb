<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h1 align="center">POSTA SRBIJE</h1>

<script type="text/javascript">

function onBankClick(){
	
	window.location.replace("bank.jsp");
	
}

</script>


<script type="text/javascript">

function onPackageClick(){
	
	window.location.replace("package.jsp");
	
}


</script>

 <input align="middle"  type="button" name="go_to_bank" value ="        BANKA        " onclick="onBankClick()" >
 
 <input  type="button" name="go_to_package" value ="        POSILJKE        " onclick="onPackageClick()" >
 
 
</body>
</html>