<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<%
	String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "weddinghalls";
String userid = "root";
String password = "";
String User = request.getParameter("User");
try {
	Class.forName(driver);
} catch (ClassNotFoundException e) {
	e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<body>

	<%@include file="header.jsp"%>
	<div class="container" style="margin-left: 20%; padding-top: 5%">
		<div class="card">
			<div class="card-body">
				<c:if test="${user != null}">
					<form action="update-tourpack" method="post">
				</c:if>
				<c:if test="${user == null}">
					<form action="insert-pack" method="post">
				</c:if>

				<caption>
					<h2>
						<c:if test="${user != null}">
            			Edit Package 
            		</c:if>
						<c:if test="${user == null}">
            			Add New Package
            		</c:if>
					</h2>
				</caption>

				<c:if test="${user != null}">
					<input type="hidden" name="id" value="<c:out value='${user.id}' />" />
				</c:if>

				<fieldset class="form-group">
					<label> Package Name</label> <input type="text"
						value="<c:out value='${user.name}' />" class="form-control"
						name="name" required="required">
				</fieldset>

				<fieldset class="form-group">
					<label> Details</label> <input type="text"
						value="<c:out value='${user.description}' />" class="form-control"
						name="description" required="required">
				</fieldset>


				<p>
					Select Name : <select>
						<option>select</option>
						<%
							try {
							connection = DriverManager.getConnection(connectionUrl + database, userid, password);
							statement = connection.createStatement();
							String sql = "select * from package";
							System.out.println(sql);
							resultSet = statement.executeQuery(sql);
							while (resultSet.next()) {
								{
						%>
						<option value="<%=resultSet.getString("name")%>"><%=resultSet.getString("name")%></option>
						<%
							}
						}
						%>


					</select>
				</p>
				<%
					connection.close();
				} catch (Exception e) {
				e.printStackTrace();
				}
				%>

				<fieldset class="form-group">
					<label> Destination Details</label> <input type="text"
						value="<c:out value='${user.destinations}' />"
						class="form-control" name="destination" required="required">
				</fieldset>


				<fieldset class="form-group">
					<label> Total Amount</label> <input type="text"
						value="<c:out value='${user.cost}' />" class="form-control"
						name="cost" required="required">
				</fieldset>
				<fieldset class="form-group">
					<label> Tour days</label> <input type="text"
						value="<c:out value='${user.days}' />" class="form-control"
						name="days" required="required">
				</fieldset>

				<button type="submit" class="btn btn-success">Save</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>