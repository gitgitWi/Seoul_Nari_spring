<%--
  Created by IntelliJ IDEA.
  User: abrhm
  Date: 2020-02-16
  Time: 오전 3:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<style>
    div.reply {
        position: relative;
    }

    #replytext {
        width: 800px;
        height: 50px;

    }

    #BTN {
        width: 200px;
        height: 50px;
        border: 1px solid #565656;
        background-color: #ffdf00;
        color: #565656;
        position: relative;
        right: 0%;
    }
</style>

<div class="reply">

    <p>
    <h3>이 나릿집에 대한 평가글</h3> <br>

    <c:choose>
        <c:when test="${repls.size() == 0}"> <br><i>아직 평가가 없어요ㅠㅠ</i> </c:when>
        <c:otherwise>
            <c:forEach var="rp" items="${repls}" varStatus="r">
                <table>
                    <colgroup>
                        <col width="150px">
                        <col width="400px">
                        <col width="100px">
                        <col width="100px">
                    </colgroup>
                    <tr>
                        <th>ip</th>
                        <th>reply</th>
                        <th>date</th>
                        <th> </th>
                    </tr>
                    <tr>
                        <td><c:out value="[${fn:substring(rp.ip, 0, 6) }***]"/></td>
                        <td><c:out value="${rp.reply }"/></td>
                        <td>[ <c:out value="${rp.regDate}"/> ]</td>
                        <td><input type="button" value="댓글 삭제"
                                   onclick="location.href='delreplcheck.jsp?idx=${rp.idx }&placeNum=${rp.shopNum}&searchText=${param.searchText}&searchType=${param.searchType}'"/></td>
                    </tr>

                </table>

            </c:forEach>
        </c:otherwise>

    </c:choose>
    </p>
        <p>
        <FORM ACTION="/repls/reply/${shopNum}" METHOD="post">
            <INPUT TYPE="HIDDEN" NAME="shopNum" VALUE="${shopNum }"/>
            <INPUT id="replytext" TYPE="TEXT" NAME="reply" PLACEHOLDER="   이 식당에 대한 당신의 평가는?"/> &nbsp;&nbsp;&nbsp;
            <INPUT ID="BTN" TYPE="SUBMIT" VALUE="입력!"/>
        </FORM>
        </p>

</div>

