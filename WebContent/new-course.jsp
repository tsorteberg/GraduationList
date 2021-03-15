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
<html lang="en">
	<head>
		<meta charset="utf-8">
	    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
		<title>New Course:</title>
	</head>
	
	<body style="margin: 50px">
		<div class="jumbotron">
			<h1>Graduation List</h1>
		</div>
		<h1>New Course:</h1>
		<form action="CreateNewCourseServlet" method="post">
			
			<label for="courseName">Course Name:</label>
			<div class="form-group col-sm-12">
				<input type ="text" name = "courseName" class="form-control col-sm-11">
			</div>
			
			<label>Start Date:</label>
			<div class="row col-sm-8 col-md-7 col-lg-5">
				<div class="col-3">
					<input type="text" name="month" placeholder="mm" size="4" class="form-control"> 
				</div>
				<div class="col-3">
					<input type="text" name="day" placeholder="dd" size="4" class="form-control">
				</div>
				<div class="col-4">
					<input type="text" name="year" placeholder="yyyy" size="4" class="form-control">
				</div>
			</div>
			
			<label for="credits">Credits:</label>
			<div class="row col-sm-11 col-md-7 col-lg-5">
				<div class="col-3">
					<input type="text" name="credits" size="4" class="form-control">
				</div>
			</div>
			
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
		<button onclick="window.location.href='ViewAllCoursesServlet';" class="btn btn-primary">Cancel:</button>
		
		<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
	</body>
</html>