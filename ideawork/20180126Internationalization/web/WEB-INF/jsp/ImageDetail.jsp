<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/30
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>图片详情</title>
</head>
<body>
<div>
   <c:forEach items="${image.images}" var="image">
       <li>${image.originalFilename}</li>
       <img width="100" src="<c:url value="/image/"/>${image.originalFilename}"/>

   </c:forEach>
</div>
</body>
</html>
