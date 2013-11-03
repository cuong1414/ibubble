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

<div id="bb-bookblock" class="bb-bookblock bb-vertical">
    <c:forEach begin="0" end="${listDrink.size() - 1}" step="4" varStatus="status">
        <div class="bb-item" style="display: none;">
            <c:set var="maxindex" value="${status.index + 3}"></c:set>
            <c:forEach step="2" begin="${status.index}" end="${maxindex}" varStatus="status2">
                <div class="bb-custom-side" style="background-image: url(${pageContext.request.contextPath}/resources/img/menu-page.jpg)">
                    <c:set var="maxindex2" value="${status2.index + 1}"></c:set>
                    <c:forEach step="1" begin="${status2.index}" end="${maxindex2}" varStatus="status3">
                        <c:set var="drink" value="${listDrink[status3.index]}"></c:set>
                        <c:if test="${not empty drink}">
                            <div class="col-sm-4 col-md-6">
                                <div class="thumbnail" style="margin-bottom: 15px; background: transparent; border: transparent">
                                    <!-- IMAGE CONTAINER -->

                                    <img src='${pageContext.request.contextPath}/resources/img/${drink.imageUrl}' alt="${drink.imageUrl}"
                                         style="max-width: 200px">

                                    <!-- CAPTION -->
                                    <div class="caption">
                                        <!-- PRODUCT TITLE -->
                                        <h3 class="text-center" style="color: #000000">${drink.title}</h3>

                                        <%--<p>${drink.description}</p>--%>

                                        <p>
                                            <h4 class="text-center" style="color: blue; font-size: 30px">
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
                        </c:if>
                    </c:forEach>
                </div>
            </c:forEach>
        </div>
    </c:forEach>
</div>

<div class="row">
    <div class="col-sm-6 col-md-3"><a id="bb-nav-first" href="#" class="bb-custom-icon bb-custom-icon-first"></a>
    </div>
    <div class="col-sm-6 col-md-3"><a id="bb-nav-prev" href="#"
                                      class="bb-custom-icon bb-custom-icon-arrow-left"></a></div>
    <div class="col-sm-6 col-md-3"><a id="bb-nav-next" href="#"
                                      class="bb-custom-icon bb-custom-icon-arrow-right"></a></div>
    <div class="col-sm-6 col-md-3"><a id="bb-nav-last" href="#" class="bb-custom-icon bb-custom-icon-last"></a>
    </div>
</div>

<script>
    window.onload = function () {
        slide_book();
    }
</script>