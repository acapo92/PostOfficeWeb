<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>



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
	
	window.location.replace("info.jsp");
	
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
         
         
          <table   align="center" width="400px">
       
        <tr>
        <td align="center" colspan="3" >
        <font color="yellow" size="6">POSTEXPRESS</font>  </td>
           </tr>
           
           <tr >
		<td colspan="3" height="20px">
         </td>
         </tr>
           
           
           <tr>
           <td align="center" colspan="3"> Izaberite opciju: </td>
         </tr>
         
          <tr>
         
         <td>
         <input align="middle"  type="button" name="go_to_sent" value ="        SLANJE        " onclick="onSentClick()" >
		</td>
		
		 <td>
		 <input align="middle"  type="button" name="go_to_receive" value ="        PRIJEM        " onclick="onReceiveClick()" >
		 
		</td>
		
		<td>
		 		<input align="middle"  type="button" name="go_to_information" value ="        INFO        " onclick="informationClick()" >
		 
		</td>
	</tr>
	<tr >
		<td colspan="3" height="20px">
         </td>
         </tr>
		<tr >
		<td colspan="3" align="right">
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