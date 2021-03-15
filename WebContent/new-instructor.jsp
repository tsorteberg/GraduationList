<!--  
/**
 * @author Tom Sorteberg - tsorteberg
 * @author Levi Olson - lolson17
 * CIS175 - Spring 2021
 * Mar 9, 2021
 */
 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lan="en">
	<head>
		<meta charset="utf-8">
	    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
		<title>New Instructor:</title>
	</head>
	
	<body style="margin: 50px">
		<div class="jumbotron">
			<h1>Graduation List Application</h1>
		</div>
		<h1>New Instructor:</h1>
		<form action = "CreateNewInstructorServlet" method="post">
			
			<label>Instructor:</label>
			<div class="row col-sm-12">
				<div class="col-sm-5">
					<label for="firstName">First Name:</label>
					<input type="text" name="firstName" class="form-control">
				</div>
				<div class="col-sm-5">
					<label for="firstName">Last Name:</label>
					<input type="text" name="lastName" class="form-control">
				</div>
			</div>
			<br />
			<input type = "submit" value="Submit:" class="btn btn-primary">
		</form>
		<br />
		<button onclick="window.location.href='ViewAllInstructorsServlet';" class="btn btn-primary">Cancel:</button>
		
		<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
	</body>
</html>