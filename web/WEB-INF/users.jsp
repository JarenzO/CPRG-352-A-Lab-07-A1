<!--
    Document   : users
    Created on : 15 Mar, 2022, 3:40:15 PM
    Author     : Bavneet
-->
<!--@page contentType="text/html" pageEncoding="UTF-8"-->
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>User information</title>
</head>

<body>
    <p>hello</p>
    <ul>
    
   <c:forEach items="${users}" var="User">
                <li>${User.firstname} ${User.lastname}</a><br></li>
            </c:forEach>
    </ul>

    <p>${message} ${error}</p>
    
</body>
</html>
