<%@ page language="java" contentType="text/html; charset=Utf-8"
    pageEncoding="Utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=Utf-8">
<title>Insert title here</title>
</head>
<body>


<link href="indexTemplate.css" rel="stylesheet">
<form action="check" method="post">
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
         
         
          <table    align="center" width="400px">
       
        <tr>
        <td align="center" colspan="2" >
        <font color="yellow" size="6">INFORMACIJE</font>  </td>
           </tr>
           
           <tr >
		<td colspan="2" height="20px">
         </td>
         </tr>
           
           
          
         
         <tr>
           <td align="left" > <font size="4">Unesite broj pošiljke:</font> </td>
           
           <td align="left"><input type="text" name="id"></td>
         </tr>
         
         <tr>
         
         <td>
         </td>
         
         <td align="center"><input type="submit" value="Proveri"> 

</form></td>
         
         </tr>
         
         <tr>
         <td colspan="2" height="20px">
         
        <font size="4">
		<% String msg = (String)request.getAttribute("msg");
				if(msg != null && msg.length()>0){
				%>
				<%= msg %>
				<% } %>
		</font>
         
         </td>
         
         </tr>
         
		<tr >
		<td colspan="2" align="right">
			<a href="package.jsp"><font color="white" size="4" > Nazad </font> </a>
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