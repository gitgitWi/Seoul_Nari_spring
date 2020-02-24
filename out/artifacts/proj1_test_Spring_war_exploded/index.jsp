<%--
  Created by IntelliJ IDEA.
  User: abrhm
  Date: 2020-02-24
  Time: 오후 10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>SEOUL NARI</title>
</head>
<style>
  body {
    background-position: center;
  }
  div.main {
    position: relative;
    top : 20%;
  }
  #logo_font {
    font-size: 120px;
    font-style: italic;
  }
  .sch {
    height: 50px; padding: 5px;
    width: 400px;
  }
  #btn {
    color: darkslateblue;
    background-color: lavender;
    border-style : solid;
    border-color: darkslateblue;
    border-width: 1px;
    width: 100px;
    padding: 0px;
    cursor: pointer;
    user-select: auto;
  }
</style>
<body>
<div class="main" align="center" style = "color: darkslateblue">
  <div id="logo_font" > SEOUL NARI </div><br>
  <form action="list" method="GET" >
    <input class="sch" type="search" name = "searchText">&nbsp;&nbsp;&nbsp;&nbsp;
    <input class="sch" id = "btn" type="submit" value="이리오너라!" />
  </form>
</div>
</body>
</html>