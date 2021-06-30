<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "hotel";
String userid = "root";
String password = "";
String User=request.getParameter("User");
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<!DOCTYPE html>
<html>
<body>
	<div class="container" style="margin-left: 20%; padding-top: 5%">
	<%@include file="header.jsp"%>
<form class="form-inline" method="post" action="InventorySearch.jsp">
<input type="text" name="User" class="form-control" placeholder="Search user name..">
<button type="submit" name="save" class="btn btn-primary">Search</button>
</form>


<table class="table table-bordered">
			<thead>
				<tr>

					<th>Inventory Name</th>
					<th>Supplier Name</th>
					<th>Supllier Id</th>
					<th>Supplier Date</th>
					<th>Quantity</th>
					<th>Price</th>
					
				</tr>
			</thead>
					<tbody>
<%
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select * from veichlereservation WHERE User LIKE '"+ User + "%';";
System.out.println(sql);
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr>
<td><%=resultSet.getString("User") %></td>
<td><%=resultSet.getString("Nic") %></td>
<td><%=resultSet.getString("mobile") %></td>
<td><%=resultSet.getString("checkin") %></td>
<td><%=resultSet.getString("km") %></td>
<td><%=resultSet.getString("cost") %></td>
</tr>
<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
</div>
</body>

</html>