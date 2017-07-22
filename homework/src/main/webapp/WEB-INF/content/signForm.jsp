<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>注册</title>

    <meta name="description" content="Source code generated using layoutit.com">
    <meta name="author" content="LayoutIt!">

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
</head>
<body>
<div id="div1">
<font color="#FF5809"><h3>注册页面</h3></font>
<form action="sign" method="post">
	<div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
			<font color="#FF5809"><h3>
				欢迎来到饰品小屋！
			</h3></font>
			<form class="form-horizontal" role="form">
				<div class="form-group">
							 
							<label for="inputEmail3" class="col-sm-2 control-label">
								<font color="#FF5809">Email：</font>
							</label>
							<div class="col-sm-10">
								<input type="email" class="form-control" id="loginname" name="loginname">
							</div>
						</div>
				<br>
				<br>
				<div class="form-group">
					 
					<label for="inputEmail3" class="col-sm-2 control-label">
						<font color="#FF5809">地址：</font>
					</label>
					<div class="col-sm-10">
						<input type="text" id="address" name="address"class="form-control" >
					</div>
				</div>
				<br>
				<br>
				<div class="form-group">
					 
					<label for="inputEmail3" class="col-sm-2 control-label">
						<font color="#FF5809">电话号码：</font>
					</label>
					<div class="col-sm-10">
						<input type="text" id="phone" name="phone"class="form-control" >
					</div>
				</div>
				<br>
				<br>
				<div class="form-group">
					 
					<label for="inputPassword3" class="col-sm-2 control-label">
						<font color="#FF5809">密码：</font>
					</label>
					<div class="col-sm-10">
						<input type="password" id="password" name="password" class="form-control" id="signpwd">
					</div>
				</div>
				<br>
				<br>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						 
						<button type="submit" class="btn btn-default">
							<font color="#FF5809">注册</font>
						</button>
					</div>
				</div>
			</form>
		</div>
	</div>
</div>

    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/scripts.js"></script>
</form>
</body>
</html>