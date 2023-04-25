package main.java.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import main.java.dao.UserDAO;


/**
 * Servlet implementation class SignupServlet
 */
@WebServlet("/signup")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignupServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = request.getRequestDispatcher("/signup.jsp");
		dispatcher.forward(request,  response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String phoneNumber = request.getParameter("phoneNumber");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(phoneNumber);
		System.out.println(email);
		System.out.println(password);
		

		UserDAO userDAO = new UserDAO();
		
		boolean checkUserExisted = userDAO.checkUserExisted(email);
		
		if (!checkUserExisted) {
			boolean createNewUserSuccessful = userDAO.createNewUser(firstname, lastname,phoneNumber, email, password );
			
			if (createNewUserSuccessful) {
				response.sendRedirect("login");
			} else {
				String error = "There was a problem creating new user, please try again.";
				request.setAttribute("error", error);
				RequestDispatcher dispatcher = request.getRequestDispatcher("signup.jsp");
				dispatcher.forward(request,  response);		
			}
		} else {
			String error = "This email has been used before.";
			request.setAttribute("error", error);
			RequestDispatcher dispatcher = request.getRequestDispatcher("signup.jsp");
			dispatcher.forward(request,  response);	
		}
		
		
	}

}
