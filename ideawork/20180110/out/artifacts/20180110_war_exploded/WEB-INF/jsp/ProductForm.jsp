<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/17
  Time: 11:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
        String path=request.getContextPath();
%>
<html>
<head>
    <title>Add Product</title>
    <link href="<%=path%>/images/icon/shopping.ico" rel="icon"/>
    <link href="<%= path%>/css/Global.css" rel="stylesheet" type="text/css"/>
    <link href="<%= path%>/css/main.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<div id="global">
    <form action="product_save.action" method="post">
        <fieldset>
            <legend>Add a product</legend>
            <p>
                <form:errors path="name" />
                <label for="name">Product Name:</label><input type="text" id="name" name="name" tabindex="1"/>
            </p>
            <p>
                <label for="description">Description:</label><input type="text" id="description" name="description"
                                                            tabindex="2"/>
            </p>
            <p>
                <label for="price">Price:</label><input type="text" id="price" name="price" tabindex="3"/>
            </p>
            <p id="button">
                <input type="reset" tabindex="4" id="reset" value="Reset"/>
                <input type="submit" id="submit" tabindex="5" value="Add Product "/>
                <input type="search"/>
                <%--<select>
                    <option></option>
                </select>--%>
            </p>
        </fieldset>
    </form>
</div>
</body>
</html>
