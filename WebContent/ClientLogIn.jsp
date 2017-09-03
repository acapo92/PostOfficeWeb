<%@ page language="java" contentType="text/html; charset=Utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=Utf-8">
<title>Insert title here</title>
</head>
<body>





<form action="Clinet_Log_in" method="post">

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
         
         
          <table  align="center" width="400px" >
       
        <tr>
        <td align="center" colspan="2" >
        <font color="yellow" size="4">PRIJAVA</font>  </td>
           </tr>
           
           <tr >
		<td colspan="2" height="10px">
         </td>
         </tr>
           
           
           <tr>
           <td align="left"  >Korisničko ime:
</td>
 <td align="left" colspan="2" ><input type="text" name="username" > 
</td>
</tr>
         
          <tr>
       
         <td align="left">
         
                 Unesi šifru:

		</td>
		
		<td align="left">
 <input type="password" name="pass" >
</td>
		
		
		</tr>
		
		<tr>
		 <td colspan="2">
				<input type="submit" value="Log in" >
</form>
		</td>
		
	</tr>
	<tr >
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
			<a href="bank.jsp"><font color="white" size="4" > Nazad </font> </a>
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