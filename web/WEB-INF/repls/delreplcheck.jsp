<%--
  Created by IntelliJ IDEA.
  User: abrhm
  Date: 2020-02-16
  Time: 오후 6:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>댓글 삭제 확인</title>
</head>
<body>

<h1>댓글을 삭제하시겠습니까?</h1>

<input type="button" value="뒤로가기" onclick="location.href='view?idx=${param.placeNum}&searchText=${param.searchText}&searchType=${param.searchType}'"/>
<form action="delrepl" method="post">
    <input type="hidden" name="idx" value="${param.idx}"/>
    <input type="hidden" name="placeNum" value="${param.placeNum}"/>
    <input type="hidden" name="searchType" value="${param.searchType}"/>
    <input type="hidden" name="searchText" value="${param.searchText}"/>
    <input type="submit" value="댓글 삭제"/>
</form>
</body>
</html>
