<%--
  Created by IntelliJ IDEA.
  User: Hao
  Date: 2017/5/4
  Time: 22:24
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Edit Book Form</title>
    <style type="text/css">@import url("<c:url value="/css/main.css"/>");</style>
</head>
<body>
<div id="global">
    <c:url var="formAction" value="/update-book"/>
    <form:form commandName="book" action="${formAction}" method="post">
        <fieldset>
            <legend>Edit a book</legend>
            <form:hidden path="id"/>
            <p>
                <label for="category">Category: </label>
                <form:select id="category" path="category.id" items="${categories}"
                             itemLabel="name" itemValue="id"/>
            </p>
            <p>
                <label for="title">Title: </label>
                <form:input id="title" path="title"/>
            </p>
            <p>
                <label for="author">Author: </label>
                <form:input id="author" path="author"/>
            </p>
            <p>
                <label for="isbn">ISBN: </label>
                <form:input id="isbn" path="isbn"/>
            </p>
            <p>
                <label for="price">Price: </label>
                $<form:input id="price" path="price"/>
            </p>

            <p id="buttons">
                <input id="reset" type="reset" tabindex="4">
                <input id="submit" type="submit" tabindex="5"
                       value="Update Book">
            </p>
        </fieldset>
    </form:form>
</div>
</body>
</html>
