<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css"href="css/StyleCliente.css">
<meta charset="ISO-8859-1">
<meta http-equiv="X-AU-Compatible"content="IE=edge">
<meta name="viewport" content="width=device-width,initial-scale=1.0">
<title>Datos_Clientes</title>
		
		<style>
		@import url('https://fonts.googleapis.com/css2?family=Squada+One&display=swap');
		body{
		
			font-family: 'Squada One', cursive;
			font-size: 15px;
			color:#F3F1FB ;
			background-image: url(./css/imagen/registro.jpg);
		    background-repeat: no-repeat;
			background-size: cover;
			background-attachment: fixed;
			background-position: center;
			position: relative;
		}
	</style>


</head>

<body>
	 

<header class="container">
  <div class="container_div">
    <nav class="nav">
      <ul >
          <li><a href="menuprincipla.jsp"class="nav_inicio">Inicio</a></li>
          
     </ul>
    </nav>
 </div>
 </header>
 
 <h1>AREA DE CLIENTES</h1>
<section>
    <div class="form-container">
    
   
   <form action="CRUDClientes" class="formulario"id="formulario"method="post">
   
    <!-- grupo cc -->
    
      <div class="formulario__grupo" id="grupo_Cedula">
         <label for="cedula" class="formulario__label">Cedula</label>
          <div class="formulario__grupo-input">
             <input type="text" name="Cedula" class="formulario__input"  id="Cedula" placeholder="ingrese Cedula">
               <i class="formulario__validacion-estado fas fa-times-circle"></i>
         </div>
         <p class="formulario__input-error">solo numeros</p>
     </div>
     
    <!--Grupo nombre -->
    
      <div class="formulario__grupo" id="grupo__nombre">
           <label for="nombre" class="formulario__label">Nombre</label>
           <div class="formulario__grupo-input">
                <input type="text" name="Nombre" class="formulario__input" id="nombre" placeholder="ingrese nombre">
                 <i class="formulario__validacion-estado fas fa-times-circle"></i>
       	   </div>
           <p class="formulario__input-error">El nombretiene que ser de 4 a 20 digitos y solo puede contener  letras </p>
       </div>
       
        <!-- Grupo direccion -->
        
      <div class="formulario__grupo" id="grupo__direccion">
         <label for="direccion" class="formulario__label">Direccion</label>
         <div class="formulario__grupo-input">
             <input type="text" name="Direccion" class="formulario__input"  id="direccion" placeholder="direccion">
             <i class="formulario__validacion-estado fas fa-times-circle"></i>
         </div>
         <p class="formulario__input-error">La direccion tiene que ser de 10 a 20 digitos y solo puede contener numeros, letras </p>
      </div> 
      
            <!-- Grupo telefono -->
            
      <div class="formulario__grupo" id="grupo__telefono">
         <label for="telefono" class="formulario__label">Telefono</label>
         <div class="formulario__grupo-input">
             <input type="text" name="Telefono" class="formulario__input" id="telefono" placeholder="12358955">
             <i class="formulario__validacion-estado fas fa-times-circle"></i>
         </div>
         <p class="formulario__input-error">El telefono tiene que ser de 14 digitos </p>  
      </div>    
            
            <!-- Grupo Email -->
            
      <div class="formulario__grupo-1" id="grupo__email">
          <label for="e-mail" class="formulario__label">Email</label>
          <div class="formulario__grupo-input">
             <input type="text" name="Email" class="formulario__input" id="Email" placeholder="ejemplo@">
             <i class="formulario__validacion-estado fas fa-times-circle"></i>
         </div>
         <p class="formulario__input-error">Este campo debe contener de 10 a 20 digitos y solo pueden contenr letras  </p>  
      </div>  
       
            <!--mensajes y botones-->
     
     
     <div class="botones" id="botones">
	         <button type="submit" name="Crear" class="formulario_btn4">   Crear  </button> 
	         <button type="submit" name="Buscar" class="formulario_btn3">Consultar </button>
	         <button type="submit" name="Actualizar"class="formulario_btn2">Actualizar</button> 
	         <button type="submit" name="Borrar"class="formulario_btn1"> Eliminar </button> 
	         
    </div>
    	
  </form>
  
  </div>
</section>




<script src="https://kit.fontawesome.com/9a15d400d4.js" crossorigin="anonymous"></script>
</body>
</html>