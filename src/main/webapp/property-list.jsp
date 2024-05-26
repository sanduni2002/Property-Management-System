<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Property Management Application</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
	

</head>
<body>

	<header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: black;width:175%">
			<div>
				
			</div>

			<ul class="navbar-nav">
				<li><a href="<%=request.getContextPath()%>/list"
					class="nav-link" style="font-size: 24px;color: white" >Properties</a></li>
					
					 <li><a  href= "propertyOwner.jsp" style="font-size: 24px;color: white" class="nav-link" >Home</a></li>
			</ul>
		</nav>
	</header>
	<br>

	<div class="row">
		<!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

		<div class="container">
			<h3 class="text-center">List of Properties</h3>
			<hr>
			<div class="container text-left">

				<a href="<%=request.getContextPath()%>/new" class="btn btn-success" style = "background-color:black">Add
					New Property</a>
			</div>
			<br>
			<table class="table table-bordered" style = "width :200%">
				<thead>
					<tr style = "background-color: coral ;color:black " >
						<th >ID</th>
						
				        <th>Category</th>
				        <th>Type</th>
				        <th>Province</th>
				        <th>Address</th>
				        <th>NoofBedrooms</th>
				        <th>NoofBathrooms</th>
				        <th>FloorArea</th>
				        <th>SizeofLand</th>
				        <th>Price</th>
				        <th>Features</th>
				        <th>Details</th>
				        <th>Name</th>
				        <th>Email</th>
				        <th>Contact No</th>
				        <th>Actions</th>
		          </tr>
				</thead>
				<tbody>
				
					<c:forEach var="property" items="${listproperty}">

						<tr  style = "background-color:#F0F0F0;font-size:18px">
							<td><c:out value="${property.id}" /></td>
							<td><c:out value="${property.category}" /></td>
							<td><c:out value="${property.type}" /></td>
							<td><c:out value="${property.province}" /></td>
							<td><c:out value="${property.address}" /></td>
							<td><c:out value="${property.noofBedrooms}" /></td>
							<td><c:out value="${property.noofBathrooms}" /></td>
							<td><c:out value="${property.floorArea}" /></td>
							<td><c:out value="${property.sizeofLand}" /></td>
							<td><c:out value="${property.price}" /></td>
							<td><c:out value="${property.features}" /></td>
							<td><c:out value="${property.details}" /></td>
							<td><c:out value="${property.name}" /></td>
							<td><c:out value="${property.email}" /></td>
							<td><c:out value="${property.contactNo}" /></td>
							<td><a href="edit?id=<c:out value='${property.id}' />" style = "background-color:blue;color:white;font-size: 16px;border-radius: 5px;padding: 10px 24px">Edit</a>
								&nbsp;&nbsp;&nbsp;&nbsp; <a
								href="delete?id=<c:out value='${property.id}' />" style = "background-color:red;color:white;font-size: 16px;border-radius: 5px;padding: 10px 15px">Delete</a></td>
						</tr>
					</c:forEach>
		
				</tbody>

			</table>
		</div>
	</div>
</body>
</html>
