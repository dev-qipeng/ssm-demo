<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	我的名字是：${user.name }
	<br>
	<a href="user/hello">点击跳转</a>
	<br>
	<form action="index.action">
		请输入id:<input type="text" name="id">
		<br>
		<input type="submit" value="提交" >
	</form>
</body>
</html>