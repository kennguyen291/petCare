<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PetCare Vet Clinic</title>
<link href="public/css/bookingDetail.css" rel="stylesheet"
	type="text/css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">

</head>
<body>

	<script>
		document.addEventListener("readystatechange", function(event) {
			if (document.readyState != "complete") return;
			
			document.querySelectorAll(".time-button").forEach(element => {
				element.addEventListener("click", (event) => {
					document.querySelectorAll(".time-button").forEach(element => {
						element.classList.remove("selected");
					});
					event.target.classList.add("selected");
				});
			});
			
			window.DoSubmit = function () {
				var time = "";
				document.querySelectorAll(".time-button").forEach(element => {
					if (element.classList.contains("selected")) {
						time = element.dataset.time;
					}
				});
				document.getElementById("time").value = time;
				return true;
			}
		});
	</script>
	
	<!-- Header starts -->
	<jsp:include page="layout/header.jsp" />
	<!-- Header ends -->

	<div class="container ">

		<div class="container border border-dark border-1 p-3 m-3">

			<form id="bookingDetail" action="BookingConfirmServlet" onsubmit="return DoSubmit();">
			<input type="hidden" id="time" name="time">
				// TODO: Replace div nests into table or grid
				<div class="row">
					<div class="col">Dr Alex Johnson</div>
					<div class="col-9">
						<div class="row">
							<div class="col">
								<div class="date" data-time="0900">
									<div>Sat</div>
									<div>Jan 21</div>
								</div>
								<div class="time-button" data-time="0900">9:00 AM</div>
								<div class="time-button" data-time="0930">9:30 AM</div>
								<div class="time-button" data-time="1000">10:00 AM</div>
								<div class="time-button" data-time="1030">10:30 AM</div>
							</div>
							<div class="col">Sun</div>
							<div class="col">Mon</div>
							<div class="col">Tue</div>
							<div class="col">Wed</div>
						</div>
					</div>
				</div>

				<div class="d-flex flex-row justify-content-between m-5">
					<div>
						<button type="button" id="back-button">Back</button>
					</div>
					<div>
						<input type="submit" id="next-button" value="Next">
					</div>
				</div>
			</form>
		</div>



	</div>

	<!-- Footer starts -->
	<jsp:include page="layout/footer.jsp" />
	<!-- Footer ends -->

</body>
</html>