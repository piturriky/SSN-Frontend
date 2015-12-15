<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ssn.ws.Reservation"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Social Sport Network</title>
<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"
	integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS"
	crossorigin="anonymous"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap-datetimepicker.min.js"></script>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<link rel="stylesheet" 
	href="${pageContext.request.contextPath}/css/bootstrap-datetimepicker.min.css">
<script type="text/javascript">
	function deleteModal(id,sport){
		$("#selectedId").val(id);
		if(sport){
			$('#selectedId').attr('name', 'selectedSportId');
			$('#modalTitle').html('Delete Sport');
		}else{
			$('#selectedId').attr('name', 'selectedReservationId');
			$('#modalTitle').html('Delete Reservation');
		}
		$("#deleteModal").modal()
	}
</script>
<style type="text/css">
	.comfirmed {
	    background-color:#A2ECA2 !important;
	    color:black !important;
	} 
	.no-comfirmed {
	    background-color:orange !important;
	    color:black;
	} 
</style>
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
		<strong id="messageTitle"></strong> <label id="messageText"></label>
	</div>

	<div id="container" style="margin-left: 10px; margin-right: 10px;">

		<div class="row">
			<div class="col-md-6">
				<div style="text-align: left;">
					<h4 style="font-family: cursive; font-weight: bold;">Field</h4>
					</br>
				</div>
			</div>
		</div>

		<form method="post" id="mainForm">
			<div class="row">
				<div class="col-md-6">
					<input type="hidden" id="entityId" name="entityId"
						value="<c:out value="${entity.getIdField()}"/>">
					<div class="form-group">
						<label for="entityName">Name:</label> 
						<input type="text"
							class="form-control" id="entityName" name="entityName"
							placeholder="Name" value="<c:out value="${entity.getName()}"/>"
							required>
					</div>
				</div>
			</div>
		</form>
		<div class="row">
			<div class="col-md-12">
				<hr>
			</div>
		</div>
		<div class="row">
			<div class="col-md-6">
				<form method="post">
					<fieldset>
						<legend>Sports & price/hour: </legend>
						<div class="row">
							<div class="col-md-9">
								<select id="sportSelect" name="sportId" class="form-control addSport">
									<c:forEach var="sport" items="${sports}">
										<option value="${sport.getIdSport()}">${sport.getName()}</option>
									</c:forEach>
								</select>
							</div>
							<div class="col-md-2">
								<input type="text" class="form-control addSport" name="priceHour" id="sportPriceInput"
									placeholder="Price/h" onkeydown="validateCharacter(event)" required>
							</div>
							<div class="col-md-1">
								<button type="submit" class="btn btn-success addSport">
									<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
								</button>
							</div>
						</div>
					</fieldset>
				</form>
				<table id="fieldsTable" class="table table-striped">
					<thead>
						<tr>
							<th class="col-md-1">Sport</th>
							<th class="col-md-2">Price/hour</th>
							<th class="col-md-1" style="width:1%;"></th>
						</tr>
					</thead>
					<tbody>
						<c:choose>
							<c:when test="${not empty entity}">
								<c:forEach var="entity" items="${entity.getSports()}" varStatus="loop">
									<tr>
										<td>${entity.getSportName()}</td>
										<td>${entity.getHourPrice()}</td>
										<td>
											<button type="button" class="btn btn-danger btn-sm" onclick="deleteModal('${loop.index}',true)">
												<span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
											</button>
										</td>
									</tr>
								</c:forEach>
							</c:when>
						</c:choose>
					</tbody>
				</table>
			</div>
			<div class="col-md-6">
				<c:choose>
					<c:when test="${mode == 'edit'}">
						<form method="post">
							<fieldset>
								<legend>Reservations: </legend>					
								<div class="row">
									<div class="col-md-8">
										<input size="16" type="text" name="hourReservation" id="hourReservationInput" 
											value="2012-06-15 14:45" readonly class="form_datetime form-control">
									</div>
									<div class="col-md-3">
										<input type="number" class="form-control" name="minutes" id="minutesInput"
											placeholder="Minutes" onkeydown="validateCharacter(event)" required>
									</div>
									<div class="col-md-1">
										<button type="submit" class="btn btn-success">
											<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
										</button>
									</div>
								</div>
							</fieldset>
						</form>
						<table id="reservationsTable" class="table table-striped">
							<thead>
								<tr>
									<th class="col-md-3">Date</th>
									<th class="col-md-2">Duration</th>
									<th class="col-md-1" style="width:1%;"></th>
								</tr>
							</thead>
							<tbody>
								<c:choose>
									<c:when test="${not empty reservations}">
										<% ArrayList<Reservation> list =  (ArrayList<Reservation>)request.getAttribute("reservations");
										for(Reservation r : list){ %>
										<tr class="<%if(r.isConfirmed()){%>comfirmed<%}else{%>no-comfirmed<%}%>">
											<td><%=r.toStartDate()%></td>
											<td><%=r.getDurationMin()%></td>
											<td>
												<button type="button" class="btn btn-danger btn-sm" onclick="deleteModal('<%=list.indexOf(r)%>')">
													<span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
												</button>
											</td>
										</tr>
										<%} %>
										<!--<c:forEach var="entity" items="${reservations}" varStatus="loop">
											<tr>
												<td>${reservation.toStartDate()}</td>
												<td>${reservation.toEndDate()}</td>
												<td>
													<button type="button" class="btn btn-danger btn-sm" onclick="deleteModal('${loop.index}')">
														<span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
													</button>
												</td>
											</tr>
										</c:forEach>-->
									</c:when>
								</c:choose>
							</tbody>
						</table>
					</c:when>
				</c:choose>
			
				
			</div>
		</div>
	</div>
	<br>
	<div class="row">
		<div class="col-md-6">
			<input type="submit" class="btn btn-success"
				value="<c:out value="${submitButton}"/>" form="mainForm"> <a
				class="btn btn-primary"
				href="/SSN_Frontend/ManagerEntity?mode=edit&Id=${entity.getIdManagerEntity()}">Back</a>
		</div>
	</div>

	<!-- Modal -->
	<div id="deleteModal" class="modal fade" role="dialog">
		<div class="modal-dialog">

			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title" id="modalTitle"></h4>
				</div>
				<div class="modal-body">
					<p>Are you sure? To apply the changes, you must press the create or update button.</p>
				</div>
				<div class="modal-footer">
					<form method="post">
						<div class="row">
							<div class="col-md-12">
								<button type="button" class="btn btn-default"
									data-dismiss="modal">Cancel</button>
								<input type="hidden" id="selectedId">
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
			$("#alertMessage").fadeTo(2000, 500).slideUp(500,
					function() {
						$("#alertMessage").alert('close');
					});
		});
	</script>
</c:if>
<script type="text/javascript">
	function validateCharacter(event) {
		key = event.keyCode;
		if ((key >= 48 && key <= 57) || key == 46 || key == 127 || key == 8)
			return true;
		event.preventDefault();
		return false;
	}
	$(".form_datetime").datetimepicker({format: 'yyyy-mm-dd hh:ii'});
</script>

</html>