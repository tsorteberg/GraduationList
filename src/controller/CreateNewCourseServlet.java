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
@WebServlet("/CreateNewCourseServlet")
public class CreateNewCourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateNewCourseServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Local variable declaration and initialization.
				
				LocalDate ld;
				
				// Get parameters from jsp page.
				String courseName = request.getParameter("courseName");
				String month = request.getParameter("month");
				String day = request.getParameter("day");
				String year = request.getParameter("year");
				String credits = request.getParameter("credits");
				String firstName = request.getParameter("firstName");
				String lastName = request.getParameter("lastName");
				
				// Try catch block for date format input validation.
				try {
					// Attempt to parse to correct format.
					ld = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
				}
				catch(NumberFormatException ex) {
					// If parse fails, set to current date.
					ld = LocalDate.now();
				}
				
				// Instantiate Courses object.
				Instructors instructor = new Instructors(firstName, lastName);
				Courses course = new Courses(courseName, ld, credits, instructor );
				CoursesHelper ch = new CoursesHelper();
				ch.insertCourse(course);
				
				// Forward http request/response to jsp page.
				getServletContext().getRequestDispatcher("/ViewAllCoursesServlet").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}