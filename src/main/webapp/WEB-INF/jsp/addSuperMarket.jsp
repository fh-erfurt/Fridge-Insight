<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Add New SuperMarket</title>
    <link href="${pageContext.request.contextPath}/resources/css/MainCss.css" rel="stylesheet">
</head>
<body>
<div class="login-box">
    <h1>New Supermarket</h1>
    <form:form action="saveSuperMarket" method="POST" modelAttribute="supermarket">
        <form:hidden path="marketID" />
        <div class="user-box">
            <form:input type="text" id="marketName" path="marketName"/>
            <label for="marketName">Market Name</label>
        </div>
        <div class="user-box">
            <form:input type="text" id="streetName" path="streetName"/>
            <label for="streetName">Street Name</label>
        </div>
        <div class="user-box">
            <form:input type="number" id="houseNumber" path="houseNumber"/>
            <label for="houseNumber">House Number</label>
        </div>
        <div class="user-box">
            <form:input type="number" id="postalCode" path="postalCode"/>
            <label for="postalCode">Postal Code</label>
        </div>
        <div class="user-box">
            <form:input type="text" id="city" path="city"/>
            <label for="city">City</label>
        </div>
        <div class="user-box">
            <form:input type="text" id="state" path="state"/>
            <label for="state">State</label>
        </div>
        <div class="add">
            <span></span>
            <span></span>
            <span></span>
            <span></span>
            <input type="submit" value="Add"/>
        </div>
    </form:form>
</div>
</body>
</html>
