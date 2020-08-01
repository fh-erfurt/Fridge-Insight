<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add New Person</title>
    <link href="${pageContext.request.contextPath}/resources/css/MainCss.css" rel="stylesheet">
</head>
<body>
<div class="login-box">
    <h1>New Account</h1>
    <form action ="saveAccount">
        <div class="user-box">
            <input type="text" id="password" name="Password" required>
            <label for="password">Password</label>
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