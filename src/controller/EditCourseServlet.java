package controller;

import java.io.IOException;
import java.time.LocalDate;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Courses;
/**
 * @author Tom Sorteberg - tsorteberg
 * @author Levi Olson - lolson17
 * CIS175 - Spring 2021
 * Mar 9, 2021
 */
import model.Instructors;

/**
 * Servlet implementation class EditCourseServlet
 */
@WebServlet("/EditCourseServlet")
public class EditCourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditCourseServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
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
		
		Integer tempId = Integer.parseInt(request.getParameter("id"));
		Integer tempinstructorId = Integer.parseInt(request.getParameter("instructorid"));
						
		// Try catch block for date format input validation.
		try 
		{
			// Attempt to parse to correct format.
			ld = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
		}
		catch(NumberFormatException ex) {
			// If parse fails, set to current date.
			ld = LocalDate.now();
		}
				
		// Local object declaration and instantiation.
		CoursesHelper dao = new CoursesHelper();
		InstructorsHelper ins = new InstructorsHelper();
		Courses courseToUpdate = dao.searchForCourseById(tempId);
		Instructors instructorToUpdate = ins.searchForInstructorById(tempinstructorId);
		//Instructors instructor = new Instructors(firstName, lastName);
				
		// Set Courses object parameters.
		courseToUpdate.setCourseName(courseName);
		courseToUpdate.setStartDate(ld);
		courseToUpdate.setCredits(credits);
		
		// Set Instructors object parameters.
		instructorToUpdate.setFirstName(firstName);
		instructorToUpdate.setLastName(lastName);
				
		// Method call to update ListItem object to database using ListItemHelper context object.
		dao.updateItem(courseToUpdate);
		ins.updateItem(instructorToUpdate);
				
		// Method call to redirect to viewAllItemsServlet using request dispatcher.
		getServletContext().getRequestDispatcher("/ViewAllCoursesServlet").forward(request, response);
	}

}
