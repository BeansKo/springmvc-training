<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h5>search</h5>
	<form action="${pageContext.request.contextPath}/restful.action" method="get">
		<input type="submit" value="submit"/>
	</form>
	<h5>add</h5>
	<form action="${pageContext.request.contextPath}/restful.action" method="post">
		UserName:<input type="text" name="userName"/>
		Password:<input type="password" name="userPassword"/>
		<input type="submit" value="submit"/>
	</form>
	<h5>update</h5>
	<form action="${pageContext.request.contextPath}/restful.action" method="post">
		UserName:<input type="text" name="userName"/>
		Password:<input type="password" name="userPassword"/>
		<input type="hidden" name="userId" value="1">
		<!-- name must _method -->
		<input type="hidden" name="_method" value="put">
		<input type="submit" value="submit"/>
	</form>
	<h5>delete</h5>
	<form action="${pageContext.request.contextPath}/restful/1.action" method="post">
		<input type="hidden" name="_method" value="delete">
		<input type="submit" value="submit"/>
	</form>
</body>
</html>