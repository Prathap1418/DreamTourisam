<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>Sparsh Architecture</title>
	<link href="https://fonts.googleapis.com/css?family=Oswald:300,400,500" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css?family=Roboto:300i,400,500" rel="stylesheet">

	<link rel="stylesheet" href="vendor/themify-icons/themify-icons.css">
	<link rel="stylesheet" href="https://cdn.linearicons.com/free/1.0.0/icon-font.min.css">
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css">
	<link rel="stylesheet" href="vendor/owl-carousel/owl.theme.default.min.css">
	<link rel="stylesheet" href="vendor/owl-carousel/owl.carousel.min.css">
	<link rel="stylesheet" href="vendor/bootstrap/bootstrap.min.css">
  <link rel="stylesheet" href="css/style.css">
</head>
<body>
	<!-- ================Offcanvus Menu Area =================-->
	<div class="side_menu">
			<ul class="list menu_right">
				<li>
					<a href="index.html">Home</a>
				</li>
				<li>
					<a href="about.html">About</a>
				</li>
				<li>
					<a href="<%=request.getContextPath()%>/login">Packages</a>
				</li>
			<li>
					<a href="<%=request.getContextPath()%>/listuserbook">My Bookings</a>
				</li>
				
				
				<li>
					<a href="contact.html">Contact</a>
				</li>
				
				<li>
					<a href="<%=request.getContextPath()%>/new-admin">Admin</a>
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
  <header>
    <div class="hero">
      <a class="navbar-brand" href="index.html">
        <img src="img/logo.png" alt="">
      </a>
      
      <div class="owl-carousel owl-theme heroCarousel">
        <div class="item">
          <div class="hero__slide">
            <img src="img/hero-2.png" alt="">
            <div class="hero__slideContent text-center">
              <h1>Dream Tourisam</h1>
              <p>If you are looking Traveling Partnet Join With us</p>
													
							<span class="hero__slideContent--right"></span>
            </div>
          </div>
        </div>
        <div class="item">
          <div class="hero__slide">
            <img src="img/hero-1.png" alt="">
            <div class="hero__slideContent text-center">
              <h1>Dream Tourisam</h1>
			  <p>If you are looking Traveling Partnet Join With us</p>
							
							<span class="hero__slideContent--right"></span>
            </div>
          </div>
        </div>
        <div class="item">
          <div class="hero__slide">
            <img src="img/hero-3.png" alt="">
            <div class="hero__slideContent text-center">
				<h1>Dream Tourisam</h1>
				<p>If you are looking Traveling Partnet Join With us</p>
													
							<span class="hero__slideContent--right"></span>
            </div>
          </div>
        </div>
      </div>
    </div>
  </header>

	<section class="about section-margin mb-5">
		<div class="container">
			<div class="row align-items-center">
				<div class="col-md-5">
					<div class="about__img text-center text-md-left mb-5 mb-md-0">
						<img class="img-fluid" src="img/about.png" alt="">
						<a href="#/" class="about__img__date text-center">
							<h3>15</h3>
							<p>Years <br> of Creativity</p>
						</a>
					</div>
				</div>
				<div class="col-md-7 pl-xl-5">
					<div class="section-intro">
						<h4 class="section-intro__title">About our Travel Agency</h4>
						<h2 class="section-intro__subtitle">We've been creating <br> Awesome Since 2006</h2>
					</div>
					<p>If you are looking at blank cassettes on the web lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam. Eiusmod tempor incididunt ut labore et dolore magna aliqua consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
					<p>If you are looking at blank cassettes on the web lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt.</p>
					<a class="btn btn--rightBorder mt-4" href="#/">Read More</a>
				</div>
			</div>
		</div>
	</section>
	


	<section class="overview">
		<div class="container">
			<div class="row">
				<div class="col-sm-6 col-lg-4 col-xl-3 mb-4 mb-xl-0">
					<div class="media align-items-center overview__single">
						<span class="overview__single__icon"><i class="ti-crown"></i></span>
						<div class="media-body">
							<h3>400+</h3>
							<p>Destinatinations</p>
						</div>
					</div>
				</div>

				<div class="col-sm-6 col-lg-4 col-xl-3 mb-4 mb-xl-0">
					<div class="media align-items-center overview__single">
						<span class="overview__single__icon"><i class="ti-face-smile"></i></span>
						<div class="media-body">
							<h3>942+</h3>
							<p>Happy Customers</p>
						</div>
					</div>
				</div>

				<div class="col-sm-6 col-lg-4 col-xl-3 mb-4 mb-xl-0">
					<div class="media align-items-center overview__single">
						<span class="overview__single__icon"><i class="ti-user"></i></span>
						<div class="media-body">
							<h3>23+</h3>
							<p>Awards</p>
						</div>
					</div>
				</div>

			
			</div>
		</div>
	</section>
  

	<section class="portfolio section-margin">
		<div class="container">
			<div class="section-intro">
				<h4 class="section-intro__title">OUR SERVICES</h4>
				<h2 class="section-intro__subtitle bottom-border">LETS JOIN WITH US</h2>
			</div>

			<div class="row align-items-end pb-md-5 mb-4">
				<div class="col-md-7 mb-4 mb-md-0">
					<div class="portfolio__img">
						<img class="img-fluid" src="img/portfolio1.png" alt="">
					</div>
				</div>
				<div class="col-md-5 mb-5 pl-xl-5">
				
					<h2 class="section-intro__subtitle small">Luxary Hotels</h2>
					<p>If you are looking at blank cassettes on the web lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt.</p>

				
				</div>
			</div>

			<div class="row align-items-end pb-md-5 mb-4">
				<div class="col-md-5 mb-5 pr-xl-5 order-2 order-md-1">
				
					<h2 class="section-intro__subtitle small">Adventure Places</h2>
					<p>If you are looking at blank cassettes on the web lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt.</p>

				
				</div>
				<div class="col-md-7 mb-4 mb-md-0 order-1 order-md-2">
					<div class="portfolio__img">
						<img class="img-fluid" src="img/portfolio2.png" alt="">
					</div>
				</div>
			</div>

			<div class="row align-items-end pb-md-5 mb-4">
				<div class="col-md-7 mb-4 mb-md-0">
					<div class="portfolio__img">
						<img class="img-fluid" src="img/portfolio3.png" alt="">
					</div>
				</div>

				<div class="col-md-5 mb-5 pl-xl-5">
					
					<h2 class="section-intro__subtitle small">Candle Light Dinners</h2>
					<p>If you are looking at blank cassettes on the web lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt.</p>

				
				</div>
			</div>

			<div class="row align-items-end pb-md-5 mb-4">
				<div class="col-md-5 mb-5 pr-xl-5 order-2 order-md-1">
					
					<h2 class="section-intro__subtitle small">Adventure Sports</h2>
					<p>If you are looking at blank cassettes on the web lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt.</p>


				</div>

				<div class="col-md-7 order-1 order-md-2 mb-4 mb-md-0">
					<div class="portfolio__img">
						<img class="img-fluid" src="img/portfolio4.png" alt="">
					</div>
				</div>
			</div>

			
		</div>
	</section>
	

	<section class="tips tips-bg">
		<div class="container">
			<div class="row align-items-center">
				<div class="col-lg-7 mb-4 mb-lg-0">
					<h2 class="section-intro__subtitle">Get to Join With Our Tour?</h2>
					<p>Click here and view Tour Packages ... Lets celebrate</p>
				</div>
				<div class="col-lg-5 text-center text-lg-right">
					<a class="btn btn-dark btn--leftBorder btn--rightBorder" href="#/">Go To Packages</a>
				</div>
			</div>
		</div>
	</section>

	<section class="testimonial section-margin">
		<div class="container">
			<div class="section-intro">
				<h4 class="section-intro__title">OUR Tour Agency</h4>
				<h2 class="section-intro__subtitle bottom-border">What People Say About Us</h2>
			</div>

			<div class="owl-carousel owl-theme testimonialCarousel">
				<div class="item">
					<div class="media testimonial__slide">
						<img class="img-fluid mr-4" src="img/testimonial.png" width="120" height="125" alt="">
						<div class="media-body">
							<blockquote>
								“If you are looking at blank cassettes on the web lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt amet.”
							</blockquote>
							<h3>Falcon Astle</h3>
						
						</div>
					</div>
				</div>
				<div class="item">
					<div class="media testimonial__slide">
						<img class="img-fluid mr-4" src="img/testimonial.png" width="120" height="125" alt="">
						<div class="media-body">
							<blockquote>
								“If you are looking at blank cassettes on the web lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt amet.”
							</blockquote>
							<h3>Falcon Astle</h3>
					
						</div>
					</div>
        </div>
        <div class="item">
					<div class="media testimonial__slide">
						<img class="img-fluid mr-4" src="img/testimonial.png" width="120" height="125" alt="">
						<div class="media-body">
							<blockquote>
								“If you are looking at blank cassettes on the web lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt amet.”
							</blockquote>
							<h3>Falcon Astle</h3>
							
						</div>
					</div>
        </div>
        <div class="item">
					<div class="media testimonial__slide">
						<img class="img-fluid mr-4" src="img/testimonial.png" width="120" height="125" alt="">
						<div class="media-body">
							<blockquote>
								“If you are looking at blank cassettes on the web lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt amet.”
							</blockquote>
							<h3>Falcon Astle</h3>
						
						</div>
					</div>
        </div>
        <div class="item">
					<div class="media testimonial__slide">
						<img class="img-fluid mr-4" src="img/testimonial.png" width="120" height="125" alt="">
						<div class="media-body">
							<blockquote>
								“If you are looking at blank cassettes on the web lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt amet.”
							</blockquote>
							<h3>Falcon Astle</h3>
					
						</div>
					</div>
				</div>
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
							<input type="email" class="form-control" placeholder="Your email address" required>
							<div class="input-group-append">
								<button class="btn-append" type="submit"><i class="lnr lnr-arrow-right"></i></button>
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
		var testimonialCarousel = $('.testimonialCarousel');
      testimonialCarousel.owlCarousel({
      loop:true,
      margin:80,
      startPosition: 2,
      nav: false,
      responsiveClass:true,
      responsive:{
        0:{
            items:1
        },
        1000:{
            items:2,
            loop:true
        }
      }
    });

    var heroCarousel = $('.heroCarousel');
      heroCarousel.owlCarousel({
      loop:true,
      margin:10,
      nav: false,
      startPosition: 1,
      responsiveClass:true,
      responsive:{
        0:{
            items:1
        }
      }
	});

	var dropToggle = $('.menu_right > li').has('ul').children('a');
	dropToggle.on('click', function() {
		dropToggle.not(this).closest('li').find('ul').slideUp(200);
		$(this).closest('li').children('ul').slideToggle(200);
		return false;
	});

	$( ".toggle_icon" ).on('click', function() {
		$( 'body' ).toggleClass( "open" );
	});

	</script>
</body>
</html>