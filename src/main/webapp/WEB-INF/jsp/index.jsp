<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="${pageContext.request.contextPath}/resources/css/MainCss.css" rel="stylesheet">
<html>
<head>
    <title>Home page</title>
</head>
<body>

</body>
<div class="home">
    <h3>Home Page</h3>
            <div class="Btnhome">
                <input type="button" value="Add New Notification"
                       onclick="window.location.href='addNotification'; return false;"/>
            </div>
            <div class="Btnhome">
                <input type="button" value="Add New Food" onclick="window.location.href='addFood'; return false;"/>
            </div>
            <div class="Btnhome">
                <input type="button" value="Add New Account"
                       onclick="window.location.href='addAccount'; return false;"/>
            </div>
            <div class="Btnhome">
                <input type="button" value="Add New SuperMarket"
                       onclick="window.location.href='addSuperMarket'; return false;"/>
            </div>
</div>
</html>