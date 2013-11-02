<%--
  Created by IntelliJ IDEA.
  User: WIN7
  Date: 10/12/13
  Time: 12:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div id="myCarousel" class="carousel slide" style="margin-top: 30px; margin-bottom: 30px">
    <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>
    <!-- Carousel items -->
    <div class="carousel-inner">
        <div class="active item">
            <img src="${pageContext.request.contextPath}/resources/img/ibubble-banner.png"/>

            <div class="carousel-caption" style="color: #000000">
                <h4>Welcome to Ibubble</h4>

                <p></p>
            </div>
        </div>
        <div class="item">
            <img class="img-center" src="${pageContext.request.contextPath}/resources/img/ibubble-banner.png"/>

            <div class="carousel-caption" style="color: #000000">
                <h4>Welcome to Ibubble</h4>

                <p>2</p>
            </div>
        </div>
        <div class="item">
            <img class="img-center" src="${pageContext.request.contextPath}/resources/img/ibubble-banner.png"/>

            <div class="carousel-caption" style="color: #000000">
                <h4>Welcome to Ibubble</h4>

                <p>3</p>
            </div>
        </div>
    </div>
    <!-- Carousel nav -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">&lsaquo;</a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">&rsaquo;</a>
</div>