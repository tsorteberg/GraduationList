package controller;

import java.io.IOException;
import java.time.LocalDate;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Courses;
import model.Instructors;
/**
 * @author Tom Sorteberg - tsorteberg
 * @author Levi Olson - lolson17
 * CIS175 - Spring 2021
 * Mar 9, 2021
 */

/**
 * Servlet implementation class CreateNewCourseServlet
 */
@WebServlet("/CreateNewInstructorServlet")
public class CreateNewInstructorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateNewInstructorServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		// Get parameters from jsp page.
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
				
		// Instantiate Courses object.
		Instructors instructor = new Instructors(firstName, lastName);
		InstructorsHelper ih = new InstructorsHelper();
		ih.insertInstructor(instructor);
				
		// Forward http request/response to jsp page.
		getServletContext().getRequestDispatcher("/ViewAllInstructorsServlet").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}