<%--
  Created by IntelliJ IDEA.
  User: abrhm
  Date: 2020-02-16
  Time: 오후 3:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>내용 수정</title>
    <style>
        .text {
            width: 300px;
        }
        .btn {
            width: 100px;
            height: 75px;
            cursor: pointer;
        }
    </style>
</head>
<body>

<h1>[ ${m.shopName } ]의 내용을 수정합니다.</h1>

<form action="/naris/modify" method="post">
    <input type="hidden" name="idx" value="${m.idx}">
    상호 수정 : <input class="text" type="text" name="shopName" value="${m.shopName}"> <br><br>
    1인당 지불 금액 수정 : <input class="text" type="text" name="shopAvgPrice" placeholder="금액(숫자)만 입력해주세요" value="${m.shopAvgPrice }" pattern="\d+" required/> <br><br>
    장소 수정 : <input class="text" type="text" name="shopAddr" required value="${m.shopAddr }"/> <br><br>

    <input class="btn" type="reset" value="다시 쓰기!"> &nbsp;&nbsp;&nbsp;
    <input class="btn" type="submit" value="수정 완료!">

</form>
</body>
</html>
