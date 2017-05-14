<%--
  Created by IntelliJ IDEA.
  User: lttxi
  Date: 2017/5/12
  Time: 22:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h1> Multiple File Upload </h1>
<form method="post" enctype="multipart/form-data" action="multipleSave">
    Upload File 1: <input type="file" name="file"> <br/>
    Upload File 2: <input type="file" name="file"> <br/>
    Upload File 3: <input type="file" name="file"> <br/>
    Upload File 4: <input type="file" name="file"> <br/>
    <br /><br /><input type="submit" value="Upload">
</form>
</body>
</html>
