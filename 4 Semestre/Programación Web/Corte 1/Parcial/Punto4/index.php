<?php  
	$a = $_REQUEST["a"];
	$b = $_REQUEST["b"];
	$c = $_REQUEST["c"];
	$d = $_REQUEST["d"];
	$numero = $_POST["numero"];
	$operacion = $_POST["operacion"];
	echo "<center><h1>Operacion de fracciones</h1></center>";
	switch ($operacion) {
		case 1:
			Suma($a,$b,$c,$d);
			break;
			case 2:
			Resta($a,$b,$c,$d);
			break;
			case 3:
			Multiplicacion($a,$b,$c,$d);
			break;
			case 4:
			Division($a,$b,$c,$d);
			break;
			case 5:
			Potencia($a,$b,$numero);
			break;
			case 6:
			Raiz($a,$b);
			break;
		default:
			"Error";
	}


	function Suma($a,$b,$c,$d)
	{
		if($b == $d)
		{
			$resultado = $a+$c;
			echo "El resultado es: ".$resultado."/".$b;
			Simplificacion($resultado,$b);

		}else{
			$a1 = ($a * $d);
			$a2 = ($b * $c);
			$a3 = ($b * $d);
			$resultado = ($a1 + $a2);
			echo "El resultado es: ".$resultado." / ".$a3;
			Simplificacion($resultado,$a3);
		}
	}


	function Resta($a,$b,$c,$d)
	{
		if($b == $d)
		{
			$resultado = $a - $c;
			echo "El resultado es: ".$resultado."/".$b;

		}else{
			$a1 = ($a * $d);
			$a2 = ($b * $c);
			$a3 = ($b * $d);
			$resultado = ($a1 - $a2);
			echo "El resultado es: ".$resultado." / ".$a3;
			Simplificacion($resultado,$a3);
		}
	}

	function Multiplicacion($a,$b,$c,$d)
	{
		$a1 = ($a * $c);
		$a2 = ($b * $d);
		$resultado = $a1 / $a2;
		echo "El resultado es: ".$a1." / ".$a2;
		Simplificacion($a1,$a2);
	}


	function Division($a,$b,$c,$d)
	{
		$a1 = $a * $d;
		$a2 = $b * $c;
		$resultado = $a1 / $a2;
		echo "El resultado es: ".$a1." / ".$a2;
		Simplificacion($a1,$a2);
	}

	function Potencia($a,$b,$numero)
	{
		if($numero < 0)
		{
			$numero = $numero * -1;
			$aux = $a;
			$a = $b;
			$b = $aux;

			$a1 = pow($a,$numero);
			$a2 = pow($b,$numero);

			echo "El resultado es: ".$a1." / ".$a2;
			Simplificacion($a1,$a2);
		}else{
			$a1 = pow($a,$numero);
			$a2 = pow($b,$numero);

			echo "El resultado es: ".$a1." / ".$a2;
			Simplificacion($a1,$a2);
		}

	}

	function Raiz($a,$b)
	{
		if($a < 0)
		{
			$aux = $a*-1;
			$a = $b;
			$b = $aux;

			$a1 = sqrt($a);
			$a2 = sqrt($b);

			echo "El resultado es: ".$a1." / ".$a2."<br><br>";
			Simplificacion($a1,$a2);
		}else{
			$a1 = sqrt($a);
			$a2 = sqrt($b);

			echo "El resultado es: ".$a1." / ".$a2."<br><br>";
			Simplificacion($a1,$a2);
		}
	}



	function Simplificacion($resultado,$a3)
	{
		echo "<br><br>Simplificacion<br>";
		if($a3 == 1)
		{
			echo $resultado;
		}else{
			$b = 2;
			while ($b <= $resultado) 
			{
				if($resultado%$b == 0 && $a3%$b == 0 )
				{
					$a3 = $a3/$b;
					$resultado = $resultado/$b;
					echo $resultado." / ".$a3."<br>";
				}else{
					$b+=1;
				}
		
			}
		}
	}









?>