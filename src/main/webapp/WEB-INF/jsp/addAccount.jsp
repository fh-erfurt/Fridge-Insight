<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
    <title>Add New Person</title>
    <link href="${pageContext.request.contextPath}/resources/css/MainCss.css" rel="stylesheet">
</head>
<body>
<div class="login-box">
    <h1>New Person</h1>
    <form:form action="saveAccount" method="POST" modelAttribute="account">
        <form:hidden path="ACCID" />

        <div class="user-box">
            <form:input path="firstName" type="text" id="firstName"/>
            <label for="firstName">First name</label>
        </div>
        <div class="user-box">
            <form:input path="lastName" type="text" id="lastName"/>
            <label for="lastName">Last name</label>
        </div>
        <div class="user-box">
            <form:input path="Password" type="password" id="password"/>
            <label for="password">Password</label>
        </div>
        <div class="user-box">
            <form:input path="familyPosition" type="text" id="familyPosition" />
            <label for="familyPosition">Family Position</label>
        </div>
        <div class="user-box">
            <form:input type="number" id="age" path="age" />
            <label for="age">Age</label>
        </div>
        <div class="user-box">
            <form:input path="height" type="number" id="height" />
            <label for="height">Height</label>
        </div>
        <div class="superUser">
            <ul>
                <li>
                    <form:radiobutton path="superUser" id="one" value="true"/>
                    <label for="one">SuperUser</label>
                    <div class="check"></div>
                </li>
                <li>
                    <form:radiobutton path="superUser" id="two" value="false"/>
                    <label for="two">Not SuperUser</label>
                    <div class="check"></div>
                </li>
            </ul>
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
