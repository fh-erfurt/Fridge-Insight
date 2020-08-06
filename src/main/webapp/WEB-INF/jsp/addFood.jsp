<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
    <title>Add New Food</title>
    <link href="${pageContext.request.contextPath}/resources/css/MainCss.css" rel="stylesheet">
</head>
<body>
<div class="login-box">
    <h1>New Food</h1>
    <form:form action="saveFood" method="POST" modelAttribute="food">
        <form:hidden path="FOODID" />

        <div class="user-box">
            <form:input path="foodTitle" type="text" id="foodTitle"/>
            <label for="foodTitle">Food Title</label>
        </div>
        <div class="user-box">
            <form:input path="expireDate" type="date" id="expireDate"/>
            <label for="expireDate">Expire Date</label>
        </div>
        <div class="user-box">
            <form:input path="foodType" type="text" id="foodType"/>
            <label for="foodType">Food Type</label>
        </div>
        <div class="user-box">
            <form:input path="foodQuantity" type="number" id="foodQuantity"/>
            <label for="foodQuantity">Food Quantity</label>
        </div>
        <div class="user-box">
            <form:input path="foodUnit" type="text" id="foodUnit"/>
            <label for="foodUnit">Food Unit</label>
        </div>
        <label for="supermarket">SuperMarket</label>
        <form:select id="supermarket" path="supermarket.marketID">
            <form:option value="-" label="--Please Select"/>
            <form:options items="${superMarkets}" itemValue="marketID" itemLabel="marketName"/>
        </form:select>
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
