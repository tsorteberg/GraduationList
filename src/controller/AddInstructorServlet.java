package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * @author Tom Sorteberg - tsorteberg
 * @autor Levi Olson - lolson17
 * CIS175 - Spring 2021
 * Mar 4, 2021
 */

/**
 * Servlet implementation class AddCourseServlet
 */
// Mirror AddItemsForListServlet.java from 'JPA Joins and Attribute Converters.pdf'.
// Uses new-course.jsp.
@WebServlet("/AddInstructorServlet")
public class AddInstructorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddInstructorServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Local variable declaration and initialization.
		InstructorsHelper dao = new InstructorsHelper();
		request.setAttribute("allItems", dao.showAllItems());
				
		// Selection logic to determine if List<ListDetails> object is empty.
		if(dao.showAllItems().isEmpty())
		{
			request.setAttribute("allItems", " ");
		}
				
		// Forward http request/response to jsp page.
		getServletContext().getRequestDispatcher("/new-instructor.jsp").forward(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
