# ssh-demo

##8/25 日志 :
###	上传项目，修改数据库的时候可能还有bug，正在抓虫。
###	改天加上css，实在有点丑 ：)

##8/26 日志 :
###	添加css
###	bugfix

##10/31 日志 ：
###修复在action跳转至fail.jsp的时候出现css不能正确加载的问题 
当你在某个jsp页面跳转到action执行操作以后,再返回页面发现css和js全部失效,要刷新才能重新加载


问题原因在于action跳转回来以后的目录路径是你的action所配置的目录 如  /项目名/users.do


获得一下本地的绝对路径就可以解决


下面是解决方法



    <%  
        String path = request.getContextPath();  
        String basePath = request.getScheme() + "://"  
                + request.getServerName() + ":" + request.getServerPort()  
                + path + "/";  
    %>  
      
    <link href="<%=basePath%>css/stylesheet.css" rel="stylesheet" type="text/css" /> 

