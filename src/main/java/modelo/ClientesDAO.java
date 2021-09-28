package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import controlador.Conexion;

public class ClientesDAO {
		
		Conexion con=new Conexion();
		Connection cnn=con.conexionbd();
		PreparedStatement ps;
		ResultSet rs;
		ClientesDTO clientedto=null;

}
