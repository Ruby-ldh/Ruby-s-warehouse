<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Amaze UI Admin index Examples</title>
  <meta name="description" content="这是一个 index 页面">
  <meta name="keywords" content="index">
<meta name="viewport" content="width=device-width,initial-scale=1.0,maximum-scale=1.0,minimum-scale=1.0,user-scalable=no">  
<meta name="renderer" content="webkit">
  <meta http-equiv="Cache-Control" content="no-siteapp" />
  <link rel="icon" type="image/png" href="i/favicon.png">
  <link rel="apple-touch-icon-precomposed" href="i/app-icon72x72@2x.png">
  <meta name="apple-mobile-web-app-title" content="Amaze UI" />
  <link rel="stylesheet" href="css/amazeui.min.css" />
  <link rel="stylesheet" href="css/admin.css">
  <link rel="stylesheet" href="css/app.css">
</head>

<body data-type="login">

  <div class="am-g myapp-login">
	<div class="myapp-login-logo-block  tpl-login-max">
		<div class="myapp-login-logo-text">
			<div class="myapp-login-logo-text">
			
				恒赛特 ERP-项目配置管理系统 
				
			</div>
		</div>

		<div class="login-font">
			<i>Log In </i> 
		</div>
		<div class="am-u-sm-10 login-am-center">
			<form class="am-form" action="checkLogin.do" method="post">
				<fieldset>
					<div class="am-form-group">
						<input type="text" class="" id="name" name="name" placeholder="输入用户名" required>
					</div>
					<div class="am-form-group">
						<input type="password" class="" id="pass" name="pass" placeholder="输入密码" required>
					</div>
					<p><button type="submit" class="am-btn am-btn-default">登录</button></p>
				</fieldset>
			</form>
		</div>
	</div>
</div>

  <script src="./js/jquery.min.js"></script>
  <script src="./js/amazeui.min.js"></script>
  <script src="./js/app.js"></script>
</body>

</html>