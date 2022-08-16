<?php
  $orden = $_REQUEST['orden'];


  // creacion de la matriz original
  function llenar($orden){
    for ($i=0; $i < $orden; $i++) {
      for ($j=0; $j < $orden; $j++) {
        $ma[$i][$j] = rand(-10,10);
      }
    }
    return $ma;
  }

  function mostrar($ma, $orden){
    for ($i=0; $i < $orden; $i++) {
      for ($j=0; $j < $orden; $j++) {
        echo $ma[$i][$j]." ";
      }
      echo "<br />";
    }
  }

  function cuadrado($ma, $orden){
    for ($i=0; $i < $orden; $i++) {
      for ($k=0; $k < $orden; $k++) {
        $contenedor = 0;
        for ($j=0; $j < $orden; $j++) {
          $contenedor += $ma[$i][$j] * $ma[$j][$k];
          $matrizR[$i][$k] = $contenedor;
        }
      }
    }
    return $matrizR;
  }

  function cubo($ma, $ma2, $orden) {
    for ($i=0; $i < $orden; $i++) {
      for ($k=0; $k < $orden; $k++) {
        $contenedor = 0;
        for ($j=0; $j < $orden; $j++) {
          $contenedor += $ma[$i][$j] * $ma2[$j][$k];
          $matrizR[$i][$k] = $contenedor;
        }
      }
    }
    return $matrizR;
  }






  echo "Matriz origianl<br />";
  $matriz = llenar($orden);
  mostrar($matriz,$orden);
  echo "<br /><br />Matriz Cuadrada".'<br />';
  $matrizC = cuadrado($matriz, $orden);
  mostrar($matrizC, $orden);
  echo "<br /><br />Matriz al Cubo".'<br />';
  $matrizCubo = cubo($matrizC, $matriz, $orden);
  mostrar($matrizCubo, $orden);



 ?>
