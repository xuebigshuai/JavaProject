<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/5
  Time: 9:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  String path=request.getContextPath();
%>
<html>
  <head>
    <title href="<%= path %>/images/icon/shopping.ico" rel="icon">ProductForm</title>
    <link href="<%= request.getContextPath() %>/images/icon/shopping.ico" rel="icon"/>

  </head>
  <body>
    <a href="<%= path %>/product_input.action">添加物品信息</a>
  </body>
</html>
