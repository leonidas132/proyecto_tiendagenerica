package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import modelo.UsuariosDAO;
import modelo.UsuariosDTO;

/**
 * Servlet implementation class CRUDUsuarios
 */
@WebServlet("/CRUDUsuarios")
public class CRUDUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public CRUDUsuarios() {
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
		// TODO Auto-generated method stub
		doGet(request, response);
		
		boolean X;
		long Usuario_Cedula;
		String Email_Usuario;
		String Nombre_Usuario;
		String Password;
		String Usuario;
		
		UsuariosDTO usdto;
		UsuariosDAO usdao;
		UsuariosDTO registro;
		
		
		//Insertar Usuarios
		if(request.getParameter("crear")!=null) {
			Usuario_Cedula=Long.parseLong(request.getParameter("cedula"));
			Email_Usuario=request.getParameter("gmail");
			Nombre_Usuario=request.getParameter("nombre");
			Password=request.getParameter("password2");
			Usuario=request.getParameter("usuario");
			
			usdto = new UsuariosDTO(Usuario_Cedula, Email_Usuario, Nombre_Usuario, Password, Usuario);
			usdao = new UsuariosDAO();
			
			X=usdao.InsertarUsuarios(usdto);
			if(X) {
				JOptionPane.showMessageDialog(null, "Se Ingreso sin Problemas");
				
			}else 
				JOptionPane.showMessageDialog(null, "Error al Ingresar usuario");
				
		}
		
		// Buscar Usuarios
		if(request.getParameter("consultar")!=null) {
			long Cedula;
			String Email;
			String Nombre;
			String Clave;
			String User;
			
			Usuario_Cedula=Long.parseLong(request.getParameter("cedula"));
			usdto  = new UsuariosDTO(Usuario_Cedula);
			usdao = new UsuariosDAO();
			
			registro=usdao.ConsultarUsuarios(usdto);
			
			if(registro!=null) {
				
				Cedula=registro.getCedula_Usuario();
				Email=registro.getEmail_Usuario();
				Nombre=registro.getNombre_Usuario();
				Clave=registro.getPassword();
				User=registro.getUsuario();
				
			}
			else
				JOptionPane.showMessageDialog(null, "No hay registros");
			
		}
		
		
		// Actualizar Usuarios
		if(request.getParameter("actualizar")!=null) {
			Usuario_Cedula=Long.parseLong(request.getParameter("cedula"));
			Email_Usuario=request.getParameter("gmail");
			Nombre_Usuario=request.getParameter("nombre");
			Password=request.getParameter("password2");
			Usuario=request.getParameter("usuario");
			
			usdto = new UsuariosDTO(Usuario_Cedula, Email_Usuario, Nombre_Usuario, Password, Usuario);
			usdao = new UsuariosDAO();
			
			X=usdao.ModificarUsuarios(usdto);
			if(X) {
				JOptionPane.showMessageDialog(null, "Se Actualizo sin problemas");
			}else
				JOptionPane.showMessageDialog(null, "Problemas Para Actualizar");
		}
		
		
		//Eliminar Usuarios
		if(request.getParameter("eliminar")!=null) {
			Usuario_Cedula=Long.parseLong(request.getParameter("cedula"));
			usdto =new UsuariosDTO(Usuario_Cedula);
			usdao =new UsuariosDAO();
			
			X=usdao.EliminarUsuarios(usdto);
			if(X) {
				JOptionPane.showMessageDialog(null, "Eliminacion sin Problemas");
			}else
				JOptionPane.showMessageDialog(null, "Hay Problemas");
		}
	}

}
