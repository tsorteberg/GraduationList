package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Courses;
/**
 * @author Tom Sorteberg - tsorteberg
 * @autor Levi Olson - lolson17
 * CIS175 - Spring 2021
 * Mar 4, 2021
 */


/**
 * Servlet implementation class NavigationServlet
 */
//Mirror NavigationServlet.java from 'ShoppingList Online with JPA Servlets JSP 2020.pdf'
@WebServlet("/NavigationCoursesServlet")
public class NavigationCoursesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NavigationCoursesServlet() {
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
		
		// Local variable declaration an initialization.
		String act = request.getParameter("doThisToItem");
		String path = "/ViewAllCoursesServlet";
				
		// Local object declaration and instantiation.
		CoursesHelper dao = new CoursesHelper();
				
		// Selection logic to determine selected action with exception handling.
		// If delete action is selected, then call delete method from context object.
		if (act.equals("Delete:")) {
			try 
			{
					Integer tempId = Integer.parseInt(request.getParameter("id"));
					Courses itemToDelete = dao.searchForCourseById(tempId);
					dao.deleteItem(itemToDelete);
			}
			catch (NumberFormatException e) 
			{
				System.out.println("An item must be selected for deletion.");
			}
		}
		// If add action is selected, then redirect to index.html.
		else if (act.equals("Add:")) {
			path = "/AddCourseServlet";
		}
		// If edit action is selected, then call edit method from context object.
		else if (act.equals("Edit:")) {
			try 
			{
				Integer tempId = Integer.parseInt(request.getParameter("id"));
				Courses courseToEdit = dao.searchForCourseById(tempId);
				request.setAttribute("courseToEdit", courseToEdit);
				path = "/edit-course.jsp";
			}
			catch (NumberFormatException e) 
			{
				System.out.println("An item must be selected for editing.");
			}
		}
		else if (act.equals("Homepage:")) {
			path = "/index.html";
		}
				
		// Method call to redirect to index.html using request dispatcher.
		getServletContext().getRequestDispatcher(path).forward(request, response);
	}
}
