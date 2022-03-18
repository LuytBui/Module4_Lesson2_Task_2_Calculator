<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 18/3/2022
  Time: 14:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
    <style>
        table tr td {
            border: 1px solid black;
            border-collapse: collapse;
        }
    </style>
</head>
<body>
<h1>Calculator</h1>
<form method="post">
    <input type="number" name="firstOperand" placeholder="First operand...">
    <input type="number" name="secondOperand" placeholder="Second operand...">
    <br>
    <button value="addition" name="addition">Addition(+)</button>
    <button value="subtraction" name="subtraction">Subtraction(-)</button>
    <button value="multiplication" name="multiplication">Multiplication(*)</button>
    <button value="division" name="division">Division(/)</button>
</form>

<p>${expression}</p>
</body>
</html>
