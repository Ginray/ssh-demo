<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>index.jsp</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link href="css/stylesheet.css" rel="stylesheet" type="text/css" />
	<link href="css/github-dark.css" rel="stylesheet" type="text/css" />
	
	
  </head>
  
  <body>
  <br><br>
  
  <div class="container">
 	 <h2>
 	 <hr/>
  	<a href="login.jsp">ssh2演示</a>
  	</h2>
  </div>
  </body>
</html>
