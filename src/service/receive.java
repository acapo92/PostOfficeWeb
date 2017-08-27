package service;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import factory.DbResult;
import factory.DbResult.Status;
import factory.PackageDAO;
import model.Package;

/**
 * Servlet implementation class receive
 */
@WebServlet("/receive")
public class receive extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public receive() {
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
		
		String i = request.getParameter("id");
		
		if(i !=null && i.length()>0){
			
			try {

				int id = Integer.parseInt(i);
				
				PackageDAO d = new PackageDAO();
				DbResult result = d.selectById(id);

				switch (result.getStatus()) {
				case OK:
					Package p = (Package) result.getData();

					
					if(p.getStatus() == Package.Status.NOT_DELIVERED){
						System.out.println();
						
						d.changeStatus(p.getId());
						request.setAttribute("msg", "Posiljka sa brojem "+p.getId()+" je uspesno preuzeta!");
						request.getRequestDispatcher("receive.jsp").forward(request, response);

					}else{
						request.setAttribute("msg", "Posiljka sa brojem: "+p.getId()+", je dostavljen "+p.getDateToDelivered()+".");
						request.getRequestDispatcher("receive.jsp").forward(request, response);
					}
					System.out.println(p.getSender());
					System.out.println(p.getStatus());
					break;
				case ERROR:
					System.err.println(result.getMessage());
					request.setAttribute("msg", result.getMessage());
					request.getRequestDispatcher("receive.jsp").forward(request, response);
					break;
				}
				
			} catch (Exception e) {
				System.err.println(e.getMessage());
				request.setAttribute("msg", "Broj pošiljke mora biti broj!");
				request.getRequestDispatcher("receive.jsp").forward(request, response);
			}
		}else{
			request.setAttribute("msg", "Unesite broj posiljke!");
			request.getRequestDispatcher("receive.jsp").forward(request, response);
		}
		

		doGet(request, response);
	}

}
