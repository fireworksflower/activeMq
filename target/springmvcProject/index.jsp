<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/4/30
  Time: 14:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--<h2>文件上传</h2>
<form action="/user/fileupload" method="post" enctype="multipart/form-data">
    选择文件：<input type="file" name="upload"/><br/>
    <input type="submit" name="上传"/>
</form>--%>

<a href="user/sendActiveMq">hello</a>
<br/>
<a href="user/testRequestParam?name=test">RequestParam注解</a>
<br/>

<form action="user/testRequestBody" method="post">
    用户名：<input type="text" name="username"/><br/>
    密码：<input type="password" name="password"/><br/>
    用户年龄：<input type="text" name="age"/><br/>
    <input type="submit" value="保存"/>
</form>
<br/>

<a href="user/testPathVariable/100">testPathVariable注解</a>

<br/>
<form action="user/fileUpload" method="post" enctype="multipart/form-data">
    上传用户：<input type="text" name="username"/><br/>
    上传文件1：<input type="file" name="file1"/><<br/>
    上传文件2：<input type="file" name="file2"/><<br/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
