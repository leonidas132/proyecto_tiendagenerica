package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import modelo.ClientesDAO;
import modelo.ClientesDTO;

/**
 * Servlet implementation class Servletcliente
 */
@WebServlet("/Servletcliente")
public class Servletcliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servletcliente() {
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
		boolean X;
		String Cedula = null;
		String Nombre = null;
		String Direccion = null;
		String Telefono = null;
		String Email = null;
		
		ClientesDTO DTO;
		ClientesDAO DAO;
		ClientesDTO clientedto;
		
		//Ingresar clientes//
		if(request.getParameter("crear")!=null) {
			
		    Cedula=request.getParameter(Cedula);
			
			Nombre=request.getParameter(Nombre);
			Direccion=request.getParameter(Direccion);
			Telefono=request.getParameter(Telefono);
			Email=request.getParameter(Email);
			
			DTO=new ClientesDTO(Cedula, Nombre, Direccion, Telefono, Email);
			DAO=new ClientesDAO();
			X=DAO.insertarClientes(DTO);
			if(X==true) {
				JOptionPane.showMessageDialog(null, "agregado con exito");
			}
			else {
				System.out.println("error en el ingreso");
			}
			response.sendRedirect("interface_cliente.jsp");
		}
		//consultar cliente//
		if (request.getParameter("consultar")!=null) {
			Cedula=request.getParameter(Cedula);
			DTO=new ClientesDTO(Cedula);
			DAO=new ClientesDAO();
			clientedto=DAO.Consultar(DTO);
			if(clientedto!=null) {
				Cedula=clientedto.getCedula_Cliente();
				Nombre=clientedto.getNombre_Cliente();
				Direccion=clientedto.getDireccion_Cliente();
				Telefono=clientedto.getTelefono_Cliente();
				Email=clientedto.getEmail_Cliente();
				System.out.println(Telefono);
				response.sendRedirect("interface_cliente.jsp?Cedula="+Cedula+"&&Nombre="+Nombre+"&&Direccion="+Direccion+"&&Telefono="+Telefono+"&&Email="+Email);
			}
			else {
				System.out.println("error en la consulta");
			}
		}
		
	  //grupo actualizar//
	
	    if (request.getParameter("actualizar")!=null) {
			int dat;
			Cedula=request.getParameter("Cedula");
			Nombre=request.getParameter("nombre");
			Direccion=request.getParameter("direccion");
			Email=request.getParameter("Email");
		    Telefono=request.getParameter("telefono");
			
			
			DTO=new ClientesDTO(Cedula,Nombre,Direccion,Telefono,Email);
			DAO=new ClientesDAO();
			dat=DAO.Actualizar(DTO);
			System.out.println(dat);
			
			if(dat>0) {
				System.out.println("datos Actualizados");
			}
			else {
				System.out.println("Error en la actualizacion");
			}
			response.sendRedirect("interface_cliente.jsp");
			}
		
		//ELIMINAR//
		if(request.getParameter("eliminar")!=null) {
			int x=0;
			Cedula=request.getParameter("Cedula");
			DTO=new ClientesDTO(Cedula);
			DAO=new ClientesDAO();
			x=DAO.Eliminar(DTO);
			if(x>0) {
				System.out.println("Exito al eliminar");
			}
			else {
				System.out.println("Error al eliminar");
			}
			response.sendRedirect("interface_cliente.jsp");
	}
		
		
		
 }
}
