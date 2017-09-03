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

function onBankClick(){
	
	window.location.replace("bank.jsp");
	
}

</script>


<script type="text/javascript">

function onPackageClick(){
	
	window.location.replace("package.jsp");
	
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
      <h1>   </h1>  &nbsp;&nbsp;
      &nbsp;
      <div>
         <div class="signinup">
         <table>
         <tr>
           <font color="yellow" size="6">  DOBRODOŠLI </font>  <br><br>
           Izaberite opciju:
         <br><br>
         <input align="middle"  width="" type="button" name="go_to_bank"  value ="         BANKA         " onclick="onBankClick()" >
         
         
              
                 <input  type="button" name="go_to_package" value ="        POŠILJKE        " onclick="onPackageClick()" >
         
         </table>
         
         
                          
         </div> 
      </div>
    </div>
  </section>
	</div>
	



 
 

 
 
</body>
</html>