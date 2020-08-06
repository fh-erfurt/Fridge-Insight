<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Food</title>
    <link href="${pageContext.request.contextPath}/resources/css/MainCss.css" rel="stylesheet">
    <%@ page isELIgnored="false" %>
</head>
<body>
<div class="account">
    <h3>Food List</h3>
    <table class="table">
        <tr>
            <th>Food ID</th>
            <th>Food Title</th>
            <th>Expire Date</th>
            <th>Type</th>
            <th>Quantity</th>
            <th>Unit</th>
            <th>SuperMarket</th>
            <th>Update</th>
            <th>Delete</th>
        </tr>
        <c:forEach var="food" items="${Foods}">
            <c:url var="update" value="http://localhost:8080/updateFood">
                <c:param name="FOODID" value="${food.FOODID}"/>
            </c:url>

            <c:url var="delete" value="http://localhost:8080/deleteFood">
                <c:param name="FOODID" value="${food.FOODID}"/>
            </c:url>
            <tr>
                <td>${food.FOODID}</td>
                <td>${food.foodTitle}</td>
                <td>${food.expireDate}</td>
                <td>${food.foodType}</td>
                <td>${food.foodQuantity}</td>
                <td>${food.foodUnit}</td>
                <td>${food.supermarket.marketName}</td>
                <td><a href="${update}"><img alt="delete image" style="width: 40px; height: 40px;"src="resources/images/update.png"/></a></td>
                <td><a href="${delete}" onclick="if (!(confirm('Are you sure you want to delete this Account?'))) return false"><img alt="delete image" style="width: 40px; height: 40px;"src="resources/images/delete.png"/></a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <div class ="addBtn">
        <input type="button" value="Add New Item" onclick="window.location.href='addFood'; return false;"/>
    </div>
</div>

</body>
</html>