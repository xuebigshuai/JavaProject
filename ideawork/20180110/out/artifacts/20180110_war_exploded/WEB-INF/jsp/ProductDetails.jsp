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
    <title>Product Details</title>
    <link href="<%=path%>/images/icon/shopping.ico" rel="icon"/>
    <link href="<%= path%>/css/Global.css" rel="stylesheet" type="text/css"/>
    <link href="<%= path%>/css/main.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<div id="global">
    <h4>The Product has been saved.</h4>
    <p>
    <h5>Details:</h5>
    Product Name:${product.name}<br/>
    Description:${product.description}<br/>
    Price:${product.price}
    </p>
</div>
</body>
</html>
