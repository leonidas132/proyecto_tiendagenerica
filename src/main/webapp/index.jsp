<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu Clientes</title>
</head>
<body>

<%

String Cedula="";
String Direccion="", Correo="", Nombre="", Telefono="";

if(request.getParameter("Cedula")!=null){
	Cedula=String.valueOf(request.getParameter("Cedula"));
	Direccion=request.getParameter("Direccion");
	Correo=request.getParameter("Email");
	Nombre=request.getParameter("Nombre");
	Telefono=request.getParameter("Telefono");	
}

%>

<form action="Clientes" method="post">

<h1>Menu de Clientes</h1>

 <input type="text" name="Cedula" value="<%=Cedula %>"  placeholder="Cedula">
 <input type="text" name="Direccion" value="<%=Direccion %>"  placeholder="Direccion">
 <input type="text" name="Correo" value="<%=Correo %>" placeholder="Correo">
 <input type="text" name="Nombre" value="<%=Nombre %>" placeholder="Nombre">
 <input type="text" name="Telefono" value="<%=Telefono %>"  placeholder="Telefono">
 
 
 <input type="submit"name="Crear"value="Crear">
 <input type="submit" name="Buscar"value="Consultar">
 <input type="submit" name="Actualizar"value="Actualizar">
 <input type="submit" name="Borrar"value="Eliminar">

 
 </form>

</body>
</html>