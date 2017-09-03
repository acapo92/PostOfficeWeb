package service;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import factory.DbResult;
import factory.PackageDAO;
import model.Package;

/**
 * Servlet implementation class check
 */
@WebServlet("/check")
public class check extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public check() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String i = request.getParameter("id");
		
		if(i !=null && i.length()>0){
			
			try {

				int id = Integer.parseInt(i);
			
				try{
					PackageDAO d = new PackageDAO();
					DbResult result = d.selectById(id);
					Package p = (Package) result.getData();
					
					if(p.getDateToDelivered() == null){
						request.setAttribute("msg"," Paket salje:  " +p.getSender()+ " , prima:  "  + p.getRecipient()+", tezina:  "+p.getWeight()+", status: nije dostavljen, poslat: "+p.getDateToSent());
						request.getRequestDispatcher("info.jsp").forward(request, response);
						
					}else{
						request.setAttribute("msg"," Paket salje: " +p.getSender()+" , prima: " + p.getRecipient()+", tezina:  "+p.getWeight()+", status: dostavljen, poslat: "+p.getDateToSent()+", dostavljen: "+p.getDateToDelivered());
						request.getRequestDispatcher("info.jsp").forward(request, response);	
					}
					
					
				}catch(Exception e){
					System.err.println(e.getMessage());
					request.setAttribute("msg", "Pošiljka pod tim brojem ne postoji u sistemu!");
					request.getRequestDispatcher("info.jsp").forward(request, response);
				}
				
				
					
				
				
				
			
			} catch (Exception e) {
				System.err.println(e.getMessage());
				request.setAttribute("msg", "Broj pošiljke mora biti broj!");
				request.getRequestDispatcher("info.jsp").forward(request, response);
			}
	
		}else{
			request.setAttribute("msg", "Unesite broj posiljke!");
			request.getRequestDispatcher("info.jsp").forward(request, response);
		}
		
		doGet(request, response);
	}

}
