package service;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import factory.ClientDAO;
import model.Client;

/**
 * Servlet implementation class Clinet_Log_in
 */
@WebServlet("/Clinet_Log_in")
public class Client_Log_in extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Client_Log_in() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession sesija = request.getSession();
		
		sesija.invalidate();
		
		request.getRequestDispatcher("ClientLogIn.jsp").forward(request, response);
	}
		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String pass = request.getParameter("pass");

		if (username != null && username.length() > 0 && pass != null && pass.length() > 0) {

			ClientDAO DAO = new ClientDAO();
			Client c = new Client();

			c = DAO.validateLogin(username, pass);
			
			if (c != null) {

				HttpSession sesija = request.getSession();
				sesija.setAttribute("Client", c);

				request.getRequestDispatcher("account.jsp").forward(request, response);
			} else {

				request.setAttribute("msg", "Neispavni podaci!");
				request.getRequestDispatcher("ClientLogIn.jsp").forward(request, response);
			}
		} else {
			request.setAttribute("msg", "Uneti sve podatke!");
			request.getRequestDispatcher("ClientLogIn.jsp").forward(request, response);
		}

		doGet(request, response);
	}

}
