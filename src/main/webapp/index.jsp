<%--
  Created by IntelliJ IDEA.
  User: FPTSHOP 213 TNH
  Date: 01/02/2021
  Time: 1:40 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Discount Calculator</title>
</head>
<body>
<form method="post" action="/calculate">
    <h1>Product Discount Calculator</h1>
    <hr>
    <input type="text" name="description" placeholder="Description"/>
    <br>
    <br>
    <input type="text" name="price" placeholder="Price"/>
    <br>
    <br>
    <input type="text" name="percent" placeholder="Discount Percent"/>
    <br>
    <br>
    <input type="submit" value="Calculate Discount"/>
</form>
</body>
</html>
