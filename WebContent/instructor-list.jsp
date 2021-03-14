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
<html>
<head>
<meta charset="ISO-8859-1">
<title>Graduation List</title>
</head>
<body>
	<h1>Graduation List</h1>
	<h2>All Instructors:</h2>
	<form method="post" action="NavigationInstructorsServlet">
		<table>
			<tr>
				<th></th>
				<th>First Name:</th>
				<th>Last Name:</th>
			</tr>
			<c:forEach items="${requestScope.allItems}" var="currentitem">
				<tr>
					<td><input type="radio" name="id" value="${currentitem.id}"></td>
					<td>${currentitem.firstName}</td>
					<td> ${currentitem.lastName}</td>
					<td></td>
				</tr>
			</c:forEach>
		</table>
		<input type="submit" value="Add:" name="doThisToItem">
		<input type="submit" value="Back to homepage:" name="doThisToItem">
	</form>
</body>
</html>