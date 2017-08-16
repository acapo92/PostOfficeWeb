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
import sun.misc.Cleaner;

/**
 * Servlet implementation class changeBalance
 */
@WebServlet("/changeBalance")
public class changeBalance extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private TransactionService transactionService = null;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public changeBalance() {
		super();
		this.transactionService = new TransactionService();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String account = request.getParameter("account");
		String sum = request.getParameter("sum");
		String button = request.getParameter("send");

		if (sum != null && sum.length() > 0) {

			if (button.equals("Isplati")) {

				try {
					double value = Double.parseDouble(sum);

					int accountNo = Integer.parseInt(account);

					Client client = this.transactionService.withdrawValue(accountNo, value);
					
					HttpSession sesija = request.getSession();
					sesija.setAttribute("Client", client);

					request.setAttribute("msg", "Uspesna isplata!");
					request.getRequestDispatcher("account.jsp").forward(request, response);
					
				} catch (Exception e) {
					request.setAttribute("msg", e.getMessage());
					request.getRequestDispatcher("account.jsp").forward(request, response);
				}

			} else {
				double valueToAdd = Double.parseDouble(sum);
				int accountNo = Integer.parseInt(account);
				
				Client client = this.transactionService.payment(accountNo, valueToAdd);
				
				HttpSession sesija = request.getSession();
				sesija.setAttribute("Client", client);

				request.setAttribute("msg", "Uspesna uplata!");
				request.getRequestDispatcher("Payment.jsp").forward(request, response);

			}
		} else {
			request.setAttribute("msg", "Uneti sve podatke!");
			request.getRequestDispatcher("account.jsp").forward(request, response);
		}

		doGet(request, response);
	}

}