<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: WIN7
  Date: 10/11/13
  Time: 11:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Welcome to Ibubble</title>
    <link rel="stylesheet" href="<%= request.getContextPath() %>/resources/css/magic-bootstrap.css" type="text/css"/>
    <%--<link rel="stylesheet" href="<%= request.getContextPath() %>/resources/css/bootstrap-theme.css" type="text/css"/>--%>
    <link rel="stylesheet" href="<%= request.getContextPath() %>/resources/css/bootstrap-magnify.min.css"
          type="text/css">
    <link rel="stylesheet" href="<%= request.getContextPath() %>/resources/css/custom.css" type="text/css">
    <link rel="shortcut icon" href="img/favicon.ico">
</head>
<body style="background-color: #81C245">

<div class="container" style="margin-top: 30px; margin-bottom: 30px; background-color: #ffffff">
    <!-- Banner -->
    <img src="${pageContext.request.contextPath}/resources/img/ibubble-banner.png"
         style="max-width: 120px; margin-top: 10px; margin-bottom: 10px">

    <!-- Navigation bar -->
    <jsp:include page="common/navigation-bar.jsp"></jsp:include>

    <!-- Marketting area -->
    <jsp:include page="common/banner.jsp"></jsp:include>

    <!-- Content Page -->
    <div class="container span9 well">
        <c:if test="${not empty contentPage}">
            <div class="row row-highlight">
                <jsp:include page="common/discount-highlight.jsp"></jsp:include>
            </div>

            <div class="row">
                <jsp:include page="common/${contentPage}.jsp"></jsp:include>
            </div>
        </c:if>
    </div>
</div>

<script src="<%= request.getContextPath() %>/resources/js/jquery-2.0.3.min.js"></script>
<script src="<%= request.getContextPath() %>/resources/js/bootstrap.js"></script>
<script src="<%= request.getContextPath() %>/resources/js/bootstrap-magnify.min.js"></script>
<script src="<%= request.getContextPath() %>/resources/js/custom.js"></script>
</body>
</html>