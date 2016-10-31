<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%  
    String path = request.getContextPath();  
    String basePath = request.getScheme() + "://"  
            + request.getServerName() + ":" + request.getServerPort()  
            + path + "/";  
%>  
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>success.jsp</title>
<link href="<%=basePath%>css/stylesheet.css" rel="stylesheet" type="text/css" />
<link href="<%=basePath%>css/github-dark.css" rel="stylesheet" type="text/css" />
</head>


<body>
<br><br><hr/>
<h3 class ="container">
	操作成功！
	<a href="#" onClick="javascript :history.back(-1);">返回</a>
</h3>
</body>
</html>