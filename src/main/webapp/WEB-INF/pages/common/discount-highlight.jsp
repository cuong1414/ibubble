<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: WIN7
  Date: 10/12/13
  Time: 4:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:if test="${not empty listDiscount}">
    <c:forEach var="discount" items="${listDiscount}">
        <h3><em><span class="label label-warning">${discount.discountTypeDescription}</span></em></h3>
        <br>
    </c:forEach>
</c:if>