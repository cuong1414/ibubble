<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: WIN7
  Date: 10/12/13
  Time: 12:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<c:forEach items="${listDrink}" var="drink">
    <div class="col-sm-4 col-md-3">
        <div class="thumbnail" style="margin-bottom: 15px">
            <!-- IMAGE CONTAINER -->

            <img src='${pageContext.request.contextPath}/resources/img/${drink.imageUrl}' alt="${drink.imageUrl}" style="max-width: 200px">

            <!-- CAPTION -->
            <div class="caption">
                <!-- PRODUCT TITLE -->
                <h3 class="text-center">${drink.title}</h3>

                <p>${drink.description}</p>

                <p>
                <h4 class="text-center" style="color:#46a546">
                    <fmt:setLocale value="en_US"/>
                    <fmt:formatNumber value="${drink.sellingPrice}" type="currency" currencySymbol="$"
                                      maxFractionDigits="2"/>
                </h4>
                </p>
            </div>
                <%--<!-- Button -->--%>
                <%--<div class="row-fluid">--%>
                <%--<div class="span6">--%>
                <%--<a class="btn btn-info btn-block" href="#">--%>
                <%--<i class="icon-info-sign"></i>--%>
                <%--More info--%>
                <%--</a>--%>
                <%--</div>--%>
                <%--</div>--%>
        </div>
    </div>
</c:forEach>
