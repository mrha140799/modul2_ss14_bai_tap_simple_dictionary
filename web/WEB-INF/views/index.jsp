<%--
  Created by IntelliJ IDEA.
  User: TrongHa
  Date: 4/2/2019
  Time: 9:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Dictionary</h1>
  <form method="post" action="/search">
  <label>Input:</label><input type="text" height="170px" width="15px" name="word">
  <button type="submit">Search</button>
  </form>
  <lable>Mean: </lable> ${mean}
  </body>
</html>
