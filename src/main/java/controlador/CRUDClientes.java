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
 * Servlet implementation class CRUDClientes
 */
@WebServlet("/CRUDClientes")
public class CRUDClientes extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public CRUDClientes() {
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
		long Cedula_Cliente;
		String Direccion_Cliente;
		String Email_Cliente;
		String Nombre_Cliente;
		String Telefono_Cliente;
		
		ClientesDTO clidto;
		ClientesDAO clidao;
		ClientesDTO registro;
		
		
		
		//Ingresar Clientes
		if(request.getParameter("Crear")!=null) {
			Cedula_Cliente=Long.parseLong(request.getParameter("Cedula"));
			Direccion_Cliente=request.getParameter("Direccion");
			Email_Cliente=request.getParameter("Correo");
			Nombre_Cliente=request.getParameter("Nombre");
			Telefono_Cliente=request.getParameter("Telefono");
			
			clidto=new ClientesDTO(Cedula_Cliente, Direccion_Cliente, Email_Cliente, Nombre_Cliente, Telefono_Cliente);
			clidao=new ClientesDAO();
			X=clidao.insertarClientes(clidto);
			if(X){
				JOptionPane.showMessageDialog(null, "Se Agrego sin problemas");
			}
			else {
				JOptionPane.showMessageDialog(null, "Error, Cliente no ingresado");
			}
			
		}
		
		//Buscar Usuarios
		if(request.getParameter("Buscar")!=null) {
			long Cedula;
			String Direccion;
			String Email;
			String Nombre;
			String Telefono;
			
			Cedula_Cliente=Long.parseLong(request.getParameter("Cedula"));
			clidto=new ClientesDTO(Cedula_Cliente);
			clidao= new ClientesDAO();
			
			registro=clidao.Consultar(clidto);
			
			if(registro!=null) {
				
				
				Cedula=registro.getCedula_Cliente();
				Direccion=registro.getDireccion_Cliente();
				Email=registro.getEmail_Cliente();
				Nombre=registro.getNombre_Cliente();
				Telefono=registro.getTelefono_Cliente();
				response.sendRedirect("index.jsp?Cedula="+Cedula+"&&Direccion="+Direccion+"&&Email="+Email+"&&Nombre"
				+Nombre+"&&Telefono"+Telefono);
			}
			else {
				JOptionPane.showMessageDialog(null, "No hay Registros");
			}
			
		}
		
		//Modificar Usuarios
		if(request.getParameter("Actualizar")!=null) {
			int Dat;
			Cedula_Cliente=Long.parseLong(request.getParameter("Cedula"));
			Direccion_Cliente=request.getParameter("Direccion");
			Email_Cliente=request.getParameter("Correo");
			Nombre_Cliente=request.getParameter("Nombre");
			Telefono_Cliente=request.getParameter("Telefono");
			
			clidto=new ClientesDTO(Cedula_Cliente, Direccion_Cliente, Email_Cliente, Nombre_Cliente, Telefono_Cliente);
			clidao=new ClientesDAO();
			Dat=clidao.Actualizar(clidto);
			if(Dat>0) {
				JOptionPane.showMessageDialog(null, "Actualizacion Ok");
			}
			else {
				JOptionPane.showMessageDialog(null, "Error, No se actualizo");
			}
		}
		
		
		//Eliminar usuarios
		if(request.getParameter("Borrar")!=null) {
			int x=0;
			Cedula_Cliente=Long.parseLong(request.getParameter("Cedula"));
			clidto =new ClientesDTO(Cedula_Cliente);
			clidao =new ClientesDAO();
			
			x=clidao.Eliminar(clidto);
			if(x>0) {
				JOptionPane.showMessageDialog(null, "Eliminacion Ok");
			}
			else {
				JOptionPane.showMessageDialog(null, "No se Puede Eliminar");
			}
		}
			
	}

}
