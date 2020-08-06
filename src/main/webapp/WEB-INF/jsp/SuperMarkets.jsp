<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>SuperMarkets</title>
    <link href="${pageContext.request.contextPath}/resources/css/MainCss.css" rel="stylesheet">
    <%@ page isELIgnored="false" %>
</head>
<body>
<div class="account">
    <h3>List of SuperMarkets</h3>
    <table class="table">
        <tr>
            <th>SuperMarket ID</th>
            <th>SuperMarket Name</th>
            <th>Street Name</th>
            <th>House Number</th>
            <th>ZIP</th>
            <th>City</th>
            <th>State</th>
            <th>Update</th>
            <th>Delete</th>
        </tr>
        <c:forEach var="superMarket" items="${SuperMarkets}">
            <c:url var="update" value="http://localhost:8080/updateSuperMarket">
                <c:param name="marketID" value="${superMarket.marketID}"/>
            </c:url>
            <c:url var="delete" value="http://localhost:8080/deleteSuperMarket">
                <c:param name="marketID" value="${superMarket.marketID}"/>
            </c:url>
            <tr>
                <td>${superMarket.marketID}</td>
                <td>${superMarket.marketName}</td>
                <td>${superMarket.streetName}</td>
                <td>${superMarket.houseNumber}</td>
                <td>${superMarket.postalCode}</td>
                <td>${superMarket.city}</td>
                <td>${superMarket.state}</td>
                <td><a href="${update}"><img alt="delete image" style="width: 40px; height: 40px;"src="resources/images/update.png"/></a></td>
                <td><a href="${delete}" onclick="if (!(confirm('Are you sure you want to delete this Account?'))) return false"><img alt="delete image" style="width: 40px; height: 40px;"src="resources/images/delete.png"/></a></td>

            </tr>
        </c:forEach>
    </table>
    <div class ="addBtn">
        <input type="button" value="Add New SuperMarket" onclick="window.location.href='addSuperMarket'; return false;"/>
    </div>
</div>
</body>
</html>