<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Accounts</title>
    <link href="${pageContext.request.contextPath}/resources/css/MainCss.css" rel="stylesheet">
    <%@ page isELIgnored="false" %>
</head>
<body>
    <div class="account">
        <h3>List of Accounts</h3>
        <table class="table">
            <tr>
                <th>Account ID</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Family Position</th>
                <th>Age</th>
                <th>Height</th>
                <th>SuperUser</th>
                <th>Update</th>
                <th>Delete</th>
            </tr>
            <c:forEach var="account" items="${Accounts}">
                <c:url var="update" value="http://localhost:8080/updateAccount">
                    <c:param name="ACCID" value="${account.ACCID}"/>
                </c:url>

                <c:url var="delete" value="http://localhost:8080/deleteAccount">
                    <c:param name="ACCID" value="${account.ACCID}"/>
                </c:url>
                <tr>
                    <td>${account.ACCID}</td>
                    <td>${account.firstName}</td>
                    <td>${account.lastName}</td>
                    <td>${account.familyPosition}</td>
                    <td>${account.age}</td>
                    <td>${account.height}</td>
                    <td>${account.superUser}</td>
                    <td><a href="${update}"><img alt="delete image" style="width: 40px; height: 40px;"src="resources/images/update.png"/></a></td>
                    <td><a href="${delete}" onclick="if (!(confirm('Are you sure you want to delete this Account?'))) return false"><img alt="delete image" style="width: 40px; height: 40px;"src="resources/images/delete.png"/></a>
                    </td>
                </tr>
            </c:forEach>
        </table>
        <div class ="addBtn">
            <input type="button" value="Add Account" onclick="window.location.href='addAccount'; return false;"/>
        </div>
    </div>

</body>
</html>