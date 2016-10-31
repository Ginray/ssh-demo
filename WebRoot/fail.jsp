<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>fail.jsp</title>
<%  
    String path = request.getContextPath();  
    String basePath = request.getScheme() + "://"  
            + request.getServerName() + ":" + request.getServerPort()  
            + path + "/";  
%>  

<link href="<%=basePath%>css/stylesheet.css" rel="stylesheet" type="text/css" />
<link href="<%=basePath%>css/github-dark.css" rel="stylesheet" type="text/css" />
</head>

<body>
<br><br><hr/>
<h3 class ="container">
	操作失败！请确认用户名是否存在。
	<a href="#" onClick="javascript :history.back(-1);">返回</a>
</h3>
</body>
</html>