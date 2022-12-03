<html>
<head>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="styles/style.css">
	<title>login Page</title>
</head>
<body>

<!-- building two split screen for login -->
	<div class="row">
		<div class="col-6 left_side">
		</div>
		<div class="col-6">
			<!-- adding welcoming screen -->
			<div class="welcome_center">
			<h2>Welcome to Dashboard</h2>
			<p>Welcome back again! Please login to your account</p>
			</div>
			<div class="center-form">
				<form method="post" action="/Ecom/AdminLogin">
					<div class="form-group">
					<label>UserName</label>
					<input type="text" name="adminId" class="form-control">
					</div>
					<div class="form-group">
					<label>Password</label>
					<input type="password" name="password" class="form-control">
					</div>
					<button type="submit" class="text-center btn btn-outline-primary center">Login</button>
				</form>
			</div>
		</div>
</div>





</body>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"></script>
</html>