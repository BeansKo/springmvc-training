<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>home</title>
</head>
<body>
	<h5>默认参数类型</h5>
	<form action="${pageContext.request.contextPath}/param/test1.action" method="post">
		UserName:<input type="text" name="userName"/>
		Password:<input type="password" name="userPassword"/>
		<input type="submit" value="submit"/>
	</form>
	
	<h5>@PathVariable通过路径接收参数</h5>
	<form action="${pageContext.request.contextPath}/param/test2/zhangsan/123456.action" method="post">
		<input type="submit" value="submit"/>
	</form>
	
	<h5>简单参数类型</h5>
	<form action="${pageContext.request.contextPath}/param/test3.action" method="post">
		UserName:<input type="text" name="userName"/>
		Password:<input type="password" name="userPassword"/>
		<input type="submit" value="submit"/>
	</form>
	
	<h5>JavaBean参数类型</h5>
	<form action="${pageContext.request.contextPath}/param/test4.action" method="post">
		UserName:<input type="text" name="userName"/>
		Password:<input type="password" name="userPassword"/>
		Telphone:<input type="text" name="telphone"/>
		<input type="submit" value="submit"/>
	</form>
	
	<h5>包装JavaBean参数类型</h5>
	<form action="${pageContext.request.contextPath}/param/test5.action" method="post">
		UserName:<input type="text" name="user.userName"/>
		Password:<input type="password" name="user.userPassword"/>
		Telphone:<input type="text" name="user.telphone"/>
		Sex:
		<input type="radio" name="gender" value="男"/>男
		<input type="radio" name="gender" value="女"/>女
		<input type="submit" value="submit"/>
	</form>
	
	<h5>数组参数类型</h5>
	<form action="${pageContext.request.contextPath}/param/test6.action" method="post">
		<input type="checkbox" name="lover" value="1"/>篮球
		<input type="checkbox" name="lover" value="2"/>足球
		<input type="checkbox" name="lover" value="3"/>排球
		<input type="submit" value="submit"/>
	</form>
	
	<h5>自定义参数类型转换</h5>
	<form action="${pageContext.request.contextPath}/param/test7.action" method="post">
		BirthDay:<input type="text" name="birth"/>
		<input type="submit" value="submit"/>
	</form>
	
	<h5>Spring处理异常</h5>
	<a href="${pageContext.request.contextPath}/exceprion/test1.action">@ExpectionHandler处理异常</a><br>
	<a href="${pageContext.request.contextPath}/exceprion/test2.action">SimpleMappingExceptionResolver</a><br>
	<a href="${pageContext.request.contextPath}/exceprion/test3.action">HandlerExceptionResolver</a><br>
</body>
</html>