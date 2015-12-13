<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Social Sport Network</title>
<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<script type="text/javascript">
	function deleteModal(id){
		$("#selectedId").val(id);
		$("#deleteModal").modal()
	}
</script>
</head>
<body style="padding-top: 70px;">
	<nav class="navbar navbar-default navbar-fixed-top">
	<div class="container-fluid">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="/SSN_Frontend/">Social Sport
				Network</a>
		</div>
		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
			</ul>
			<form class="navbar-form navbar-left" onsubmit="return false;">
			</form>
			<form class="navbar-form navbar-right" role="search"
				onsubmit="return false;">
				<c:if test="${mode == 'edit'}">
					<div class="input-group" style="margin-right: 10px;">
						<a id="newFieldButton" class="btn btn-success"
							href="${hrefAddField}">Add Field</a>
					</div>
				</c:if>
			</form>
		</div>
	</div>
	</nav>


	<!--<c:if test="${mode == 'edit'}">
		<c:set var="submitButton" value="Update"/>
	</c:if>-->

	<c:choose>
		<c:when test="${mode == 'edit'}">
			<c:set var="submitButton" value="Update" />
		</c:when>
		<c:otherwise>
			<c:set var="submitButton" value="Create" />
		</c:otherwise>
	</c:choose>
	
	<div class="alert" id="alertMessage">
	    <button type="button" class="close" data-dismiss="alert">x</button>
	    <strong id="messageTitle"></strong>
	    <label id="messageText"></label>
	</div>

	<div id="container" style="margin-left: 10px; margin-right: 10px;">
		<div class="row">
			<div class="col-md-6">
				<div style="text-align: left;">
					<h4 style="font-family: cursive; font-weight: bold;">Manager
						Entity</h4>
					</br>
				</div>
			</div>
		</div>
		<form method="post">
			<div class="row">
				<div class="col-md-6">
					<input type="hidden" id="entityId" name="entityId"
						value="<c:out value="${entity.getIdManagerEntity()}"/>">
					<div class="form-group">
						<label for="entityName">Name:</label> <input type="text"
							class="form-control" id="entityName" name="entityName"
							placeholder="Name" value="<c:out value="${entity.getName()}"/>" required>
					</div>
					<div class="form-group">
						<label for="entityCity">City:</label> <input type="text"
							class="form-control" id="entityCity" name="entityCity"
							placeholder="City" value="<c:out value="${entity.getCity()}"/>">
					</div>
					<div class="form-group">
						<label for="entityAddress">Address:</label> <input type="text"
							class="form-control" id="entityAddress" name="entityAddress"
							placeholder="Address"
							value="<c:out value="${entity.getAddress()}"/>">
					</div>
				</div>
				<div class="col-md-6">
					<c:if test="${mode == 'edit'}">
						<label for="entityCity">Fields:</label>
						<table id="fieldsTable" class="table table-striped">
							<thead>
								<tr>
									<th class="col-md-1">ID</th>
									<th class="col-md-2">Name</th>
									<th class="col-md-1" style="width:1%;"></th>
									<th class="col-md-1" style="width:1%;"></th>
								</tr>
							</thead>
							<tbody>
								<c:choose>
									<c:when test="${not empty fields}">
										<c:forEach var="entity" items="${fields}">
											<tr>
												<td>${entity.getIdField()}</td>
												<td>${entity.getName()}</td>
												<td><a class="btn btn-warning btn-sm"
													href="/SSN_Frontend/ManagerEntity/Field?mode=edit&IdManagerEntity=${entity.getIdManagerEntity()}&Id=${entity.getIdField()}">
														<span class="glyphicon glyphicon-pencil"
														aria-hidden="true"></span>
												</a></td>
												<td>
													<button type="button" class="btn btn-danger btn-sm" onclick="deleteModal('${entity.getIdField()}')">
														<span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
													</button>
												</td>
											</tr>
										</c:forEach>
									</c:when>
								</c:choose>
							</tbody>
						</table>
					</c:if>
				</div>
			</div>
			<div class="row">
				<div class="col-md-6">
					<input type="submit" class="btn btn-success"
						value="<c:out value="${submitButton}"/>"> 
					<a class="btn btn-primary" href="/SSN_Frontend/">Back</a>
				</div>
			</div>
		</form>
	</div>
	
	<!-- Modal -->
	<div id="deleteModal" class="modal fade" role="dialog">
		<div class="modal-dialog">

			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">Delete Manager Entity</h4>
				</div>
				<div class="modal-body">
					<p>Are you sure?</p>
				</div>
				<div class="modal-footer">
					<form method="post">
						<div class="row">
							<div class="col-md-12">
								<button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
								<input type="hidden" id="selectedId" name="selectedId">
								<button type="submit" class="btn btn-danger">Delete</button>
							</div>
						</div>
					</form>
				</div>
			</div>

		</div>
	</div>
	
</body>
<script type="text/javascript">
	$("#alertMessage").hide();
</script>

<c:if test="${messageType != null}">
	<script type="text/javascript">
		$(document).ready (function(){
			var title = '<%=request.getAttribute("messageTitle")%>';
			var message = '<%=request.getAttribute("messageText")%>';
			$("#messageTitle").html(title);
			$("#messageText").html(message);
			$("#alertMessage").addClass('<%=request.getAttribute("messageType")%>');
			$("#alertMessage").alert();
			$("#alertMessage").fadeTo(2000, 500).slideUp(500, function(){
				$("#alertMessage").alert('close');
			});   
		});
	</script>
</c:if>
</html>