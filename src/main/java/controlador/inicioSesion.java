package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 * Servlet implementation class inicioSesion
 */
@WebServlet("/inicioSesion")
public class inicioSesion extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public inicioSesion() {
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
		
		
		String username,password ; 
		 username = request.getParameter("userId");
		 password = request.getParameter("contra");
		 
		 if(username.equals("admininicial")&& password.equals("123456")) {
			JOptionPane.showMessageDialog(null, "Correcto");
			response.sendRedirect("menuprincipla.jsp");
			
		}
		
		else {
			System.out.println ("datos enviados");
			response.sendRedirect("index.jsp");
		} 
		
	
	}

}
