<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>User Registration Form</title>
	<link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet"></link>
	<link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
</head>

<body>
 	<div class="generic-container">
		<%@include file="authheader.jsp" %>

		<div class="well lead">User Registration Form</div>
	 	<form:form method="POST" modelAttribute="userRegi" class="form-horizontal">
			<form:input type="hidden" path="id" id="id"/>
			
			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="emailId">Email Id</label>
					<div class="col-md-7">
					<c:choose>
					<c:when test="${edit}">
						<form:input type="text" path="emailId" id="emailId" class="form-control input-sm" disabled="true"/>
					</c:when>
					<c:otherwise>
						<form:input type="text" path="emailId" id="emailId" class="form-control input-sm"/>
						<div class="has-error">
							<form:errors path="emailId" class="help-inline"/>
						</div>
					</c:otherwise>
					</c:choose>
					</div>
				</div>
			</div>
	
			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="password">Password</label>
					<div class="col-md-7">
						<form:input type="password" path="password" id="password" class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="password" class="help-inline"/>
						</div>
					</div>
				</div>
			</div>

	
			<%-- <div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="createdDate">Created Date</label>
					<div class="col-md-7">
						<c:choose>
							<c:when test="${edit}">
								<form:input type="text" path="createdDate" id="createdDate" class="form-control input-sm" disabled="true"/>
							</c:when>
							<c:otherwise>
								<form:input type="text" path="createdDate" id="createdDate" class="form-control input-sm" />
								<div class="has-error">
									<form:errors path="createdDate" class="help-inline"/>
								</div>
							</c:otherwise>
						</c:choose>
					</div>
				</div>
			</div>
	
			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="lastUpdatedDate">Last Updated Date</label>
					<div class="col-md-7">
						<form:input type="text" path="lastUpdatedDate" id="lastUpdatedDate" class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="lastUpdatedDate" class="help-inline"/>
						</div>
					</div>
				</div>
			</div>
	
 	
			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="createdBy">Created By</label>
					<div class="col-md-7">
						<c:choose>
							<c:when test="${edit}">
								<form:input type="text" path="createdBy" id="createdBy" class="form-control input-sm" disabled="true"/>
							</c:when>
							<c:otherwise>
								<form:input type="text" path="createdBy" id="createdBy" class="form-control input-sm" />
								<div class="has-error">
									<form:errors path="createdBy" class="help-inline"/>
								</div>
							</c:otherwise>
						</c:choose>
					</div>
				</div>
			</div>
			
			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="updatedBy">Updated By</label>
					<div class="col-md-7">
						<form:input type="text" path="updatedBy" id="updatedBy" class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="updatedBy" class="help-inline"/>
						</div>
					</div>
				</div>
			</div>
			
	 --%>
			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="userRoles">Roles</label>
					<div class="col-md-7">
						<form:select path="userRoles" items="${roles}" multiple="true" itemValue="id" itemLabel="type" class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="userRoles" class="help-inline"/>
						</div>
					</div>
				</div>
			</div>
	
			<div class="row">
				<div class="form-actions floatRight">
					<c:choose>
						<c:when test="${edit}">
							<input type="submit" value="Update" class="btn btn-primary btn-sm"/> or <a href="<c:url value='/list' />">Cancel</a>
						</c:when>
						<c:otherwise>
							<input type="submit" value="Register" class="btn btn-primary btn-sm"/> or <a href="<c:url value='/list' />">Cancel</a>
						</c:otherwise>
					</c:choose>
				</div>
			</div>
		</form:form>
	</div>
</body>
</html>