<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<meta name="Haoyuan&Luying" content="CS6221 Project_demo">
<meta http-equiv="X-UA-Compatible" content="IE=edge">

<title>Clothcare|Your Personal Fashion Companion</title>

<!-- Style CSS -->
<link rel="stylesheet" href="${ctx}/style.css">

</head>
<body>

<!-- Preloader Start -->
<div id="preloader">
    <div class="preload-content">
        <div id="sonar-load"></div>
    </div>
</div>
<!-- Preloader End -->

<!-- Grids -->
<div class="grids d-flex justify-content-between">
    <div class="grid1"></div>
    <div class="grid2"></div>
    <div class="grid3"></div>
    <div class="grid4"></div>
    <div class="grid5"></div>
    <div class="grid6"></div>
    <div class="grid7"></div>
    <div class="grid8"></div>
    <div class="grid9"></div>
</div>
    
<!-- ***** Main Menu Area Start ***** -->
<div class="mainMenu d-flex align-items-center justify-content-between">
    <!-- Close Icon -->
    <div class="closeIcon">
        <i class="ti-close" aria-hidden="true"></i>
    </div>
    <!-- Logo Area -->
    <div class="logo-area">
        <a href="index.html">Clothcare</a>
    </div>
    <!-- Nav -->
    <div class="sonarNav wow fadeInUp" data-wow-delay="1s">
        <nav>
            <ul>
                <li class="nav-item active">
                    <a class="nav-link" href="index.html">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Match</a>
                </li>
                 <li class="nav-item">
                    <a class="nav-link" href="recommand.html">Recommand</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="shopping.html">Shopping</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="compare.html">Comparing</a>
                </li>
            </ul>
        </nav>
    </div>
    <!-- Copwrite Text -->
        <div class="copywrite-text">
            <p>CS6221  <script>document.write(new Date().getFullYear());</script>  Fashion Companion Team All rights reserved </p>
        </div>
    
</div>
<!-- ***** Main Menu Area End ***** -->

<!-- ***** Header Area Start ***** -->
<header class="header-area">
    <div class="container-fluid">
        <div class="row">
            <div class="col-12">
                <div class="menu-area d-flex justify-content-between">
                    <!-- Logo Area  -->
                    <div class="logo-area">
                        <a href="index.html">Clothcare</a>
                    </div>
                    <div class="menu-content-area d-flex align-items-center">
                            <div class="header-social-area d-flex align-items-center">
                                <a><i>Welcome ${sessionScope.user_session.uname}!</i></a>
                            </div>
                         <!-- Menu Icon -->
                         <span class="navbar-toggler-icon" id="menuIcon"></span>
                    </div>
                </div>
            </div>
        </div>
    </div>
</header>
<!-- ***** Header Area End ***** -->

