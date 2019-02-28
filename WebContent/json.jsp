<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
	<script type="text/javascript" src="js/jquery-1.11.1.min.js"></script>

  </head>
  
  <body>
      <script type="text/javascript">
      	$(function(){
      		$("#putAndGetJson").click(function(){
      			$.ajax({
      				url:"json/test1.action",
      				data:'{"userName":"jack","userPassword":"123456"}',
      				contentType:"application/json",
      				type:"post",
      				success:function(data){
      					alert(JSON.stringify(data));	
      				},
      				dataType:"json"
      			});
      		});
      		
      	});
      
      </script>
      <input type="button" id="putAndGetJson" value="json">
  </body>
</html>