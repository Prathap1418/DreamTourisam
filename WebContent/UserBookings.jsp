<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>

	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="Table1/images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="Table1/vendor/bootstrap/css/bootstrap.min.css">
<!--=============================================Table1/==================================================-->
	<link rel="stylesheet" type="text/css" href="Table1/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--=============================================Table1/==================================================-->
	<link rel="stylesheet" type="text/css" href="Table1/vendor/animate/animate.css">
<!--=============================================Table1/==================================================-->
	<link rel="stylesheet" type="text/css" href="Table1/vendor/select2/select2.min.css">
<!--=============================================Table1/==================================================-->
	<link rel="stylesheet" type="text/css" href="Table1/vendor/perfect-scrollbar/perfect-scrollbar.css">
<!--=============================================Table1/==================================================-->
	<link rel="stylesheet" type="text/css" href="Table1/css/util.css">
	<link rel="stylesheet" type="text/css" href="Table1/css/main.css">
<!--=============================================Table1/==================================================-->
</head>

<style>
.Home
{
width: 115px;
    border-radius: 4px;
    height: 35px;
    font-size: 18px;
    color: white;
    background: #0bcad0;
    margin-left: 122px;
    margin-top: 22px;
    }
    .cancel
{
width: 75px;
    border-radius: 4px;
    height: 35px;
    font-size: 18px;
    padding:5px;
    color: white !important;
    background: red;
   
    ;
    }
    
    .column1 {
    width: 12% !important;
    padding-left: 40px;
}
</style>
<body>
	
	<div class="limiter" >
		<div class="Home">
		<a href="<%=request.getContextPath()%>/list-userpack" style="padding:10px">Go Back</a>
		</div>
		
		
		
		<div class="container-table100">
		
	
		
			<div class="wrap-table100">
				<div class="table100 ver1 m-b-110">
					<div class="table100-head">
						<table>
							<thead>
								<tr class="row100 head">
									<th class="cell100 column1">Package</th>
									<th class="cell100 column2">Start Date</th>
									<th class="cell100 column3">Days</th>
									<th class="cell100 column4">Booked Date</th>
									<th class="cell100 column5">Status</th>
									<th class="cell100 column6">Total</th>
									<th class="cell100 column7">Action</th>
								</tr>
							</thead>
						</table>
					</div>

					<div class="table100-body js-pscroll">
						<table>
							<tbody>
							<c:forEach var="user" items="${listRoomBooking}">
								<tr class="row100 body">
									<td class="cell100 column1"><c:out value="${user.tourpack}" /></td>
									<td class="cell100 column2"><c:out value="${user.start}" /></td>
									<td class="cell100 column3"><c:out value="${user.days}" /></td>
									<td class="cell100 column4"><c:out value="${user.bookingdate}" /></td>
									<td class="cell100 column5"><c:out value="${user.status}" /></td>
									<td class="cell100 column6"><c:out value="${user.amount}" /></td>
										<td class="cell100 column7">
										
										<div class="cancel">
										<a href="usercancel?id=<c:out value='${user.id}' />" >Cancel</a>
										</div>
										
										
										
										</td>								
								</tr>
	</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
				
			
			</div>
		</div>
	</div>


<!--===============================================================================================-->	
	<script src="Table1/vendor/jquery/jquery-3.2.1.min.js"></script>
<!--=============table1/==================================================================================-->
	<script src="Table1/vendor/bootstrap/js/popper.js"></script>
	<script src="Table1/vendor/bootstrap/js/bootstrap.min.js"></script>
<!--=============table1/==================================================================================-->
	<script src="Table1/vendor/select2/select2.min.js"></script>
<!--=============table1/==================================================================================-->
	<script src="Table1/vendor/perfect-scrollbar/perfect-scrollbar.min.js"></script>
	<script>
		$('.js-pscroll').each(function(){
			var ps = new PerfectScrollbar(this);

			$(window).on('resize', function(){
				ps.update();
			})
		});
			
		
	</script>
<!--===============================================================================================-->
	<script src="js/main.js"></script>

</body>
</html>