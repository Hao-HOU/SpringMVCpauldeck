<%--
  Created by IntelliJ IDEA.
  User: Hao
  Date: 2017/5/10
  Time: 15:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Book List</title>
</head>
<body>
Books in Simple Table
<table>
    <tr>
        <td>ISBN</td>
        <td>Title</td>
    </tr>
    <c:forEach items="${requestScope.books}" var="book">
        <tr>
            <td>${book.isbn}</td>
            <td>${book.title}</td>
        </tr>
    </c:forEach>
</table>
<br/>
Books in Styled Table
<table>
    <tr style="background:#ababff">
        <td>ISBN</td>
        <td>Title</td>
    </tr>
    <c:forEach items="${requestScope.books}" var="book"
               varStatus="status">
        <c:if test="${status.count%2 == 0}">
            <tr style="background:#eeeeff">
        </c:if>
        <c:if test="${status.count%2 != 0}">
            <tr style="background:#dedeff">
        </c:if>
        <td>${book.isbn}</td>
        <td>${book.title}</td>
        </tr>
    </c:forEach>
</table>

<br/>
ISBNs only:
<c:forEach items="${requestScope.books}" var="book"
           varStatus="status">
    ${book.isbn}<c:if test="${!status.last}">,</c:if>
</c:forEach>
</body>
</html>