<!-- ***** Hero Area Start ***** -->
    <section class="hero-area">
        <div class="hero-slides owl-carousel">
            <!-- Single Hero Slide -->
            <div class="single-hero-slide bg-img slide-background-overlay" style="background-image: url(${ctx}/img/bg-img/slide1.jpg);">
                <div class="container h-100">
                    <div class="row h-100 align-items-end">
                        <div class="col-12">
                            <div class="hero-slides-content">
                                <div class="line"></div>
                                <h2>Cowboy Style</h2>
                                <p>The denim jacket is definitely an ordinary item, but it is definitely one of the best value for money. In addition to the summer, the rest of the time can be used to match, and this casual quality is very strong, also It is best for mashups, not too good for the limelight, but definitely the best supporting role.</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Single Hero Slide -->
            <div class="single-hero-slide bg-img slide-background-overlay" style="background-image: url(${ctx}/img/bg-img/slide2.jpg);">
                <div class="container h-100">
                    <div class="row h-100 align-items-end">
                        <div class="col-12">
                            <div class="hero-slides-content">
                                <div class="line"></div>
                                <h2>Leisure Style</h2>
                                <p>There is no need to repeat the importance of the suit. Although there are still many new generations of trendy men who are biased against it, they always feel that it is a boring business image, but it is time to change. In addition to the fact that you can dress vividly and not old, many brands are not doing business suits from the beginning.</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Single Hero Slide -->
            <div class="single-hero-slide bg-img slide-background-overlay" style="background-image: url(${ctx}/img/bg-img/slide3.jpg);">
                <div class="container h-100">
                    <div class="row h-100 align-items-end">
                        <div class="col-12">
                            <div class="hero-slides-content">
                                <div class="line"></div>
                                <h2>Warm Style</h2>
                                <p>In fact, many men choose camel coats because they are simple and generous, but they look noble and fashionable. If you are attending some business occasions, you can put a few different styles of camel coats on the outside of the suit. Basically, the neutral or light color is very good. Many business people match this with the overbearing president.</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Single Hero Slide -->
            <div class="single-hero-slide bg-img slide-background-overlay" style="background-image: url(${ctx}/img/bg-img/slide4.jpg);">
                <div class="container h-100">
                    <div class="row h-100 align-items-end">
                        <div class="col-12">
                            <div class="hero-slides-content">
                                <div class="line"></div>
                                <h2>Sports Style</h2>
                                <p>Compared with traditional conservative colors and fabrics, customers must consider them to be stable and reliable. At this time, we recommend double-strand double-yarn British fabrics. Solid color and striped fabrics will be the first choice in most cases. They are more suitable for complete sets. Secondly, their own rigorous and solemn feeling is unmatched by other types of fabrics.</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Single Hero Slide -->
            <div class="single-hero-slide bg-img slide-background-overlay" style="background-image: url(${ctx}/img/bg-img/slide1.jpg);">
                <div class="container h-100">
                    <div class="row h-100 align-items-end">
                        <div class="col-12">
                            <div class="hero-slides-content">
                                <div class="line"></div>
                                <h2>Cowboy Style</h2>
                                <p>The denim jacket is definitely an ordinary item, but it is definitely one of the best value for money. In addition to the summer, the rest of the time can be used to match, and this casual quality is very strong, also It is best for mashups, not too good for the limelight, but definitely the best supporting role.</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Single Hero Slide -->
            <div class="single-hero-slide bg-img slide-background-overlay" style="background-image: url(${ctx}/img/bg-img/slide2.jpg);">
                <div class="container h-100">
                    <div class="row h-100 align-items-end">
                        <div class="col-12">
                            <div class="hero-slides-content">
                                <div class="line"></div>
                                <h2>Leisure Style</h2>
                                <p>There is no need to repeat the importance of the suit. Although there are still many new generations of trendy men who are biased against it, they always feel that it is a boring business image, but it is time to change. In addition to the fact that you can dress vividly and not old, many brands are not doing business suits from the beginning.</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Single Hero Slide -->
            <div class="single-hero-slide bg-img slide-background-overlay" style="background-image: url(${ctx}/img/bg-img/slide3.jpg);">
                <div class="container h-100">
                    <div class="row h-100 align-items-end">
                        <div class="col-12">
                            <div class="hero-slides-content">
                                <div class="line"></div>
                                <h2>Warm Style</h2>
                                <p>In fact, many men choose camel coats because they are simple and generous, but they look noble and fashionable. If you are attending some business occasions, you can put a few different styles of camel coats on the outside of the suit. Basically, the neutral or light color is very good. Many business people match this with the overbearing president.</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Single Hero Slide -->
            <div class="single-hero-slide bg-img slide-background-overlay" style="background-image: url(${ctx}/img/bg-img/slide4.jpg);">
                <div class="container h-100">
                    <div class="row h-100 align-items-end">
                        <div class="col-12">
                            <div class="hero-slides-content">
                                <div class="line"></div>
                                <h2>Sports Style</h2>
                                <p>Compared with traditional conservative colors and fabrics, customers must consider them to be stable and reliable. At this time, we recommend double-strand double-yarn British fabrics. Solid color and striped fabrics will be the first choice in most cases. They are more suitable for complete sets. Secondly, their own rigorous and solemn feeling is unmatched by other types of fabrics.</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div><!-- Single Hero Slide -->
            <div class="single-hero-slide bg-img slide-background-overlay" style="background-image: url(${ctx}/img/bg-img/slide1.jpg);">
                <div class="container h-100">
                    <div class="row h-100 align-items-end">
                        <div class="col-12">
                            <div class="hero-slides-content">
                                <div class="line"></div>
                                <h2>Cowboy Style</h2>
                                <p>The denim jacket is definitely an ordinary item, but it is definitely one of the best value for money. In addition to the summer, the rest of the time can be used to match, and this casual quality is very strong, also It is best for mashups, not too good for the limelight, but definitely the best supporting role.</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Single Hero Slide -->
            <div class="single-hero-slide bg-img slide-background-overlay" style="background-image: url(${ctx}/img/bg-img/slide2.jpg);">
                <div class="container h-100">
                    <div class="row h-100 align-items-end">
                        <div class="col-12">
                            <div class="hero-slides-content">
                                <div class="line"></div>
                                <h2>Leisure Style</h2>
                                <p>There is no need to repeat the importance of the suit. Although there are still many new generations of trendy men who are biased against it, they always feel that it is a boring business image, but it is time to change. In addition to the fact that you can dress vividly and not old, many brands are not doing business suits from the beginning.</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Single Hero Slide -->
            <div class="single-hero-slide bg-img slide-background-overlay" style="background-image: url(${ctx}/img/bg-img/slide3.jpg);">
                <div class="container h-100">
                    <div class="row h-100 align-items-end">
                        <div class="col-12">
                            <div class="hero-slides-content">
                                <div class="line"></div>
                                <h2>Warm Style</h2>
                                <p>In fact, many men choose camel coats because they are simple and generous, but they look noble and fashionable. If you are attending some business occasions, you can put a few different styles of camel coats on the outside of the suit. Basically, the neutral or light color is very good. Many business people match this with the overbearing president.</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Single Hero Slide -->
            <div class="single-hero-slide bg-img slide-background-overlay" style="background-image: url(${ctx}/img/bg-img/slide4.jpg);">
                <div class="container h-100">
                    <div class="row h-100 align-items-end">
                        <div class="col-12">
                            <div class="hero-slides-content">
                                <div class="line"></div>
                                <h2>Sports Style</h2>
                                <p>Compared with traditional conservative colors and fabrics, customers must consider them to be stable and reliable. At this time, we recommend double-strand double-yarn British fabrics. Solid color and striped fabrics will be the first choice in most cases. They are more suitable for complete sets. Secondly, their own rigorous and solemn feeling is unmatched by other types of fabrics.</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- ***** Hero Area End ***** -->
    
    <!-- ***** Call to Action Area Start ***** -->
    <div class="sonar-call-to-action-area section-padding-0-100">
        <div class="container">
            <div class="row">
                <div class="col-12">
                    <div class="call-to-action-content wow fadeInUp" data-wow-delay="0.5s">
                        <h2>Your Personal Fashion Companion.</h2>
                        <h5>Let's be more handsome!</h5>
                        <a href="#" class="btn sonar-btn mt-100">Match</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- ***** Call to Action Area End ***** -->

<!-- jQuery (Necessary for All JavaScript Plugins) -->
<script src="${ctx}/js/jquery/jquery-2.2.4.min.js"></script>
<!-- Popper js -->
<script src="${ctx}/js/popper.min.js"></script>
<!-- Bootstrap js -->
<script src="${ctx}/js/bootstrap.min.js"></script>
<!-- Plugins js -->
<script src="${ctx}/js/plugins.js"></script>
<!-- Active js -->
<script src="${ctx}/js/active.js"></script>

</body>
</html>