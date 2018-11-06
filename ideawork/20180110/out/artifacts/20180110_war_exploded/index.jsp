<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/10
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  String path=request.getContextPath();
%>
<html>
  <head>

    <title>添加商品</title>
    <link href="<%= path %>/images/icon/shopping.ico" rel="icon"/>
  </head>
  <body>
  <a href="<%=path %>/inputProduct.action"><h1>添加商品</h1></a>
  </body>
</html>
