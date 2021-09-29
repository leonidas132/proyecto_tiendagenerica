<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css"href="css/stylesproveedor.css">
<meta charset="ISO-8859-1">
<meta http-equiv="X-AU-Compatible"content="IE=edge">
<meta name="viewport" content="width=device-width,initial-scale=1.0">
<title>Insert title here</title>
</head>
<body>
<header class="container">
  <div class="container_div">
    <nav class="nav">
      <ul >
          <li><a href="menuprincipla.jsp"class="nav_inicio">Inicio</a></li>
          <h1>Registro de Proveedor</h1>
     </ul>
    </nav>
 </div>
 </header>
<main>
   
   <form action="" class="formulario"id="formulario">
   
    <!-- grupo nit -->
    
      <div class="formulario__grupo" id="grupo_nit">
         <label for="nit" class="formulario__label">Nit</label>
          <div class="formulario__grupo-input">
             <input type="text" name="nit" class="formulario__input" id="nit" placeholder="ingrese nit">
               <i class="formulario__validacion-estado fas fa-times-circle"></i>
         </div>
         <p class="formulario__input-error">El nit tiene que ser de 4 a 10 digitos y solo puede contener numeros, letras y guion bajo</p>
     </div>
     
    <!--Grupo nombre -->
      <div class="formulario__grupo" id="grupo__nombre">
           <label for="nombre" class="formulario__label">Nombre</label>
           <div class="formulario__grupo-input">
                <input type="text" name="nombre" class="formulario__input" id="nombre" placeholder="ingrese nombre">
                 <i class="formulario__validacion-estado fas fa-times-circle"></i>
       	   </div>
           <p class="formulario__input-error">El nombretiene que ser de 4 a 20 digitos y solo puede contener  letras </p>
       </div>
       
        <!-- Grupo direccion -->
      <div class="formulario__grupo" id="grupo__direccion">
         <label for="direccion" class="formulario__label">Direccion</label>
         <div class="formulario__grupo-input">
             <input type="text" name="direccion" class="formulario__input" id="direccion" placeholder="cll 20-No 20-40a">
             <i class="formulario__validacion-estado fas fa-times-circle"></i>
         </div>
         <p class="formulario__input-error">La direccion tiene que ser de 10 a 20 digitos y solo puede contener numeros, letras </p>
      </div> 
      
            <!-- Grupo telefono -->
      <div class="formulario__grupo" id="grupo__telefono">
         <label for="telefono" class="formulario__label">Telefono</label>
         <div class="formulario__grupo-input">
             <input type="text" name="telefono" class="formulario__input" id="telefono" placeholder="12358955">
             <i class="formulario__validacion-estado fas fa-times-circle"></i>
         </div>
         <p class="formulario__input-error">El telefono tiene que ser de 14 digitos </p>  
      </div>    
            
            <!-- Grupo ciudad -->
      <div class="formulario__grupo-1" id="grupo__ciudad">
          <label for="cuidad" class="formulario__label">Ciudad</label>
          <div class="formulario__grupo-input">
             <input type="text" name="ciudad" class="formulario__input" id="ciudad" placeholder="Bogota-colombia">
             <i class="formulario__validacion-estado fas fa-times-circle"></i>
         </div>
         <p class="formulario__input-error">Este campo debe contener de 10 a 20 digitos y solo pueden contenr letras  </p>  
      </div>  
       
            <!--mensajes y botones-->
     
      <div class="formulario_mensaje" id="formulario_mensaje">
         <p ><i class="fas fa-exclamation-triangle"></i><b>Error: </b> por favor rellene el formulario correctamente</p>
      </div>
     <div class="botones" id="botones">
	         <button type="submit" class="formulario_btn4">Crear</button>
	         <button type="submit" class="formulario_btn3">Consultar</button>
	         <button type="submit" class="formulario_btn2">Actualizar</button>
	         <button type="submit" class="formulario_btn1">Eliminar</button>
    </div>
  </form>
</main>





<script src="https://kit.fontawesome.com/9a15d400d4.js" crossorigin="anonymous"></script>
</body>
</html>

