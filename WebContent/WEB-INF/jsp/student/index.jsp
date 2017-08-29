<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${pageContext.request.contextPath}/css/index.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/css/content.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.js"></script>
<title>项目申报管理系统</title>
<script type="text/javascript">
	$(function() {
		//加载页面后自动请求shouye.jsp
		var url = "student/shouye.action";
		$(".content").load(url);
		//导航栏点击监听
		$(function(){
			$("ul a").off("click").on("click",function(){
				var url = $(this).attr("href");
				console.log(url);
				$(".content").load(url,{id:'${id}'});
				return false;
			});
		});
	});
</script>

</head>
<body>
	<div class="container">
		<div class="header">
			<div class="welcome">
				<span>欢迎 ${username}</span> &nbsp;&nbsp;<a href="#">退出</a>
			</div>
		</div>
		<div class="middle">
			<div class="nav">
		    <ul class="ul">
		        <li><a href="student/shouye.action">首页</a></li>
		        <li><a href="student/studentinfo.action">个人信息</a></li>
		        <li><a href="student/applyproject.action">申报项目</a></li>
		        <li><a href="#">申报进展</a></li>
		        <li><a href="#">我的团队</a></li>
		    </ul>
			</div>
			<br>
			<br>
			<div class="content">
			
			</div>
		</div>
	</div>
</body>
</html>