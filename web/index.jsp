<%--
  Created by IntelliJ IDEA.
  User: z-one
  Date: 11/1/19
  Time: 3:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String result = request.getAttribute("result") + "";
    String input = request.getAttribute("input") + "";
    if (result.equals("null")) {
        result = "";
        input = "";
    }
%>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<fieldset style="height: fit-content; width: fit-content; margin: auto;margin-top: 300px" >
    <legend><h2>Dictionary</h2></legend>
    <form method="post" action="${pageContext.request.contextPath}/search">
        <p>&nbsp;&nbsp;<input type="text" name="input" placeholder="Enter a word" value="<%=input%>"> &nbsp;&nbsp;<input type="submit" value="Search"></p>
    </form>
    <p> Result: &nbsp; <input disabled style="font-weight: bolder;width: 250px;" type="text" value="<%=result%>"></p>
</fieldset>
</body>
</html>
