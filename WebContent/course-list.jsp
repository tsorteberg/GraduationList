<!--  
/**
 * @author Tom Sorteberg - tsorteberg
 * @author Levi Olson - lolson17
 * CIS175 - Spring 2021
 * Mar 9, 2021
 */
 -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8">
	    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
		<title>Instructor List</title>
		<title>Graduation List</title>
	</head>
	<body style="margin: 50px">
		<div class="jumbotron">
			<h1>Graduation List</h1>
		</div>
		<h2>All Courses:</h2>
		<form method="post" action="NavigationCoursesServlet">
			<table class="table table-bordered">
			<thead>
				<tr>
					<th></th>
					<th scope="col">Course Name:</th>
					<th scope="col">Start Date:</th>
					<th scope="col">Credits:</th>
					<th scope="col">Instructor:</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${requestScope.allItems}" var="currentitem">
					<tr>
						<td><input type="radio" name="id" value="${currentitem.id}"></td>
						<td>${currentitem.courseName}</td>
						<td>${currentitem.startDate}</td>
						<td>${currentitem.credits}</td>
						<td>${currentitem.instructor.firstName} ${currentitem.instructor.lastName}</td>
					</tr>
				</c:forEach>
			</tbody>
			</table>
			<input type="submit" value="Delete:" name="doThisToItem" class="btn btn primary">
			<input type="submit" value="Add:" name="doThisToItem" class="btn btn primary">
			<input type="submit" value="Edit:" name="doThisToItem" class="btn btn primary">
			<input type="submit" value="Back to homepage:" name="doThisToItem" class="btn btn primary">
		</form>
		<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
		</body>
</html>