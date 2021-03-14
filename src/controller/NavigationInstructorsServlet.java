package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Courses;
import model.Instructors;
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
@WebServlet("/NavigationInstructorsServlet")
public class NavigationInstructorsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NavigationInstructorsServlet() {
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
		String path;
				
		// Local object declaration and instantiation.
		InstructorsHelper dao = new InstructorsHelper();
				
		if (act.equals("Add:")) {
			path = "/AddInstructorServlet";
		}
		else {
			path = "/index.html";
		}
				
		// Method call to redirect to index.html using request dispatcher.
		getServletContext().getRequestDispatcher(path).forward(request, response);
	}
}
