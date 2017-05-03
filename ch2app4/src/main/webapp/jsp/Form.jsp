<%--
  Created by IntelliJ IDEA.
  User: Hao
  Date: 2017/5/2
  Time: 20:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Product Form</title>
    <style type="text/css">@import url(../css/main.css);</style>
</head>
<body>
<form method="post" action="pdf">
    <h1>Create PDF
        <span>Please use this form to enter the text</span>
    </h1>
    <label>
        <span>Text :</span>
        <input type="text" name="text"
               placeholder="Text for PDF"/>
    </label>
    <label>
        <span>&nbsp;</span>
        <input type="submit"/>
    </label>
</form>
</body>
</html>
