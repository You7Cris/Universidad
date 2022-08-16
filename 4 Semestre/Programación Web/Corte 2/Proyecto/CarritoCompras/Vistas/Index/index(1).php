<?php
  require_once '../../Modelos/Session.php';
  require_once '../../Controladores/SessionControler.php';

  validar_session();

  if(isset($_GET['salir'])){
    $salir = $_GET['salir'];
    if($salir){
      salir();
    }
  }

 ?>
 <!DOCTYPE html>
 <html lang="es">
   <head>
     <meta charset="utf-8">
     <title>La tienda de Tulio</title>
       <!-- Incluir Bootstrap -->
     	<link rel="stylesheet" href="../../public/css/bootstrap.min.css" />
     	<!-- Incluir Fontawesome -->
     	<link rel="stylesheet" href="../../public/css/fontawesome.min.css" />
   </head>

   <body>

     <!-- navbar 1 -->
    <div class="fixed-top">
      <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container">
          <a class="navbar-brand" href="#">
            <img src="../../Public/imagenes/Tienda-de-tulio.jpg" width="30" height="30" class="d-inline-block align-top" alt="">
            La tienda de Tulio
          </a>
          <div id="navbarNavDropdown" class="navbar-collapse collapse">
            <ul class="navbar-nav mr-auto">
              <!-- espaciado -->
            </ul>
            <ul class="navbar-nav">
              <li>
                <a href="#" class="nav-link">
                  <i class="fa fa-shopping-cart"></i>
                  <span>0 Product(s) | $0</span>
                </a>
              </li>
              <!-- funciones    -->
              <li class="nav-link dropdown nav-item">
                  <a class="dropdown" data-toggle="dropdown" href="#">
                      <i class="fa fa-user fa-fw" style="color:RGB(124,124,125);"></i><i class="fa fa-caret-down" style="color:RGB(124,124,125);"></i>
                  </a>
                  <ul class="dropdown-menu" aria-labelledby="dropdownMenuLink">
                      <a href="../Usuario/index.php" class="dropdown-item" id=""><i class="fa fa-user fa-fw" style="color:RGB(124,124,125);"></i> Usuarios</a>
                      <a href="../Producto/index.php?session=true" class="dropdown-item" id=""><i class="fab fa-product-hunt" style="color:RGB(124,124,125);"></i> Productos</a>
                      <a href="index.php?salir=true" class="dropdown-item"><i class="fas fa-sign-out-alt" style="color:RGB(124,124,125);"></i> Cerrar Sesi&oacute;n</a>
                  </ul>
              </li>
            </ul>

            <form class="form-inline">
              <input class="form-control mr-sm-2" type="search" placeholder="Buscar..." aria-label="Search">
              <button class="btn btn-outline-success my-2 my-sm-0" type="submit"><i class="fa fa-search fa-fw"></i></button>
            </form>
          </div>
          <!-- boton del collapse -->
          <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarToggler" aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
        </div>
      </nav>


      <!-- navbar 2 -->
      <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container">
          <div class="collapse navbar-collapse" id="navbarToggler">
            <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
              <li class="nav-item">
                <a class="nav-link" href="index.php">Inicio</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#">Productos</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#">Acerca de</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#">Contacto</a>
              </li>
            </ul>
          </div>
        </div>
      </nav>

    </div>

   <!-- Carrousel  -->
   <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
     <ol class="carousel-indicators">
       <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
       <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
       <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
     </ol>
     <div class="carousel-inner">
       <div class="carousel-item active">
         <img class="d-block w-100" src="../../Public/imagenes/fondo.jpg" alt="First slide"  style="height: 80vh">
          <div class="carousel-caption d-none d-md-block">
            <h5>OFerta de locura</h5>
            <p>50% de descuentos</p>
          </div>
       </div>
       <div class="carousel-item">
         <img class="d-block w-100" src="../../Public/imagenes/Tienda-de-tulio.jpg" alt="Second slide"  style="height: 80vh">
          <div class="carousel-caption d-none d-md-block">
            <h5>OFerta de locura</h5>
            <p>50% de descuentos</p>
          </div>
       </div>
       <!-- <div class="carousel-item">
         <img class="d-block w-100" src=".../800x400?auto=yes&bg=555&fg=333&text=Third slide" alt="Third slide">
       </div> -->
     </div>
     <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
       <span class="carousel-control-prev-icon" aria-hidden="true"></span>
       <span class="sr-only">Atras</span>
     </a>
     <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
       <span class="carousel-control-next-icon" aria-hidden="true"></span>
       <span class="sr-only">Siguiente</span>
     </a>
   </div>
   <pre>
     <!-- espaciado -->
   </pre>
   <div class="container">
     <h3>Informacion de productos</h3>
     <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
   </div>


     <!-- Incluir Jquery -->
   	<script src="../../public/js/jquery.min.js"></script>
   	<!-- Incluir Bootstrap -->
   	<script src="../../public/js/bootstrap.min.js"></script>
   	<!-- Incluir Fontawesome -->
   	<script src="../../public/js/fontawesome.min.js"></script>
   </body>
 </html>
