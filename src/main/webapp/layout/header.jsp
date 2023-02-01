<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<header>
	<div class="container-fluid pt-4">

		<div class="row pb-3">
			<div class="container ps-5">
				<div class="row">
					<div class="col-6">

						<a href="/pet-care/BookingServlet">
							<button type="button" class="btn btn-primary">Book
								Appointment</button>
						</a>

					</div>
					<div class="col">
						<div>1068 Victoria Road</div>
						<div>West Ryde 2114</div>
					</div>
					<div class="col">
						<div>Phone</div>
						<div>(02) 1234 1234</div>
					</div>
				</div>

			</div>

		</div>

		<div class="row bg-body-tertiary ps-5 pe-5">

			<nav class="navbar navbar-expand bg-body-tertiary">
				<div class="container-fluid">
					<a class="navbar-brand" href="#"> <img alt=""
						src="public/images/petcare-logo.png" class="w-25">
					</a>

					<div class="collapse navbar-collapse" id="navbarSupportedContent">
						<ul class="navbar-nav me-auto mb-2 mb-lg-0">
							<li class="nav-item"><a class="nav-link active"
								aria-current="page"
								href="http://localhost:8080/pet-care/HomeServlet">Home </a></li>

							<li class="nav-item"><a class="nav-link active"
								aria-current="page" href="#">Services </a></li>

							<li class="nav-item"><a class="nav-link active"
								aria-current="page" href="#">Shops </a></li>
							<li class="nav-item"><a class="nav-link active"
								aria-current="page"
								href="http://localhost:8080/pet-care/BookingServlet">Bookings
							</a></li>
							<li class="nav-item"><a class="nav-link active"
								aria-current="page" href="#">Contact Us </a></li>


						</ul>
						<div class="navbar-text">
							<button type="button" class="btn btn-primary">Log In</button>
						</div>
					</div>
				</div>
			</nav>

		</div>
	</div>

	<script>
		function handleClickBooking() {
			console.log("Booking clicked");
		}
	</script>
</header>