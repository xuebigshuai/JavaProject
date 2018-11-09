<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/18
  Time: 19:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path=request.getContextPath();
%>
<html>
<head>
    <title>Add Form</title>
    <link href="<%=path%>/css/main.css" rel="stylesheet" type="text/css">

</head>
<body>
<div class="global">
    <form:form modelAttribute="book" method="post" action="book_save">
        <fieldset>
            <legend>Add a Book</legend>
            <p>
                <label for="category">Category:</label>
                <form:select path="category.id" id="category"
                    items="${categories}" itemLabel="${name}" itemValue="${id}"/>
            </p>
            <p>
                <label for="title">Title</label>
                <form:input path="title" id="title"/>
            </p>
            <p>
                <label for="author">Author</label>
                <form:input path="author" id="author"/>
            </p>
            <p>
                <label for="isbn">ISBN:</label>
                <form:input path="isbn" id="isbn"/>
            </p>
            <p id="btn">
                <input type="reset" value="reset"/>
                <input type="submit" value="Add Book">
            </p>
        </fieldset>
    </form:form>
</div>
</body>
</html>
