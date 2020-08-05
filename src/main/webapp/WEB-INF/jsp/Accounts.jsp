<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Accounts</title>
          rel="stylesheet">
    <%@ page isELIgnored="false"%>
</head>
<body>
<div>
    <div>
        <h3></h3>
        <hr/>
        <div>
            <div>
                <div class="panel-title">Customer List</div>
            </div>
            <div>
                <table>
                    <tr>
                        <th>First Name</th>
                        <th>Last Name</th>
                    </tr>

                    <!-- loop over and print our customers -->
                    <c:forEach var="account" items="${Accounts}">

                        <!-- construct an "update" link with customer id -->
                        <c:url var="update" value="http://localhost:8080/updateAccount">
                            <c:param name="ACCID" value="${account.ACCID}" />
                        </c:url>

                        <!-- construct an "delete" link with customer id -->
                            <c:url var="delete" value="http://localhost:8080/deleteAccount">
                            <c:param name="ACCID" value="${account.ACCID}" />
                        </c:url>

                        <tr>
                            <td>${account.ACCID}</td>
                            <td>${account.lastName}</td>
                            <td>${account.firstName}</td>


                                <!-- display the update link --> <a href="${update}">Update</a>
                                | <a href="${delete}"
                                     onclick="if (!(confirm('Are you sure you want to delete this Account?'))) return false">Delete</a>
                            </td>

                        </tr>

                    </c:forEach>

                </table>

            </div>
        </div>
    </div>

</div>
</body>
</html>