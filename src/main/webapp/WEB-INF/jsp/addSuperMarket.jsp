<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add New SuperMarket</title>
    <link href="${pageContext.request.contextPath}/resources/css/MainCss.css" rel="stylesheet">
</head>
<body>
<div class="login-box">
    <h1>New Supermarket</h1>
    <form action="saveSuperMarket" method="POST">
        <div class="user-box">
            <input type="text" id="city" name="city" required>
            <label for="city">City</label>
        </div>
        <div class="user-box">
            <input type="text" id="state" name="state" required>
            <label for="state">State</label>
        </div>
        <div class="user-box">
            <input type="number" id="houseNumber" name="houseNumber" required>
            <label for="houseNumber">House Number</label>
        </div>
        <div class="user-box">
            <input type="text" id="marketName" name="marketName" required>
            <label for="marketName">Market Name</label>
        </div>
        <div class="user-box">
            <input type="number" id="postalCode" name="postalCode" required>
            <label for="postalCode">Postal Code</label>
        </div>
        <div class="user-box">
            <input type="text" id="streetName" name="streetName" required>
            <label for="streetName">Street Name</label>
        </div>
        <div class="add">
            <span></span>
            <span></span>
            <span></span>
            <span></span>
            <input type="submit" value="Add"/>
        </div>
    </form>
</div>
</body>
</html>
