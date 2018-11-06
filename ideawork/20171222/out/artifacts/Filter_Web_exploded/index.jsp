<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/22
  Time: 14:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  $END$
  <button id="btn">经理</button>

  <form action="/filter/servlet2" method="post">

      <input type="submit" value="登录"/>
    </div>
  </form>
  </body>
<script>
  var btn=document.getElementById("btn");
  btn.onclick=function()
  {
      try{
          var  xhr=new XMLHttpRequest();
      }
      catch (e){
          xhr=new ActiveXObject("Microsoft.XMLHTTP");
      }
      xhr.onreadystatechange=function(){
          if(xhr.readyState==4 && xhr.status==200){
              alert("成功");
          }
      }

      xhr.open("GET","/filter/servlet2");
      xhr.send();
     /* window.location.href="/filter/servlet2";*/

  }
</script>
</html>
