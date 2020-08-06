<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>

<html>
<head>
    <title>Add New Notification</title>
    <link href="${pageContext.request.contextPath}/resources/css/MainCss.css" rel="stylesheet">
</head>
<body>
<div class="login-box">
    <h1>New Food</h1>
    <form:form action="saveNotification" method="POST" modelAttribute="notification">
        <form:hidden path="NOTFOODID" />
        <div class="user-box">
            <form:input path="requiredQuantity" type="number" id="requiredQuantity"/>
            <label for="requiredQuantity">required Quantity</label>
        </div>
        <div class="user-box">
            <form:input path="unit" type="number" id="unit"/>
            <label for="unit">Unit</label>
        </div>
        <div class="user-box">
            <form:input path="expirationDate" type="date" id="expirationDate" pattern="yyyy-MM-dd"/>
            <label for="expirationDate">Expiration Date</label>
        </div>
        <div class="user-box">
            <form:select id="food" path="food.FOODID">
                <form:option value="None" label="--Please Select--"/>
                <form:options items="${foods}" itemValue="FOODID" itemLabel="foodTitle"/>
            </form:select>
            <label for="food">Food</label>
        </div>
        <div class="add">
            <span></span>
            <span></span>
            <span></span>
            <span></span>
            <input type="submit" value="ADD"/>
        </div>
    </form:form>
</div>
</body>
</html>
