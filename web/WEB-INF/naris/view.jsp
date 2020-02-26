<%--
  Created by IntelliJ IDEA.
  User: abrhm
  Date: 2020-02-16
  Time: 오전 3:02
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>${m.idx} : ${m.shopName }</title>
    <style>
        #repls{
            width: 80%;
            text-align: center;
        }
    </style>
</head>
<body>
<h1>${m.shopName }의 상세 내용을 불러왔습니다~</h1>

<hr>
주소 : ${m.shopAddr } <br><br>

나리 1인당 지출 금액 : ${m.shopAvgPrice } 원 <br><br>

<hr>

추천수 : ${m.good} <br>
조회수 : ${m.hit } <br>
등록일 : ${m.regDate } <br>
수정일 : ${m.modDate } <br>

<hr>
<div id="repls">

    <jsp:include page="/repls/reply/${m.idx}" flush="false"></jsp:include>

</div>
<hr>
<input type = "button" value="수정" onclick="location.href='/naris/modify/${m.idx }'" /> &nbsp;&nbsp;&nbsp;
<input type = "button" value="삭제" onclick="location.href='/naris/delete/${m.idx }'" /> &nbsp;&nbsp;&nbsp;
<input type = "button" value="목록으로" onclick="location.href='<c:url value="/naris/list?searchType=${param.searchType}&searchText=${param.SearchText }" />'" />
</body>
</html>