package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class BookingDetailServlet
 */
@WebServlet("/BookingDetailServlet")
public class BookingDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookingDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		session.setAttribute("firstName", (String)request.getParameter("firstName"));
		session.setAttribute("lastName", (String)request.getParameter("lastName"));
		session.setAttribute("email", (String)request.getParameter("email"));
		session.setAttribute("phoneNumber", (String)request.getParameter("phoneNumber"));
		session.setAttribute("petType", (String)request.getParameter("petType"));
		session.setAttribute("appointmentType", (String)request.getParameter("appointmentType"));
		
		System.out.println("==== DEBUG ====");
		System.out.println(session.getAttribute("firstName"));
		System.out.println(session.getAttribute("lastName"));
		System.out.println(session.getAttribute("email"));
		System.out.println(session.getAttribute("phoneNumber"));
		System.out.println(session.getAttribute("petType"));
		System.out.println(session.getAttribute("appointmentType"));
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/bookingDetail.jsp");
		dispatcher.forward(request,  response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
