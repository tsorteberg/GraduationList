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
		<title>New Instructor:</title>
	</head>
	
	<body>
		<h1>New Course:</h1>
		<form action = "CreateNewInstructorServlet" method="post">
		
			<p>
				First Name:<br />
				<input type ="text" name = "firstName"><br />
			</p>
			
			<p>
				Last Name:<br />
				<input type ="text" name = "lastName"><br />
			</p>

			<input type = "submit" value="Submit:">
		</form>
		<br />
		<button onclick="window.location.href='ViewAllInstructorsServlet';">Cancel:</button><br /><br /><br />
	</body>
</html>