<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Notifications</title>
    <link href="${pageContext.request.contextPath}/resources/css/MainCss.css" rel="stylesheet">
    <%@ page isELIgnored="false" %>
</head>
<body>
<div class="account">
    <h3>Notifications</h3>
    <table class="table">
        <tr>
            <th>Notification ID</th>
            <th>Targeted Food</th>
            <th>required Quantity</th>
            <th>Unit</th>
            <th>Date of Expiration</th>
            <th>Update</th>
            <th>Delete</th>
        </tr>
        <c:forEach var="notification" items="${Notifications}">
            <c:url var="update" value="http://localhost:8080/updateNotification">
                <c:param name="NOTFOODID" value="${notification.NOTFOODID}"/>
            </c:url>

            <c:url var="delete" value="http://localhost:8080/deleteNotification">
                <c:param name="NOTFOODID" value="${notification.NOTFOODID}"/>
            </c:url>
            <tr>
                <td>${notification.NOTFOODID}</td>
                <td>${notification.food.foodTitle}</td>
                <td>${notification.requiredQuantity}</td>
                <td>${notification.unit}</td>
                <td>${notification.dateOfExpiration}</td>
                <td><a href="${update}"><img alt="delete image" style="width: 40px; height: 40px;"src="resources/images/update.png"/></a></td>
                <td><a href="${delete}" onclick="if (!(confirm('Are you sure you want to delete this Account?'))) return false"><img alt="delete image" style="width: 40px; height: 40px;"src="resources/images/delete.png"/></a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <div class ="addBtn">
        <input type="button" value="Add New Notification" onclick="window.location.href='addNotification'; return false;"/>
    </div>
</div>

</body>
</html>