<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<meta name="Haoyuan&Luying" content="CS6221 Project_demo">
<meta http-equiv="X-UA-Compatible" content="IE=edge">

<title>Login|Clothcare|Your Personal Fashion Companion</title>

<link rel="stylesheet" href="${ctx}/css/lbootstrap.min.css">
<link rel="stylesheet" href="${ctx}/css/lanimate.css">
<link rel="stylesheet" href="${ctx}/css/lstyle.css">

<!-- Modernizr JS -->
<script src="${ctx}/js/lmodernizr-2.6.2.min.js"></script>
<script type="text/javascript">
		 $(function(){
		 	 $("#vimg").click(function(){
		 		 $(this).attr("src","${ctx}/createCode?timer="+new Date().getTime());
		 	 }).mouseover(function(){
		 		  $(this).css("cursor","pointer");
		 	 });
		 	 
			 $(document).keydown(function(event){
				 if(event.keyCode == 13){
					 $("#login_id").trigger("click");
				 }
			 });
			 
			 $("#login_id").bind("click",function(){
				 var uname = $("#uname").val();
				 var password = $("#password").val();
				 var vcode = $("#vcode").val();
				 
				 var msg = "";
				 if(!/^\w{2,20}$/.test(uname.trim())){
					 msg = "登录名必须是2-20个的字符";
				 }else if(!/^\w{6,20}$/.test(password)){
					 msg = "密码必须是6-20个的字符";
				 }else if(!/^\w{4}$/.test(vcode)){
					 msg = "验证码格式不正确";
				 }
				 
				 if(msg!=""){
					 $.messager.alert("LoginInfo","<span style='color:red;'>"+msg+"</span>","error");
					 return ; 
				 }
				
				 var params = $("#loginForm").serialize();
				 
				 $.ajax({
					 url:"${ctx}/loginAjax",
					 type: "post",
					 dataType : "json",
					 data : params ,
					 async : true ,
					 success : function(data){
						 if(data.status == 1){
							  window.location = "${ctx}/main/index";
						 }else{
							 $("#vimg").trigger("click");
							 $.messager.alert("Tips","<span style='color:red;'>"+data.tip+"</span>","error");
						 }
						
					 },error : function(){
						 $.messager.alert("Tips","<span style='color:red;'>Login Failure</span>","error");
					 }
				 })
					 
			 })
			 
		 
		 })
	 
</script>

</head>

<body class="style-2">

<div class="container">
	<div class="row">
		<div class="col-md-4">
			<!-- Start Login Form -->
			<form id="loginForm" action="${ctx}/loginCheck" class="fh5co-form animate-box" data-animate-effect="fadeInLeft" method="post">
				<h2>Member Login</h2>
				<div class="form-group">
					<label for="uname" class="sr-only">E-mail</label>
					<input type="text" class="form-control" id="uname" name="uname" placeholder="E-mail" autocomplete="off">
				</div>
				<div class="form-group">
					<label for="password" class="sr-only">Password</label>
					<input type="password" class="form-control" id="password" name="password" placeholder="Password" autocomplete="off">
				</div>
				<div class="form-group">
					<input type="text" class="form-control" id="vcode" name="vcode" autocomplete="off">
					<span id="basic-addon2"><img class="check-code" id="vimg" alt="" src="${ctx}/createCode"></span>
				</div>
				<div class="form-group">
					<label for="remember"><input type="checkbox" id="remember"> Remember Me</label>
				</div>
				<div class="form-group">
					<p>Not registered? <a href="register.html">Register</a> | <a href="forget.html">Forgot Password?</a></p>
				</div>
				<div class="form-group">
				    <button id="login_id" type="submit" class="btn btn-primary">Login</button>
				</div>
				</form>
			<!-- END Sign In Form -->
			</div>
		</div>
		<div class="row" style="padding-top: 60px; clear: both;">
			<div class="col-md-12 text-center"><p>CS6221  <script>document.write(new Date().getFullYear());</script>  Fashion Companion Team All rights reserved </p></div>
		</div>
</div>
	
<!-- jQuery -->
<script src="${ctx}/js/ljquery.min.js"></script>
<!-- Bootstrap -->
<script src="${ctx}/js/lbootstrap.min.js"></script>
<!-- Placeholder -->
<script src="${ctx}/js/ljquery.placeholder.min.js"></script>
<!-- Waypoints -->
<script src="${ctx}/js/ljquery.waypoints.min.js"></script>
<!-- Main JS -->
<script src="${ctx}/js/lmain.js"></script>

</body>
</html>