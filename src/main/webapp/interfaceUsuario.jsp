<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css"href="css/stylesusuario.css">
<meta charset="ISO-8859-1">
 <meta http-equiv="X-UA-Compatible" content="IE=edge">
 <meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Datos Usuario</title>
</head>
<body>
<header class="container">
  <div class="container_div">
    <nav class="nav">
      <ul >
          <li><a href="menuprincipla.jsp"class="nav_inicio">Inicio</a></li>
          <h1> Datos del Usuario</h1>
     </ul>
    </nav>
 </div>
 </header>
  <main>
 
     <form action="" class="formulario" id="formulario">
     
            <!-- grupo cedula -->
       <div class="formulario__grupo " id="grupo__cedula">
        <label for="cedula" class="formulario_label">Cedula</label>
         <div class="formulario__grupo-input">
           <input type="text" class="formulario__input" name="cedula" id="cedula" placeholder="Ingrese cedula">
           <i class="formulario__validacion-estado fas fa-times-circle"></i>
         </div>
            <p class="formulario__input-error">Este campo solo deve contener numero.</p>
       
       </div>
       
     <!-- grupo nombre -->
       <div class="formulario__grupo" id="grupo__nombre">
        <label for="nombre" class="formulario_label">Nombre</label>
         <div class="formulario__grupo-input">
           <input type="text" class="formulario__input" name="nombre" id="nombre" placeholder="Ingrese nombre">
           <i class="formulario__validacion-estado fas fa-times-circle"></i>
         </div>
            <p class="formulario__input-error">Este campo solo deve contener letras.</p>
       
       </div>
            <!-- grupo gmail -->
       <div class="formulario__grupo" id="grupo__gmail">
        <label for="gmail" class="formulario_label">Gmail</label>
         <div class="formulario__grupo-input">
           <input type="email" class="formulario__input" name="gmail" id="gmail" placeholder="correo electronico">
           <i class="formulario__validacion-estado fas fa-times-circle"></i>
         </div>
            <p class="formulario__input-error">Este campo puede contener letras,numero y cacteres especiales. </p>
       </div>
       
            <!-- grupo usuario -->
       <div class="formulario__grupo" id="grupo__usuario">
        <label for="usuario" class="formulario_label">Usuario</label>
         <div class="formulario__grupo-input">
           <input type="text" class="formulario__input" name="usuario" id="usuario" placeholder="Ingrese usuario">
           <i class="formulario__validacion-estado fas fa-times-circle"></i>
         </div>
            <p class="formulario__input-error">Este campo solo deve contener letras y numeros.</p>
        </div>
       
             <!-- grupo contraseña -->
       <div class="formulario__grupo" id="grupo__password">
        <label for="password" class="formulario_label">Contraseña</label>
         <div class="formulario__grupo-input">
           <input type="Password" class="formulario__input" name="password" id="password" placeholder="******">
           <i class="formulario__validacion-estado fas fa-times-circle"></i>
         </div>
            <p class="formulario__input-error">Este campo solo deve contener de 4 a 10 digitos.</p>
       </div>
        
       <!-- grupo contraseña 2-->
       <div class="formulario__grupo" id="grupo__password2">
        <label for="password2" class="formulario_label">Verificar contraseña</label>
         <div class="formulario__grupo-input">
           <input type="Password" class="formulario__input" name="password2" id="password2" placeholder="******">
           <i class="formulario__validacion-estado fas fa-times-circle"></i>
         </div>
            <p class="formulario__input-error">Ambas contraseñas deben ser iguales. </p>
       </div>
       
       <div class="formulario__mensaje" id="formulario__mensaje">
         <p><i class="fas fa-exclamation-triangle"></i><b>Error: </b> Por favor rellene el formulario correctamente</p>
       </div>
       <div class="formulario__grupo formulario__grupo-btn-opciones">
         <button type="submit" class="formulario__btn btn1"name="crear">Crear</button>
         <button type="submit" class="formulario__btn"name="consultar">Consultar</button>
         <button type="submit" class="formulario__btn"name="actualizar">Actualizar</button>
         <button type="submit" class="formulario__btn"name="eliminar" >Eliminar</button>
         <p class="formulario__mensaje-exito" id=formulario__mensaje-exito>proceso exitoso..!</p>
       </div>
     
     </form>
  
  
  
  
  
  </main>

   <script src="https://kit.fontawesome.com/9a15d400d4.js" crossorigin="anonymous"></script>
</body>
</html>