<%--
  Created by IntelliJ IDEA.
  User: Hao
  Date: 2017/5/5
  Time: 16:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>Save Employee</title>
    <style type="text/css">@import url("<c:url value="/css/main.css"/>");</style>
</head>
<body>
<div id="global">
    <h4>The employee details have been saved.</h4>
    <p>
    <h5>Details:</h5>
    First Name: ${employee.firstName}<br/>
    Last Name: ${employee.lastName}<br/>
    Date of Birth: ${employee.birthDate}
    </p>
</div>
</body>
</html>
