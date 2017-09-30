<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
	<c:forEach items="${list }" var="item" varStatus="i">
		<c:forEach items="${item.coinImgList }" var="img">
			<img src="${img.getPicUrl() }" width="200px" height="200px">
		</c:forEach>
	
		<div><img src="${item.coinImgList[0].getPicUrl() }" width="200px" height="200px"></div>
		<div><label>${item.id}</label></div>
	</c:forEach>
</div>
</body>
</html>