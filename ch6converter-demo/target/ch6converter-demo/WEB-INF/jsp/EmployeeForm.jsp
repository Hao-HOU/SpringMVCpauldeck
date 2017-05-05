<%--
  Created by IntelliJ IDEA.
  User: Hao
  Date: 2017/5/5
  Time: 14:56
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Add Employee Form</title>
    <style type="text/css">@import url("<c:url value="/css/main.css"/> ");</style>
</head>
<body>
<div id="global">
    <form:form commandName="employee" action="save-employee" method="post">
        <fieldset>
            <legend>Add an employee</legend>
            <p>
                <label for="firstName">First Name: </label>
                <form:input path="firstName" tabindex="1"/>
            </p>
            <p>
                <label for="lastName">Last Name: </label>
                <form:input path="lastName" tabindex="2"/>
            </p>
            <p>
                <form:errors path="birthDate" cssClass="error"/>
            </p>
            <p>
                <label for="birthDate">Date of Birth (MM-dd-yyyy): </label>
                <form:input path="birthDate" tabindex="3"/>
            </p>
            <p id="buttons">
               <input id="reset" type="reset" tabindex="4">
                <input id="submit" type="submit" tabindex="5" value="Add Employee">
            </p>
        </fieldset>
    </form:form>
</div>
</body>
</html>
