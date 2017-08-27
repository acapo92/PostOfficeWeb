package service;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import factory.DbResult;
import factory.PackageDAO;
import model.Package;

/**
 * Servlet implementation class packageSent
 */
@WebServlet("/packageSent")
public class packageSent extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public packageSent() {
		super();
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

		try {

			String sender = request.getParameter("sender");
			String recipient = request.getParameter("recipient");
			double weight = Double.parseDouble(request.getParameter("weight"));
			int wayToSending = Integer.valueOf(request.getParameter("wayToSending"));

			if (sender.length() > 0 && sender != null && recipient.length() > 0 && recipient != null && weight > 0
					&& wayToSending > 0) {

				System.out.println("aca");

				Package packageForDelivery = new Package(0, sender, recipient, weight, Package.Status.NOT_DELIVERED,
						Package.WayOfSending.createFromInteger(wayToSending), new Date(), null);

				PackageDAO d = new PackageDAO();
				DbResult result = d.send(packageForDelivery);

				String message = "";

				switch (result.getStatus()) {
				case OK:
					Package insertedPackage = (Package) result.getData();
					message = "Paket je uspešno zaveden pod brojem " + insertedPackage.getId();
					break;
				case ERROR:
					message = "Neuspešan prijem paketa.Kontaktirajte administratora.";
					System.err.println(result.getMessage());
					break;
				}

				request.setAttribute("msg", message);
				request.getRequestDispatcher("send.jsp").forward(request, response);

			} else {
				request.setAttribute("msg", "Uneti sve podatke!");
				request.getRequestDispatcher("send.jsp").forward(request, response);

			}

		} catch (Exception e) {
			request.setAttribute("msg", e.getMessage());
			request.getRequestDispatcher("send.jsp").forward(request, response);
		}
		doGet(request, response);
	}

}
