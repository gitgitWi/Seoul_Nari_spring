<%--
  Created by IntelliJ IDEA.
  User: abrhm
  Date: 2020-02-16
  Time: 오전 10:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>새나리 추가하기</title>

    <style>
        .btn {
            width: 200px;
            height: 75px;
            border: 0px;
            cursor: pointer;
        }
        #reset {
            border-width: 1px;
            border-color: indigo;
            color: indigo;
            background-color: azure;
        }

        #submit {
            color: azure;
            background-color: indigo;
        }

    </style>
</head>
<body>

<h1>당신이 발견한 새-나리!</h1>

<Form action="/naris/write" method="post">
    <p>
        나릿집 이름 : <input type="text" name="shopName" placeholder="300자 이내" maxlength="300" required/> <br><br>
        나릿집 주소 : <input type="text" name="shopAddr" placeholder="2000자 이내" maxlength="2000" required/> <br><br>
        1인당 지출금액 : <input type="text" name="shopAvgPrice" placeholder="숫자만 입력" pattern="\d+" required/>
    </p>
    <input class="btn" id="reset" type="reset" value="다시쓰자!"> &nbsp;&nbsp;&nbsp;
    <input class="btn" id="submit" type="submit" value="등록하기!">
</Form>

</body>
</html>
