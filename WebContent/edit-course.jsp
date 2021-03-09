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
<html>
	<head>
		<meta charset="UTF-8">
		<title>Edit Course:</title>
	</head>
	
	<body>
		<h1>Edit Course:</h1>
		<form action = "EditCourseServlet" method="post">
		
			<input type ="hidden" name = "id" value="${courseToEdit.id}">
			<input type ="hidden" name = "instructorid" value="${courseToEdit.instructor.id}">
		
			<p>
				Course Name:<br />
				<input type ="text" name = "courseName" value="${courseToEdit.courseName}"><br />
			</p>
			
			<p>
				Start Date:<br />
				<input type="text" name="month" placeholder="mm" size="4" value="${courseToEdit.startDate.getMonthValue()}"> 
				<input type="text" name="day" placeholder="dd" size="4" value="${courseToEdit.startDate.getDayOfMonth()}">, 
				<input type="text" name="year" placeholder="yyyy" size="4" value="${courseToEdit.startDate.getYear()}">
			</p>
			
			<p>
				Credits:<br />
				<input type="text" name="credits" value="${courseToEdit.credits}"><br />
			</p>
			
			<p>
				Instructor:<br /><br />
				First Name:<input type="text" name="firstName" value="${courseToEdit.instructor.firstName}">
				Last Name:<input type="text" name="lastName" value="${courseToEdit.instructor.lastName}"><br />
			</p>
			<input type = "submit" value="Submit:">
		</form>
		<br />
		<button onclick="window.location.href='ViewAllCoursesServlet';">Cancel:</button><br /><br /><br />
	</body>
</html>