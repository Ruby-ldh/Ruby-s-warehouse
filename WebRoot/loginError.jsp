<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width,initial-scale=1.0,maximum-scale=1.0,minimum-scale=1.0,user-scalable=no">  

</head>
<body>

		<h1>登陆失败，账号或密码输入错误或为空！！！</h1>

		
	<div>立 即 <a href="tologin.do"> 跳 转 ,</a> <span id="index">3</span> 自 动 跳 转 ！！！</div>
</body>
<script type="text/javascript">
	window.onload=function(){
		var index = document.getElementById("index");
		var num=2;
		setInterval(function time(){
			index.innerHTML=num;
			num-=1;
		}, 1000);
		
		setTimeout(function jump(){
			window.location.href="tologin.do";
		}, 3000);
	}
</script>
</html>