<%@ page import="org.ibubble.util.ConstantManager" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: WIN7
  Date: 10/12/13
  Time: 12:07 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="navbar navbar-default" role="navigation">
    <div class="collapse navbar-collapse navbar-ex1-collapse">
        <ul class="nav navbar-nav">
            <li><a href="${pageContext.request.contextPath}<%=ConstantManager.MAIN_CONTROLLER_MAPPING_URL%>/store-info" style="font-size: 22px" class="nav-item">Store
                information</a></li>
            <li class="dropdown">
                <!-- Button group + sub-menu -->
                <a class="dropdown-toggle" data-toggle="dropdown" href="#" style="font-size: 22px">
                    Category
                    <span class="caret"></span>
                </a>
                <ul class="dropdown-menu" role="menu" aria-labelledby="dLabel">
                    <!-- dropdown menu links -->
                    <c:forEach var="category" items="${listCategory}" varStatus="status">
                        <li class="dropdown-submenu">
                            <a tabindex="${status.count}"
                               href="${pageContext.request.contextPath}<%=ConstantManager.MAIN_CONTROLLER_MAPPING_URL%>/category/${category.url}">
                                    ${category.title}</a>
                        </li>
                    </c:forEach>
                </ul>
            </li>
            <li><a href="#" style="font-size: 22px" class="nav-item">Ibubble conner</a></li>
            <li><a href="#" style="font-size: 22px" class="nav-item">Deals & promotions</a>
            </li>
            <li><a href="#" style="font-size: 22px" class="nav-item">Contact us</a></li>
        </ul>
    </div>
</div>