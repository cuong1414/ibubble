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
    <link rel="stylesheet" href="<%= request.getContextPath() %>/resources/css/bookblock.css" type="text/css">
    <link rel="stylesheet" href="<%= request.getContextPath() %>/resources/css/magic-bootstrap.css" type="text/css"/>
    <%--<link rel="stylesheet" href="<%= request.getContextPath() %>/resources/css/bootstrap-theme.css" type="text/css"/>--%>
    <%--<link rel="stylesheet" href="<%= request.getContextPath() %>/resources/css/bootstrap-magnify.min.css"--%>
          <%--type="text/css">--%>
    <link rel="stylesheet" href="<%= request.getContextPath() %>/resources/css/custom.css" type="text/css">

    <link rel="shortcut icon" href="img/favicon.ico">

</head>
<body style="background-image: url(http://img34.imageshack.us/img34/4609/80uu.jpg)">

<div class="container box-shadow" style="margin-top: 30px; margin-bottom: 30px; background-color: #ffffff">
    <!-- Banner -->
    <div>
        <img src="${pageContext.request.contextPath}/resources/img/ibubble-banner.png"
             style="max-width: 120px; margin-top: 10px; margin-bottom: 10px">
        <address>
            <strong>Ibubble Shop</strong><br>
            9820 Gulf Free way Suite A9 <br>
            Houston TX 77034<br>
            <abbr title="Phone">P:</abbr> (123) 456-7890
        </address>
    </div>


    <!-- Navigation bar -->
    <jsp:include page="common/navigation-bar.jsp"></jsp:include>

    <!-- Marketting area -->
    <%--<jsp:include page="common/banner.jsp"></jsp:include>--%>

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
<script src="<%= request.getContextPath() %>/resources/js/modernizr.custom.js"></script>
<script src="<%= request.getContextPath() %>/resources/js/jquerypp.custom.js"></script>
<script src="<%= request.getContextPath() %>/resources/js/jquery.bookblock.js"></script>
<script src="<%= request.getContextPath() %>/resources/js/custom.js"></script>
</body>
</html>