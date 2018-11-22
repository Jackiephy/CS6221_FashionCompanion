<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<meta name="Haoyuan&Luying" content="CS6221 Project_demo">
<meta http-equiv="X-UA-Compatible" content="IE=edge">

<title>Register|Clothcare|Your Personal Fashion Companion</title>
	
<link rel="stylesheet" href="${ctx}/css/bootstrap.min.css">
<link rel="stylesheet" href="${ctx}/css/animate.css">
<link rel="stylesheet" href="${ctx}/css/style.css">

<!-- Modernizr JS -->
<script src="${ctx}/js/lmodernizr-2.6.2.min.js"></script>
</head>

<body class="style-2">

<div class="container">
	<div class="row">
		<div class="col-md-4">
			<!-- Start Sign In Form -->
			<form action="${ctx}/registerCheck" class="fh5co-form animate-box" data-animate-effect="fadeInLeft" method="post">
				<h2>Sign Up</h2>
				<!--  
				<div class="form-group">
					<div class="alert alert-success" role="alert">Your info has been saved.</div>
				</div>
				-->
				<div class="form-group">
					<label for="name" class="sr-only">Name</label>
					<input type="text" class="form-control" id="name" placeholder="Name" autocomplete="off">
				</div>
				<div class="form-group">
					<label for="email" class="sr-only">Email</label>
					<input type="email" class="form-control" id="email" placeholder="Email" autocomplete="off">
				</div>
				<div class="form-group">
					<label for="password" class="sr-only">Password</label>
					<input type="password" class="form-control" id="password" placeholder="Password" autocomplete="off">
				</div>
				<div class="form-group">
					<label for="re-password" class="sr-only">Re-type Password</label>
					<input type="password" class="form-control" id="re-password" placeholder="Re-type Password" autocomplete="off">
				</div>
				<div class="form-group">
					<label for="remember"><input type="checkbox" id="remember"> Remember Me</label>
				</div>
				<div class="form-group">
					<p>Already registered? <a href="index2.html">Sign In</a></p>
				</div>
				<div class="form-group">
					<input type="submit" value="Sign Up" class="btn btn-primary">
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
<script src="${ctx}/js/jquery.min.js"></script>
<!-- Bootstrap -->
<script src="${ctx}/js/bootstrap.min.js"></script>
<!-- Placeholder -->
<script src="${ctx}/js/jquery.placeholder.min.js"></script>
<!-- Waypoints -->
<script src="${ctx}/js/jquery.waypoints.min.js"></script>
<!-- Main JS -->
<script src="${ctx}/js/main.js"></script>

</body>
</html>
