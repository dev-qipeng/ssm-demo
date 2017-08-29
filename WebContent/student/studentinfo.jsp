<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.nav{
		height:50px;
		background: yellow;
	}
	.nav > ul{
		float: right;
	}
	.nav .ul li{
		margin:0 10px;;
		float:left;
		list-style: none;
	}
	.title{
		width:100%;
		height:80px;
		text-align: center;
	}
	.content{
		clear: both;
		height:550px;
		width:100%;
	}
	.button{
		width:100%;
		height:50px;
		text-align: center;
	}
</style>
</head>
<body>
	<div class="nav">
		<ul class="ul">
			<li><a href="#">个人信息</a></li>
			<li><a href="#">申报项目</a></li>
			<li><a href="#">申报进展</a></li>
			<li><a href="#">我的团队</a></li>
		</ul>
	</div>
	<div class="title">
		<h1>个人信息</h1>
	</div>
	<div class="content">
		<form id="updateInfoForm" action="">
			<table align="center" border="1">
				<tr>
					<td align="right">姓名：</td>
					<td><input type="text" name="" value="" size="22"></td>
				</tr>
				<tr>
					<td align="right">性别：</td>
					<td><input type="text" name="" value="" size="22"></td>
				</tr>
				<tr>
					<td align="right">院系班级：</td>
					<td><input type="text" name="" value="" size="22"></td>
				</tr>
				<tr>
					<td align="right">联系电话：</td>
					<td><input type="text" name="" value="" size="22"></td>
				</tr>
				
				<tr>
					<td align="right">邮箱：</td>
					<td><input type="text" name="" value="" size="22"></td>
				</tr>
			</table>
			<div class="button">
				<input type="submit" value="修改"></input>
				<input type="reset" value="取消"></input>
			</div>
		</form>
	</div>
</body>
</html>