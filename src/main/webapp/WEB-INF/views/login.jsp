<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style>
    <%@include file='/WEB-INF/views/css/table_dark.css' %>
</style>
<html>
<head>
    <title>Login page</title>
</head>
<body>
<form method="post" id="login" action=${pageContext.request.contextPath}"/login">
    <h1 class="table_dark">Please enter your login and password</h1>
<table border="1" class="table_dark">
    <tr>
        <th>Login</th>
        <th>Password</th>
        <th>Submit</th>
    </tr>
    <tr>
        <td>
            <input type="text" name="login" form="login" required>
        </td>
        <td>
            <input type="password" name="password" form="login" required>
        </td>
        <td>
            <input type="submit" name="Submit" form="login">
        </td>
    </tr>
</table>
    <h4 align="center" style="color:red">${errorMsg}</h4>
    <h4 align="center"><a href="/drivers/add">Register driver</a></h4>
</body>
</html>

