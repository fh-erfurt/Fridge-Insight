<%--
  Created by IntelliJ IDEA.
  User: test
  Date: 29.07.2020
  Time: 21:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Add New Person</title>
  </head>
  <body>
  <form action="addPerson">
    <label for="firstname">First name:</label><br>
    <input type="text" id="firstname" name="firstname" value="first name"><br>
    <label for="lastname">Last name:</label><br>
    <input type="text" id="lastname" name="lastname" value="last name">
    <label for="age">Age:</label><br>
    <input type="radio" id="superuser" name="superuser">
    <label for="superuser">Super User</label><br>
    <input type="radio" id="notsuperuser" name="notsuperuser">
    <label for="notsuperuser"> Not Super User</label><br>
    <input type="number" id="age" name="age" value="age">
    <label for="familyposition">Family Position:</label><br>
    <input type="text" id="familyposition" name="familyposition" value="Family Position">
    <input type="submit" value="submit">
   </form>
  </body>
</html>
