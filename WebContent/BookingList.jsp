<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>			
	<%@include file="header.jsp" %>
		<div class="container" style="margin-left: 20%; padding-top:5%">
			<h3 class="text-center">List of Bookings</h3>
			<hr>
			<div class="container text-left">

				<a href="<%=request.getContextPath()%>/new-booking" class="btn btn-success">Add Booking</a>
			</div>
			
			
			<br>
			<table class="table table-bordered">
				<thead>
					<tr>
					
						<th>User</th>
						<th>Email</th>
						<th>Tour Package</th>
						<th>Start</th>
						<th>Days</th>
						<th>Booking Date</th>
						<th>Status</th>
						<th> Total Amount</th>
						
						<th>Actions</th>
					</tr>
				</thead>
				<tbody>
				
					<c:forEach var="user" items="${listRoomBooking}">

						<tr>
							<td><c:out value="${user.user}" /></td>
							<td><c:out value="${user.email}" /></td>
							<td><c:out value="${user.tourpack}" /></td>
							<td><c:out value="${user.start}" /></td>
							<td><c:out value="${user.days}" /></td>
							<td><c:out value="${user.bookingdate}" /></td>
							<td><c:out value="${user.status}" /></td>
							<td><c:out value="${user.amount}" /></td>
					

							<td><a href="edit-booking?id=<c:out value='${user.id}' />">Edit</a>
								&nbsp;&nbsp;&nbsp;&nbsp; <a
								href="delete-booking?id=<c:out value='${user.id}' />">Delete</a></td>
						</tr>
					</c:forEach>
					<!-- } -->
				</tbody>

			</table>
		</div>
</body>
</html>