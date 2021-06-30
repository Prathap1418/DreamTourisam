
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">


<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Projects</title>
<link href="https://fonts.googleapis.com/css?family=Oswald:300,400,500"
	rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Roboto:300i,400,500"
	rel="stylesheet">

<link rel="stylesheet" href="vendor/themify-icons/themify-icons.css">
<link rel="stylesheet"
	href="https://cdn.linearicons.com/free/1.0.0/icon-font.min.css">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.6.3/css/all.css">
<link rel="stylesheet"
	href="vendor/owl-carousel/owl.theme.default.min.css">
<link rel="stylesheet" href="vendor/owl-carousel/owl.carousel.min.css">
<link rel="stylesheet" href="vendor/bootstrap/bootstrap.min.css">
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<!-- ================Offcanvus Menu Area =================-->
	<div class="side_menu">
		<ul class="list menu_right">
			<li><a href="index.html">Home</a></li>
			<li><a href="about.html">About</a></li>
		
			
		<li>
					<a href="<%=request.getContextPath()%>/list-userpack">Packages</a>
				</li>
				<li>
					<a href="<%=request.getContextPath()%>/listuserbook">My Bookings</a>
				</li>
			<li><a href="contact.html">Contact</a></li>
			<li>
					<a href="index.jsp">Log Out</a>
				</li>
		</ul>
	</div>
	<!--================End Offcanvus Menu Area =================-->

	<!--================Canvus Menu Area =================-->
	<div class="canvus_menu">
		<div class="container">
			<div class="float-right">
				<div class="toggle_icon" title="Menu Bar">
					<span></span>
				</div>
			</div>
		</div>
	</div>
	<!--================End Canvus Menu Area =================-->

	<header class="hero-banner project-bg">
		<a class="navbar-brand" href="index.html"> <img src="img/logo.png"
			alt="">
		</a>

		<div class="container">
			<h2 class="section-intro__subtitle">Our Packages</h2>
			<div class="btn-group breadcrumb">
				<a href="#/" class="btn">Home</a> <span class="btn btn--rightBorder">Packages</span>
			</div>
		</div>
	</header>

	<section class="portfolio section-margin">
		<div class="container">
			<div class="section-intro">
				<h4 class="section-intro__title">OUR Packages</h4>
				<h2 class="section-intro__subtitle bottom-border">Latest
					Packages</h2>
			</div>
<c:forEach var="user" items="${listRooms}">
			<div class="row align-items-end pb-md-5 mb-4">
			
			
				<div class="col-md-7 mb-4 mb-md-0">
					<div class="portfolio__img">
						<img class="img-fluid" src="img/portfolio3.png" alt="">
					</div>
				</div>
				<div class="col-md-5 mb-5 pl-xl-5">
					<h4 class="section-intro__title left-border">Start Date :- <c:out value="${user.start}" /></h4>
						<h4 class="section-intro__title left-border">Days :- <c:out value="${user.days}" /></h4>
					<h2 class="section-intro__subtitle small">Package :- <c:out value="${user.name}" /></h2>
					<p>Amount :- <c:out value="${user.cost}" /></p>
					<p>Destinations :- <c:out value="${user.destinations}" /></p>
					<p><c:out value="${user.description}" /></p>
					<a class="btn btn--rightBorder mt-3" href="<%=request.getContextPath()%>/new-userbooking?id=<c:out value='${user.id}' />">Book Now</a>
				</div>
			</div>
</c:forEach>
			<div class="text-center pt-2">
				<button class="btn btn--rightBorder btn--leftBorder">Load
					More Projects</button>
			</div>
		</div>
	</section>

	<footer class="footer footer-bg">
		<div class="container">
			<div class="row">

				<div class="col-sm-4 col-lg-2 mb-4 mb-lg-0 text-left">
					<h3 class="footer__title">Resources</h3>
					<ul class="footer__link">
						<li><a href="#/">Guides</a></li>
						<li><a href="#/">About us</a></li>
						<li><a href="#/">Contact</a></li>

					</ul>
				</div>
				<div class="col-sm-8 col-lg-4 mb-4 mb-lg-0 text-left">
					<h3 class="footer__title">Newsletter</h3>
					<p>You can trust us. we only send promo offers,</p>
					<form action="" class="form-subscribe">
						<div class="input-group">
							<input type="email" class="form-control"
								placeholder="Your email address" required>
							<div class="input-group-append">
								<button class="btn-append" type="submit">
									<i class="lnr lnr-arrow-right"></i>
								</button>
							</div>
						</div>
					</form>
				</div>
			</div>

		</div>
	</footer>



	<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
	<script src="vendor/bootstrap/bootstrap.bundle.min.js"></script>
	<script src="vendor/owl-carousel/owl.carousel.min.js"></script>

	<script>
		var dropToggle = $('.menu_right > li').has('ul').children('a');
		dropToggle.on('click', function() {
			dropToggle.not(this).closest('li').find('ul').slideUp(200);
			$(this).closest('li').children('ul').slideToggle(200);
			return false;
		});

		$(".toggle_icon").on('click', function() {
			$('body').toggleClass("open");
		});
	</script>
</body>
</html>