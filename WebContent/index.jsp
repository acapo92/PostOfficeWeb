<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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
	<div>
<div class="topnav">
		<ul>
			<li class="icon">
   				 <a href="javascript:void(0);" onclick="myFunction()">☰</a>
  			</li>
			<li><a href="#contact" title="">Contact</a></li>
			<li><a href="/forrestaurant/#" title="">For Restaurants</a></li>
			<li><a href="/forbusiness/#" title="">For Business</a></li>
			<div>
				<a href="/home">
				<span class="span-logo">
				<!-- <img src="./static/image/fancy_monk_logo_final.png" /> -->
				<!-- <img src="./static/fancymonk_logo/ic_fancy_monk_white.png" /> -->
				<img src="http://fancymonk.com/static/fancymonk_logo/ic_fancy_monk_white_small_128.png">
				<!-- <p>Fancymonk</p> -->
				</span>
				</a>
			</div>
		</ul>
	</div>
	
	
<section id="main">
    <div class="fancy-monk">
      <h1>POSTA SRBIJE</h1> 
      <div>
         <div class="signinup">
             <div>Not a member yet?</div>
             <div>Sign up now</div>
             <div>
                 <input align="middle"  type="button" name="go_to_bank" value ="        BANKA        " onclick="onBankClick()" >
                 <input  type="button" name="go_to_package" value ="        POSILJKE        " onclick="onPackageClick()" >
         </div> 
      </div>
    </div>
  </section>
	</div>
	



 
 

 
 
</body>
</html>