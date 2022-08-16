<?php
	$numero1 = $_POST['num1'];
	$numero2 = $_POST['num2'];
	$operacion = $_POST['operacion']; //+ - * /
	if($numero2 == '')
		{
			$numero2 = 0; 
		}else
		{

		}
	echo "<center><h1>Calculadora</h1></center>";
	switch($operacion){
		case 1: suma($numero1, $numero2);
		break;
		case 2: resta($numero1, $numero2);
		break;
		case 3: multiplicacion($numero1, $numero2);
		break;
		case 4: division($numero1, $numero2);
		break;
		case 5: porcentaje($numero1, $numero2);
		break;
		case 6: Potencia($numero1, $numero2);
		break;
		case 7: Raiz($numero1);
		break;
		case 8: Logaritmo($numero1,$numero2);
		break;

		default: echo "No es una operación válidad";
	}
	function suma($num1, $num2){
		//global $numero1, $numero2;
		$resultado = $num1 + $num2;
		echo "{$num1} + {$num2} = {$resultado}";
		/*echo $numero1." + ".$numero2." = ".$resultado;*/
	}
	function resta($numero1, $numero2){
		$resultado = $numero1 - $numero2;
		echo "{$numero1} - {$numero2} = {$resultado}";
		/*echo $numero1." + ".$numero2." = ".$resultado;*/
	}
	function multiplicacion($numero1, $numero2){
		$resultado = $numero1 * $numero2;
		echo "{$numero1} * {$numero2} = {$resultado}";
		/*echo $numero1." + ".$numero2." = ".$resultado;*/
	}
	function division($numero1, $numero2){
		if($numero2 == 0)
		{
			echo "Infinito";
		}else{
		$resultado = $numero1 / $numero2;
		echo "{$numero1} / {$numero2} = {$resultado}";
		/*echo $numero1." + ".$numero2." = ".$resultado;*/
		}
	}
	function porcentaje($numero1, $numero2)
	{
		if($numero2 == 0)
		{
			echo "Infinito";

		}else{
			$resultado = (($numero1/100)*$numero2);
			echo "({$numero1}/100)*{$numero2}) = {$resultado}";
		}
	}

	function Potencia($numero1, $numero2){

		$resultado = pow($numero1,$numero2);

		echo " {$numero1} ^ {$numero2} = {$resultado}";
	}

	function Raiz($numero1)
	{
		$resultado = sqrt($numero1);

		echo "Raiz Cuadrada {$numero1} = {$resultado}";
	}

	function Logaritmo($numero1,$numero2)
	{
		global $resultado;
	    $i = 1;
	    $loga = 0;
	    while ($loga <= $numero2) {
	      $loga = pow($numero1,$i);
	      if ($loga == $numero2) {
	        $resultado = $i;
	        break;
	      }
	      $i++;
	    }
	    echo "Resultado = {$loga}";
	    if ($loga != $numero2) {
	      $resultado = "no se que poner";
	    }
	}
