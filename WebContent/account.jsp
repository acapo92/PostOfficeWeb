<%@page import="sun.misc.Cleaner"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
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

<link href="indexTemplate.css" rel="stylesheet">

<body background="http://locksmithdubai.org/wp-content/uploads/2016/09/Mailbox-lock-replacement.png">
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
        <td align="left" colspan="2" >
        <font color="white" size="4">	Klijent: <%= client.getName()  %> <%= client.getLast_name() %></font>  </td>
           </tr>
           
                   
           
           <tr>
           <td  align="left" colspan="2"  >  
           <font size="4">Broj računa: <%= client.getAccount() %></font>
           
           </td>
         </tr>
         
         
         
         
           <tr>
           <td align="left" colspan="2" ><font size="4">Stanje na računu: <%= client.getBalance() %> din.</font>

</tr>
         
         
         <tr>
         <td height="10px" colspan="2"></td>
         </tr>
         
         
          <tr>
       
         <td align="left">
         <font size="4">
               Uneti sumu za isplatu:
</font>
		</td>
		
		<td align="left">
<form action="changeBalance" method="post">

<input type="text" name="sum">
<input type="hidden" value="<%= client.getAccount() %>" name="account">
<input type="hidden" value="<%= client.getBalance() %>" name="balance">
</td>
		
		
		</tr>
		
		<tr>
		 <td colspan="2">
				<input type="submit" value="Isplati" name="send">
</form>
		</td>
        
         
         
           <tr >
		<td colspan="2"  >
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
			<a href="Clinet_Log_in"><font color="white" size="4" > Odjava </font> </a>
         </td>
         </tr>
         
         
        </table>
         
         
                          
         </div> 
      </div>
    </div>
  </section>
	</div>









</body>


<%
} 
else{
	response.sendRedirect("index.jsp");
} 
  %>

</html>