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
  div.main {
    position: relative;
    top : 20%;
    color: #565656;
    text-align: center;
  }
  #logo_font {
    font-size: 120px;
    font-style: italic;
    background-color: #ffdf00;
  }
  .sch {
    height: 50px;
    padding: 5px;
    width: 400px;
    background-color: #cfcfcf;
  }
  #btn {
    background-color: #ffdf00;
    border-style : solid;
    border-color: #565656;
    border-width: 2px;
    width: 100px;
    cursor: pointer;
  }
</style>
<body>
<div class="main" >
  <div id="logo_font" > SEOUL NARI </div><br><br><br><P>
  <form action="naris/list" method="GET" >
    <input class="sch" type="search" name = "searchText">&nbsp;&nbsp;&nbsp;&nbsp;
    <input class="sch" id = "btn" type="submit" value="이리오너라!" />
  </form>
</div>
</body>
</html>