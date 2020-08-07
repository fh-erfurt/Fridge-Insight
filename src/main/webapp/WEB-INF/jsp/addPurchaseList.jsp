<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Add Purchase List</title>
    <link href="${pageContext.request.contextPath}/resources/css/MainCss.css" rel="stylesheet">
</head>
<body>
<div class="login-box">
    <h1>New Purchase List</h1>
    <form:form action="savePurchaseList" method="POST" modelAttribute="purchaseList">
        <form:hidden path="PURCHASEID" />

        <div class="user-box">
            <form:input path="dateOfPurchase" type="date" id="dateOfPurchase"  pattern="yyyy-MM-dd"/>
            <label for="dateOfPurchase">DateOfPurchase</label>
        </div>
        <div class ="user-box">
            <form:select id="account" path="account.ACCID">
                <form:option value="" label="--Please Select--"/>
                <form:options items="${Accounts}" itemValue="ACCID" itemLabel="firstName"/>
            </form:select>
            <label for="account">Account</label>
        </div>
        <div class="user-box" >
            <c:forEach  items="${Foods}" var="food" varStatus="count">
                <tr>
                    <td><form:checkbox path="listFoods" value="${food.foodTitle}"/></td>
                    <td><c:out value="${food.foodTitle}" /></td>
                </tr>
            </c:forEach>
            <label>Food</label>
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
