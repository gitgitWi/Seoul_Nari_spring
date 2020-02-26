<%--
  Created by IntelliJ IDEA.
  User: abrhm
  Date: 2020-02-13
  Time: 오후 9:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<fmt:requestEncoding value="UTF-8"/>

<html>
<head>
    <title>Seoul Naris</title>
    <style>
        div.resultfont {
            text-align: center;
            color: #565656;
        }

        div.noresultfont {
            text-align: center;
            font-style: italic;
            font-weight: bolder;
            color: crimson;
        }

        .SEARCH {
            alignment: right;
        }

        #SEARCH_BAR {
            height: 60px;
        }

        #SEARCH_BTN {
            width: 200px;
            height: 60px;
            color: #565656;
            background-color: #ffdf00;
            border-color: #565656;
            border-width: 2px;
            cursor: pointer;
        }

        #NARI_BTN {
            width: 150px;
            height: 50px;
            color: #565656;
            background-color: #ffdf00;
            border-width: 0px;
            font-weight: bolder;
            cursor: pointer;
        }
        p {
            text-align: center;
        }
        .textalign {
            text-align: center;

        }
    </style>
</head>
<body>
<h1>Seoul Nari Stores</h1>
<div class="SEARCH">
    <form action="list" method="GET">
        <INPUT ID="SEARCH_BAR" TYPE="search" NAME="searchText" value="<c:out value="${searchText}"/>">
        <SELECT ID="SEARCH_BAR" name="searchType">
            <option VALUE="ALL" selected> 전부 다</option>
            <option VALUE="NAME"
                    <c:if test="${searchType eq 'NAME'}">SELECTED</c:if> > 나릿집 이름들
            </option>
            <option VALUE="ADDRESS"
                    <c:if test="${searchType eq 'ADDRESS'}">SELECTED</c:if> > 나릿집 주소들
            </option>
        </SELECT>
        <input ID="SEARCH_BTN" type="submit" value="이리오너라!">
    </form>
</div>
<p>
    <c:choose>
        <c:when test="${searchText eq ''}">
            <c:out value="나릿집 전체를 대령하였습니다요~"/>
        </c:when>
        <c:otherwise>
            불러오신 ${searchText}에 대한
            <c:set var="type" value="${searchType}"/>
            <c:choose>
                <c:when test="${type == 'ALL'}"> <c:out value="전체"/> </c:when>
                <c:when test="${type == 'NAME'}"> <c:out value="상호"/> </c:when>
                <c:when test="${type == 'ADDRESS'}"> <c:out value="주소"/> </c:when>
            </c:choose> 결과 입니다요~
        </c:otherwise>
    </c:choose>
</p>

<hr>
<c:choose>
    <c:when test="${list.size()==0}">
        <div class="noresultfont">검색 결과가 없습니다ㅠㅠ</div>
    </c:when>

    <c:otherwise>
        <div class="resultfont">
            <table>
                <tr class="textalign">
                    <td></td>
                    <td class="textalign">1인 평균 금액!</td>
                    <td class="textalign">주소</td>
                    <td class="textalign">등록일</td>
                    <td class="textalign">조회수</td>
                    <td class="textalign">좋아요</td>

                </tr>
                <c:forEach var="place" items="${list}" varStatus="p">

                    <tr class="textalign">
                        <td><input id="NARI_BTN" type="button" value="${place.shopName}"
                                   onclick="location.href='view/${place.idx}'"/></td>
                        <td>${place.shopAvgPrice}원!</td>
                        <td>${place.shopAddr}</td>
                        <td>${fn:substring(place.regDate, 0, 10)}</td>
                        <td>${place.hit}</td>
                        <td>${place.good}</td>
                    </tr>

                </c:forEach>
            </table>
        </div>
    </c:otherwise>
</c:choose>

<hr>
<footer style="text-align: right;">
<INPUT TYPE="button" VALUE="첫화면으로" STYLE="{ WIDTH : 100PX; height: 75px; alignment: right; border-style: solid;   }"
       ONCLICK="location.href='../index.jsp'"/>
<INPUT TYPE="button" VALUE="새나리 추가!" ONCLICK="location.href='<c:url value="/naris/write"/>'"/>
</footer>
</body>
</html>