<%--
  Created by IntelliJ IDEA.
  User: oycc
  Date: 2019/11/18
  Time: 20:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>你好，世界</h3>
<%--<a href="hello">入门案例</a>--%>
<form action="postParam" method="post">
    名字：<input  type="text" name="name" value=""><br>
    生日：<input type="text" name="date" value="">
    <input type="submit" value="提交">
</form>
<a href="testAnno?username=小芬">测试</a>
</body>
</html>
