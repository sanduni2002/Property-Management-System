
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Property Management Form</title>


	
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
	
	
	
	
</head>
<body  >

	<header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: black">
			<div>
				
			</div>

			<ul class="navbar-nav">
				<li><a href="<%=request.getContextPath()%>/list"
					class="nav-link" style="font-size: 24px;color: white">Properties</a></li>
			     <li><a  href= "propertyOwner.jsp" style="font-size: 24px;color: white" class="nav-link" >Home</a></li>
			
			</ul>
		</nav>
	</header>
	<br>
	<div class="container col-md-5">
		<div class="card">
			<div class="card-body">
			<c:if test="${property != null}">
			
				<form action="update" method="post">
			</c:if>
			
				<c:if test="${property == null}">
					<form action="insert" method="post">
				</c:if>

				<caption>
					<h2>
						<c:if test="${property != null}">
            		Edit Property
            		</c:if>
						<c:if test="${property == null}">
            			Add New Property
            		</c:if>
					</h2>
				</caption>

				<c:if test="${property != null}">
					<input type="hidden" name="id" value="<c:out value='${property.id}' />" />
				</c:if>
				
				<fieldset class="form-group" >
					<label>Property Category</label> <input type="text"
						value="<c:out value='${property.category}' />" class="form-control"
						name="category" required="required">
				</fieldset>

				
				<fieldset class="form-group">
    				<label>Type</label>
    				<input type="text" value="<c:out value='${property.type}' />" class="form-control" name="type" required="required">
				</fieldset>
				
				<fieldset class="form-group">
				    <label>Province</label>
				    <input type="text" value="<c:out value='${property.province}' />" class="form-control" name="province" required="required">
				</fieldset>
				
			<fieldset class="form-group">
				    <label>Address</label>
				    <input type="text" value="<c:out value='${property.address}' />" class="form-control" name="address" required="required">
			</fieldset>
			
			<fieldset class="form-group">
    			<label>NoofBedrooms</label>
    		<input type="text" value="<c:out value='${property.noofBedrooms}' />" class="form-control" name="noofBedrooms" required="required">
			</fieldset>
			
			<fieldset class="form-group">
			    <label>NoofBathrooms</label>
			    <input type="text" value="<c:out value='${property.noofBathrooms}' />" class="form-control" name="noofBathrooms" required="required">
			</fieldset>
			
			<fieldset class="form-group">
			    <label>FloorArea</label>
			    <input type="text" value="<c:out value='${property.floorArea}' />" class="form-control" name="floorArea" required="required">
			</fieldset>
			
			<fieldset class="form-group">
			    <label>SizeofLand</label>
			    <input type="text" value="<c:out value='${property.sizeofLand}' />" class="form-control" name="sizeofLand" required="required">
			</fieldset>
			<fieldset class="form-group">
			    <label>Price</label>
			    <input type="text" value="<c:out value='${property.price}' />" class="form-control" name="price" required="required">
			</fieldset>
			<fieldset class="form-group">
			    <label>Features</label>
			    <input type="text" value="<c:out value='${property.features}' />" class="form-control" name="features" required="required">
			</fieldset>
			<fieldset class="form-group">
			    <label>Details</label>
			    <input type="text" value="<c:out value='${property.details}' />" class="form-control" name="details" required="required">
			</fieldset>
			<fieldset class="form-group">
			    <label>Name</label>
			    <input type="text" value="<c:out value='${property.name}' />" class="form-control" name="name" required="required">
			</fieldset>
			<fieldset class="form-group">
			    <label>Email</label>
			    <input type="text" value="<c:out value='${property.email}' />" class="form-control" name="email" required="required">
			</fieldset>
			<fieldset class="form-group">
			    <label>ContactNo</label>
			    <input type="text" value="<c:out value='${property.contactNo}' />" class="form-control" name="contactNo" required="required">
			</fieldset>
							


				<button type="submit" class="btn btn-success" style = "background-color:black;font-size: 16px;border-radius: 5px;padding: 10px 24px">Save</button>
		</form>
			</div>
		</div>
	</div>
</body>
</html>