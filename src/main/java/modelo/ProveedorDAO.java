package modelo;

import java.sql.*;

import controlador.Conexion;

public class ProveedorDAO {
//esta clase hace referencia a todo lo que tiene que ver con la base de datos y su consultas //
	Conexion con=new Conexion();
	Connection cnn=con.conexionbd();
	PreparedStatement ps;
	ResultSet rs;
	ProveedorDTO proveedor;
	
	public boolean insertarProveedor(ProveedorDTO  dto) {
		int r;
		boolean dat= false;
		try {
			ps=cnn.prepareStatement("INSERT INTO proveedor value(?,?,?,?,?)");
			ps.setLong(1, dto.getNit());
			ps.setString(2, dto.getCiudad());
			ps.setString(3, dto.getDireccion());
			ps.setString(4, dto.getNombre_proveedor());
			ps.setString(5, dto.getTelefono());
			
			r=ps.executeUpdate();
			if(r>0) {
				dat=true;
			}
			
		} catch (SQLException e) {
		   System.out.println("Error en la insercion"+ e);
		}
		return dat;
	}
	
	
	
	
	public ProveedorDTO consultar(ProveedorDTO dto) {
		try {
			ps=cnn.prepareStatement("SELECT * FROM proveedor WHERE nit_proveedor=?");
			ps.setLong(1,dto.getNit());
			rs=ps.executeQuery();
			if(rs.next()) {
			   
				proveedor=new ProveedorDTO(rs.getLong(1),rs.getString(4),rs.getString(3),rs.getString(5),rs.getString(2));
			}
			else {
				return null;
			}
		} catch (SQLException e) {
			System.out.println("error en la consulta"+ e);
		}
		
		return proveedor;
	}
	
	
	
	
	
	public int Actualizar(ProveedorDTO dto ) {
		int x=0;
		try {
			ps=cnn.prepareStatement("UPDATE proveedor SET ciudad_proveedor=?,direccion_proveedor=?,nombre_proveedor=?,telefono_provedor=? WHERE nit_proveedor=?");
			ps.setString(1, dto.getCiudad());
			ps.setString(2, dto.getDireccion());
			ps.setString(3, dto.getNombre_proveedor());
			ps.setString(4, dto.getTelefono());
			ps.setLong(5, dto.getNit());
			x=ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Error al actualizar proveedor"+ e);
		}
		return x;
	}
	
	public int eliminar (ProveedorDTO dto) {
		int x=0;
		try {
			ps=cnn.prepareStatement("DELETE  FROM proveedor WHERE nit_proveedor=?");
			ps.setLong(1, dto.getNit());
			x=ps.executeUpdate();
			System.out.println(x);
		} catch (SQLException e) {
		  System.out.println("error al eliminar" + e);
		}
		return x;
	}
	
	
	
}
