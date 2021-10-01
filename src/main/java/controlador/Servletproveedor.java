package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import modelo.ProveedorDAO;
import modelo.ProveedorDTO;

/**
 * Servlet implementation class Servletproveedor
 */
@WebServlet("/Servletproveedor")
public class Servletproveedor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servletproveedor() {
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
		long Nit;
		String Nombre;
		String Direccion;
		String Telefono;
		String Ciudad;
		
		ProveedorDTO DTO;
		ProveedorDAO DAO;
		 ProveedorDTO proveedordto;
		
		//Ingresar proveedores//
		if(request.getParameter("crear")!=null) {
			Nit=Long.parseLong(request.getParameter("Nit"));
			Nombre=request.getParameter("nombre");
			Direccion=request.getParameter("direccion");
			Telefono=request.getParameter("telefono");
			Ciudad=request.getParameter("ciudad");
			
			DTO=new ProveedorDTO(Nit, Nombre, Direccion, Telefono, Ciudad);
			DAO=new ProveedorDAO();
			X=DAO.insertarProveedor(DTO);
			if(X==true) {
				JOptionPane.showMessageDialog(null, "agregado con exito");
			}
			else {
				System.out.println("error en el ingreso");
			}
			response.sendRedirect("interfaceproveedor.jsp");
		}
		//consultar pproveedor//
		if (request.getParameter("consultar")!=null) {
			Nit=Long.parseLong(request.getParameter("Nit"));
			DTO=new ProveedorDTO(Nit);
			DAO=new ProveedorDAO();
			proveedordto=DAO.consultar(DTO);
			if(proveedordto!=null) {
				Nit=proveedordto.getNit();
				Nombre=proveedordto.getNombre_proveedor();
				Direccion=proveedordto.getDireccion();
				Telefono=proveedordto.getTelefono();
				Ciudad=proveedordto.getCiudad();
				System.out.println(Telefono);
				response.sendRedirect("interfaceproveedor.jsp?Nit="+Nit+"&&Nombre="+Nombre+"&&Direccion="+Direccion+"&&Telefono="+Telefono+"&&Ciudad="+Ciudad);
			}
			else {
				System.out.println("error en la consulta");
			}
		}
		
	  //grupo actualizar//
	
	    if (request.getParameter("actualizar")!=null) {
			int dat;
			Nit=Long.parseLong(request.getParameter("Nit"));
			Nombre=request.getParameter("nombre");
			Direccion=request.getParameter("direccion");
			Ciudad=request.getParameter("ciudad");
		    Telefono=request.getParameter("telefono");
			
			
			DTO=new ProveedorDTO(Nit,Nombre,Direccion,Telefono,Ciudad);
			DAO=new ProveedorDAO();
			dat=DAO.Actualizar(DTO);
			System.out.println(dat);
			
			if(dat>0) {
				System.out.println("datos Actualizados");
			}
			else {
				System.out.println("Error en la actualizacion");
			}
			response.sendRedirect("interfaceproveedor.jsp");
			}
		
		//ELIMINAR//
		if(request.getParameter("eliminar")!=null) {
			int x=0;
			Nit=Long.parseLong(request.getParameter("Nit"));
			DTO=new ProveedorDTO(Nit);
			DAO=new ProveedorDAO();
			x=DAO.eliminar(DTO);
			if(x>0) {
				System.out.println("Exito al eliminar");
			}
			else {
				System.out.println("Error al eliminar");
			}
			response.sendRedirect("interfaceproveedor.jsp");
	}
		
		
		
 }
}
