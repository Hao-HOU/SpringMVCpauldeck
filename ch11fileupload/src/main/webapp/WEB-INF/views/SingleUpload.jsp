<%--
  Created by IntelliJ IDEA.
  User: lttxi
  Date: 2017/5/12
  Time: 22:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h1>Single File Upload</h1>
<form method="post" enctype="multipart/form-data" action="singleSave">
    Upload File: <input type="file" name="file">
    <br /><br />
    Description: <input type="text" name="desc"/>
    <br/><br/><input type="submit" value="Upload">
</form>
</body>
</html>
