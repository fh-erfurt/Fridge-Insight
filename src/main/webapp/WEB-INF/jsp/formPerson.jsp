<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add New Person</title>
    <link href="${pageContext.request.contextPath}/resources/css/MainCss.css" rel="stylesheet">
</head>
<body>
<div class="login-box">
    <h1>New Person</h1>
    <form>
        <div class="user-box">
            <input type="number" id="age" name="age">
            <label for="age">Age</label>
        </div>
        <div class="user-box">
            <input type="number" id="height" name="height">
            <label for="height">Height</label>
        </div>
        <div class="user-box">
            <input type="text" id="familyPosition" name="familyPosition">
            <label for="familyPosition">Family Position</label>
        </div>
        <div class="user-box">
            <input type="text" id="firstName" name="firstName">
            <label for="firstName">First name</label>
        </div>
        <div class="user-box">
            <input type="text" id="lastName" name="lastName">
            <label for="lastName">Last name</label>
        </div>
        <div class="superUser">
            <ul>
                <li>
                    <input type="radio" name="superUser" id="one" checked/>
                    <label for="one">SuperUser</label>

                    <div class="check"></div>
                </li>
                <li>
                    <input type="radio" name="superUser" id="two"/>
                    <label for="two">Not SuperUser</label>

                    <div class="check"></div>
                </li>
            </ul>
        </div>
        <a href="addPerson">
            <span></span>
            <span></span>
            <span></span>
            <span></span>
            Submit
        </a>
    </form>
</div>
</body>
</html>
