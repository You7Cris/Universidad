<?php

  if (isset($_REQUEST['opcion'])) {
    require_once '../Modelos/Conexion.php';
    require_once '../Modelos/Producto.php';

    $opcion = $_REQUEST['opcion'];

    if ($opcion == 'create') {
      $nombre = $_REQUEST['nombre'];
      $descripcion = $_REQUEST['descripcion'];
      $valor = $_REQUEST['valor'];

      $dir_subida = '../Public/imagenes/Productos/';

      //extension de la imagen
      if($_FILES['foto']['size']< 10000000)
      {

        $ext = explode(".",$_FILES['foto']['name']); 
      if(strtolower($ext[1]) == "png" || strtolower($ext[1] == "jpg") || strtolower($ext[1] == "jpeg") || strtolower($ext[1] == "tif"))
      {
        //Validar tamaño
        /*$im_info = getimagesize($_FILES['foto']['tmp_name']);
        
        //Ancho y alto max
        $max_ancho = 600; $max_alto =400;

        //Medir la imagen

        list($ancho,$alto)=getimagesize($_FILES['foto']['tmp_name']);

        //Ratio
        $x_ratio = $max_ancho/$ancho;
        $y_ratio = $max_alto/$alto;

        if(($ancho <= $max_ancho) && ($alto <= $max_alto) ){
              $ancho_final = $ancho;
              $alto_final = $alto;
          }
          else if(($x_ratio * $alto) < $max_alto){
              $alto_final = ceil($x_ratio * $alto);
              $ancho_final = $max_ancho;
          }
          else {
              $ancho_final = ceil($y_ratio * $ancho);
              $alto_final = $max_alto;
          }
          //Crear un lienzo
          $lienzo=imagecreatetruecolor($ancho_final,$alto_final); 

          //Copiar original en lienzo
          imagecopyresampled($lienzo,$original,0,0,0,0,$ancho_final, $alto_final,$ancho,$alto);
           
          //Destruir la original
          imagedestroy($original);

          //Crear la imagen y guardar en directorio upload/
          imagejpeg($lienzo,$fichero_subido.$_FILES['foto']['name']);*/

         $fichero_subido = $dir_subida.basename($_FILES['foto']['name']);
            if (move_uploaded_file($_FILES['foto']['tmp_name'], $fichero_subido)) {
                // echo "El fichero es válido y se subió con éxito.\n";
              
            } else {
                // echo "¡Posible ataque de subida de ficheros!\n";
            }
            store($nombre, $descripcion, $fichero_subido, $valor);
      }else{
         echo "<script>
                alert('El archivo adjunto solo acepta archivos con extension png, jpg, jpeg y tif');
                window.Location='../Vistas/Producto/edit.php';
              </script>";

               echo "<h3>Producto No agregado!</h3><a href='../Vistas/Producto/index.php'>Volver</a>";
          // header('Location: ../Vistas/Producto/index.php');
      }
      }else
      {
        echo "<script>
                alert('El archivo adjunto es demasiado grande');
                window.Location='../Vistas/Producto/index.php';
              </script>";

        echo "<h3>Producto No agregado!</h3><a href='../Vistas/Producto/index.php'>Volver</a>";
      }
      // header('Location: ../Vistas/Producto/index.php');
     
    }

    if ($opcion == 'edit') {
      $id = $_REQUEST['id'];
      $nombre = $_POST['nombre'];
      $descripcion = $_POST['descripcion'];
      $valor = $_POST['valor'];

      $dir_subida = '../public/imagenes/Productos/';
      //extension de la imagen
      if($_FILES['foto']['size']< 10000000)
      {
        $ext = explode(".",$_FILES['foto']['name']); 
      if(strtolower($ext[1]) == "png" || strtolower($ext[1] == "jpg") || strtolower($ext[1] == "jpeg") || strtolower($ext[1] == "tif"))
      {
         $fichero_subido = $dir_subida.basename($_FILES['foto']['name']);
            if (move_uploaded_file($_FILES['foto']['tmp_name'], $fichero_subido)) {
                // echo "El fichero es válido y se subió con éxito.\n";
              
            } else {
                // echo "¡Posible ataque de subida de ficheros!\n";
            }
            edit($id, $nombre,$descripcion,$fichero_subido, $valor);
      }else{
         echo "<script>
                alert('El archivo adjunto solo acepta archivos con extension png, jpg, jpeg y tif');
                window.Location='../edit.php';
              </script>";

              echo "<h3>Producto No Actualizado!</h3> <a href='../Vistas/Producto/index.php'>Volver</a>";

      }
      }else
      {
        echo "<script>
                alert('El archivo adjunto es demasiado grande');
                window.Location='../Vistas/Producto/edit.php';
              </script>";
        echo "<h3>Producto No Actualizado!</h3><a href='../Vistas/Producto/index.php'>Volver</a>";
      }
    }

    if($opcion === 'delete'){
      $id = $_REQUEST['id'];
      delete($id);
    }
  }



  function index(){
    $productos = NEW Producto();
    $listadoProductos = $productos->index();
    if($listadoProductos !== false){
      foreach ($listadoProductos as $producto) {
        echo "<tr>";
        echo "<td>".$producto['id']."</td>";
        echo "<td>".$producto['nombre']."</td>";
        echo "<td>".$producto['descripcion']."</td>";
        echo "<td> <img src='../".$producto['foto']."' height='50px' width='50px'></td>";
        echo "<td>".$producto['valor']."</td>";
        echo "<td>
        <a class='btn btn-primary'  id='show' data-nit='".$producto['id']."' data-toggle='modal' data-target='#ModalContainer'><i class='fa fa-search'></i> Ver</a>

        <a class='btn btn-warning' id='edit' data-nit='".$producto['id']."' data-toggle='modal' data-target='#ModalContainer'><i class='fa fa-edit'></i> Editar</a>

        <a class='btn btn-danger' onClick=\"return confirm('Eliminar este Resgistro')\" href='../../Controladores/ProductoController.php?opcion=delete&id=".$producto['id']."'><i class='fa fa-trash'></i> Eliminar</a>
        </td>";
        echo "</tr>";
      }
    }else{
      echo "<div class='alert alert-success' style='margin-top: 2%;'><fieldset> No hay registros en la base de datos</fieldset></div>";
    }
  }

  function store($nombre, $descripcion, $imagen, $valor){
  	$productos = new Producto();
  	$resultado = $productos->store($nombre,$descripcion,$imagen, $valor);
    header ('Location: ../Vistas/Producto/index.php?respuesta='.$resultado.'');
  }

  function show($id){
  	$productos = new Producto();
  	$obtenerProducto = $productos->show($id);
  	foreach ($obtenerProducto as $producto) {
  		echo "<div class='form-group'>";
  		echo "<label class=''>Nombre Producto</label>";
  		echo "<input type='text' class='form-control' readonly value='".$producto['nombre']."'/>";

  		echo "<label class=''>Descripción Producto</label>";
  		echo "<input type='text' class='form-control' readonly value='".$producto['descripcion']."'/>";

  		echo "<label class=''>Imagen Producto</label>";
  		echo "<br /><img src='../".$producto['foto']."' height='50px' width='50px'>";

  		echo "<br /><label class=''>Valor Producto</label>";
  		echo "<input type='text' class='form-control' readonly value='".$producto['valor']."'/>";
  		echo "</div>";
  	}
  }

  function edit($id, $nombre, $descripcion, $foto, $valor){
  	$productos = new Producto();
  	$resultado = $productos->update($id, $nombre,$descripcion, $foto, $valor);
    header ('Location: ../Vistas/Producto/index.php?respuesta='.$resultado.'');

  }

  function delete(){
  	$id = $_REQUEST['id'];
  	$productos = new Producto();
  	$resultado = $productos->delete($id);
    header ('Location: ../Vistas/Producto/index.php?respuesta='.$resultado.'');

  }

  function search($nombre){
    $productos = NEW Producto();
    $obtenerProducto = $productos->search($nombre);
    if($obtenerProducto !== false){
      foreach ($obtenerProducto as $producto) {
        echo "<tr>";
        echo "<td>".$producto['id']."</td>";
        echo "<td>".$producto['nombre']."</td>";
        echo "<td>".$producto['descripcion']."</td>";
        echo "<td> <img src='../".$producto['foto']."' height='50px' width='50px'></td>";
        echo "<td>".$producto['valor']."</td>";
        echo "</tr>";
      }
    }else{
      echo "<div class='alert alert-success' style='margin-top: 2%;'><fieldset> No se encontraron coincidencias</fieldset></div>";
    }
  }
 ?>
