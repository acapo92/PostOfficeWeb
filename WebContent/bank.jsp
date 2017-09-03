<%@ page language="java" contentType="text/html; charset=Utf-8"
    pageEncoding="Utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=Utf-8">
<title>Insert title here</title>
</head>
<body>


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

<link href="indexTemplate.css" rel="stylesheet">

<body  background="http://locksmithdubai.org/wp-content/uploads/2016/09/Mailbox-lock-replacement.png">
	<div>
<div class="topnav">
		<ul>
			
			<li><a href="#contact" title="">Kontakt</a></li>
			
			<div>
				
				
				
				<!-- <p>Fancymonk</p> -->
				</span>
				</a>
			</div>
		</ul>
	</div>
	
	
<section id="main">
    <div class="fancy-monk">
      <h1>   </h1> 
   
      <div>
         <div class="signinup">
         
         
          <table  align="center" width="400px">
       
        <tr>
        <td align="center" colspan="2" >
        <font color="yellow" size="6">DOBRODOŠLI U BANKU</font>  </td>
           </tr>
           
           <tr >
		<td colspan="2" height="20px">
         </td>
         </tr>
           
           
           <tr>
           <td align="center" colspan="2"> Izaberite opciju: </td>
         </tr>
         
          <tr>
         
         <td>
                 <input align="middle"  type="button" name="go_to_payment" value ="        UPLATA        " onclick="onPaymentClick()" >
		</td>
		
		 <td>
				<input align="middle"  type="button" name="go_to_login" value ="        PROVERA/ISPLATA        " onclick="onCheckClick()" >
		</td>
	</tr>
	<tr >
		<td colspan="2" height="20px">
         </td>
         </tr>
		<tr >
		<td colspan="2" align="right">
			<a href="index.jsp"><font color="white" size="4" > Nazad </font> </a>
         </td>
         </tr>
         
         
        </table>
         
         
                          
         </div> 
      </div>
    </div>
  </section>
	</div>
	



</body>
</html>