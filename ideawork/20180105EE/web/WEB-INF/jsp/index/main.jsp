<%--
  Created by IntelliJ IDEA.
  User: Suresh
  Date: 2018/1/11
  Time: 11:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ProductForm</title>
</head>
<body>
<div id="global">
    <form action="product_save.action" method="post">
        <fieldset>
            <legend>Add a product</legend>
            <p>
                <label for="name">Product Name:<input type="text" id="name" name="name" tabindex="1"/></label>
            </p>
            <p>
                <label for="description">Product Description:<input type="text" id="description" name="description"
                                                                    tabindex="2"/></label>
            </p>
            <p>
                <label for="price">Product Price:<input type="text" id="price" name="price" tabindex="3"/></label>
            </p>
             <p id="button">
                 <input type="reset" tabindex="4" id="reset"/>\
                 <input type="submit" id="submit" tabindex="5" value="Add Product "/>
             </p>

        </fieldset>
    </form>
</div>
</body>
</html>
