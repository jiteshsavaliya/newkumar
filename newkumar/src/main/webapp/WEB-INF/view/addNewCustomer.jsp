<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!--     <link href="css/bootstrap.min.css" rel="stylesheet">

    Custom CSS
    <link href="css/sb-admin.css" rel="stylesheet">

    Custom Fonts
    <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

 -->
<title>New Customer</title>
</head>
<body>
	<div id="wrapper">
		<div id="page-wrapper">

			<div class="container-fluid">

				<div class="row">
					<div class="col-lg-6">


						<c:url var="actionUrl" value="/saveCustomer" />
						<form:form id="alliedActivity" commandName="customer"
							method="post" action="${actionUrl }">
							<div class="form-group">
								<label>Customer Name</label>
								<form:input type="text" name="customerName" path="customerName"
									placeholder="Customer Name" />
								<form:input type="hidden" path="id" />

								<br>

							</div>

							<div class="form-group">
								<label>Address</label>
								<form:input type="textarea" name="customerAddress"
									path="customerAddress" placeholder="Customer Address" />
								<br>


							</div>

							<div class="form-group">
								<label>Contact-No</label>
								<form:input type="text" name="phoneNumber" path="phoneNumber"
									placeholder="Contact Number" />
								<br>


							</div>

							<form:button id="btnSave" type="submit" name="btnSave">Save</form:button>
						</form:form>
					</div>
				</div>


			</div>
		</div>
	</div>
</body>
</html>