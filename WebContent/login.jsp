<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet" href="css/login.css" >
<title>登录</title>
</head>
<body>
	<div class="header"></div>
    <br>
    <br>
	<div class="login_student">
        <div class="login_title">
		  <h2 align="center">登录申报系统</h2>
        </div>
		<div class="login_tab">
			<span class="span_student cur">学生登录</span> <span class="span_teacher">教师登录</span>
		</div>
		<div class="student_form">
            <form action="login.action" method="post">
                <table width="250px">
                    <tr>
                        <td>账号：</td>
                        <td><input type="text" name="username"></td>
                    </tr>
                    <tr>
                        <td>密码：</td>
                        <td><input type="password" name="password"></td>
                    </tr>
                    <tr>
                        <td colspan="2" align="center"><input type="submit" value="登录"></td>
                    </tr>
                </table>
            </form>
		</div>
        <div class="text-tip">没有账号？<a href="javascript:;">立即注册</a></div>
	</div>
</body>
</html>