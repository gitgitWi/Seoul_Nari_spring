<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: abrhm
  Date: 2020-02-27
  Time: 오전 6:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>삭제를 확인합니다</title>
</head>
<body>

<h1>${m.shopName}을 정말로 삭제하시겠습니까?</h1>
<input type="button" value="취소!" onclick="location.href='<c:url value="/naris/list?searchType=${param.searchType}&searchText=${param.SearchText }" />'" />
<FORM ACTION="/naris/delete" method="post">
    <input type="hidden" name="idx" value="${m.idx}" />
    <input type="SUBMIT" value="정말로 삭제!" />
</FORM>
</body>
</html>
