<%--
  Created by IntelliJ IDEA.
  User: Hao
  Date: 2017/5/4
  Time: 22:08
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Add Book Form</title>
    <style type="text/css">@import url("<c:url value="/css/main.css"/>");</style>
</head>
<body>
<div id="global">
    <form:form commandName="book" acceptCharset="UTF-8" action="save-book" method="post">
        <fieldset>
            <legend>Add a book</legend>
            <p>
                <label for="category">Category: </label>
                <form:select id="category" path="category.id"
                    items="${categories}" itemLabel="name"
                             itemValue="id">
                </form:select>
            </p>
            <p>
                <label for="title">Title: </label>
                <form:input path="title" id="title"/>
            </p>
            <p>
                <label for="author">Author: </label>
                <form:input path="author" id="author"/>
            </p>
            <p>
                <label for="isbn">ISBN: </label>
                <form:input path="isbn" id="isbn"/>
            </p>
            <p>
                <label for="price">Price: </label>
                $<form:input path="price" id="price"/>
            </p>
            <p id="buttons">
                <input id="reset" type="reset" tabindex="4">
                <input id="submit" type="submit" tabindex="5" value="Add Book">
            </p>
        </fieldset>
    </form:form>
</div>
</body>
</html>
