<?php 
	$valor = $_POST["valor"];
	$origen =$_POST['origen'];
	$destino =$_POST['destino'];
	echo "<center><h1>Convertidor</h1></center>";
	switch ($origen) {
		case 1:
			bit($valor,$destino);
			break;
		case 2:
			bytes($valor,$destino);
			break;
		case 3:
			kilobyte($valor,$destino);
			break;
		case 4:
			megabytes($valor,$destino);
			break;
		case 5:
			gigabytes($valor,$destino);
			break;
		case 6:
			terabytes($valor,$destino);
			break;
		default:
			echo "Error....<br>";
			break;
	}


	function bit($valor,$destino)
	{
		switch ($destino) {
				case 1:
				$resultado = $valor;
				echo "El resultado es: ".$resultado;
				break;
				case 2:
				$resultado = ($valor * 1)/8;
				echo "El resultado es: ".$resultado;
				break;
				case 3:
				$resultado = ($valor * 1)/8;
				$resultado2 = ($resultado * 1)/1024;
				echo "El resultado es: ".$resultado2;
				break;
				case 4:
				$resultado = ($valor * 1)/8;
				$resultado2 = ($resultado * 1)/1024;
				$resultado3 = ($resultado2 * 1)/1024;
				echo "El resultado es: ".$resultado3;
				break;
				case 5:
				$resultado = ($valor * 1)/8;
				$resultado2 = ($resultado * 1)/1024;
				$resultado3 = ($resultado2 * 1)/1024;
				$resultado4 = ($resultado3 * 1)/1024;
				echo "El resultado es: ".$resultado4;
				break;
				case 6:
				$resultado = ($valor * 1)/8;
				$resultado2 = ($resultado * 1)/1024;
				$resultado3 = ($resultado2 * 1)/1024;
				$resultado4 = ($resultado3 * 1)/1024;
				$resultado5 = ($resultado4 * 1)/1024;
				echo "El resultado es: ".$resultado5;
				break;
			default:
				echo "error";
				break;
		}

	}


	function bytes($valor,$destino)
	{
		switch ($destino) {
			case 1:
				$resultado = $valor * 8;
				echo "El resultado es: ".$resultado;
				break;
				case 2:
				$resultado = $valor;
				echo "El resultado es: ".$resultado;
				break;
				case 3:
				$resultado = $valor /1024;
				echo "El resultado es: ".$resultado;
				break;
				case 4:
				$resultado = $valor /1024;
				$resultado2 = $resultado /1024;
				echo "El resultado es: ".$resultado2;
				case 5:
				$resultado = $valor /1024;
				$resultado2 = $resultado /1024;
				$resultado3 = $resultado2 /1024;
				echo "El resultado es: ".$resultado3;
				break;
				case 6:
				$resultado = $valor /1024;
				$resultado2 = $resultado /1024;
				$resultado3 = $resultado2 /1024;
				$resultado4 = $resultado3 /1024;
				echo "el resultado es: ".$resultado4;
				break;
			default:
				echo "Error";
				break;
		}
	}

	function kilobyte($valor,$destino)
	{
		switch ($destino) {
			case 1:
				$resultado = $valor * 1024;
				$resultado2 = $resultado * 8;
				echo "El resultado es: ".$resultado2;
				break;
				case 2:
				$resultado = $valor * 1024;
				echo "El resultado es: ".$resultado;
				break;
				case 3:
				$resultado = $valor;
				echo "El resultado es: ".$resultado;
				break;
				case 4:
				$resultado = $valor / 1024;
				echo "El resultado es: ".$resultado;
				break;
				case 5:
				$resultado = $valor / 1024;
				$resultado2 = $resultado / 1024;
				echo "El resultado es: ".$resultado2;
				break;
				case 6:
				$resultado = $valor / 1024;
				$resultado2 = $resultado / 1024;
				$resultado3 = $resultado2 / 1024;
				echo "El resultado es: ".$resultado3;
				break;
			default:
				echo "Error";
				break;
		}

	}


	function megabytes($valor,$destino)
	{
		switch ($destino) {
			case 1:
				$resultado = $valor * 1024;
				$resultado2 = $resultado * 1024;
				$resultado3 = $resultado2 * 8;
				echo "El resultado es: ".$resultado3;
				break;
				case 2:
				$resultado = $valor * 1024;
				$resultado2 = $resultado * 1024;
				echo "El resultado es: ".$resultado2;
				break;
				case 3:
				$resultado = $valor * 1024;
				echo "El resultado es: ".$resultado;
				break;
				case 4:
				$resultado = $valor;
				echo "El resultado es: ".$resultado;
				break;
				case 5:
				$resultado = $valor / 1024;
				echo "El resultado es: ".$resultado;
				break;
				case 6:
				$resultado = $valor /1024;
				$resultado2 = $resultado / 1024;
				echo "El resultado es: ".$resultado2;;
				break;
			default:
				echo "error";
				break;
		}

	}

	function gigabytes($valor,$destino)
	{
		switch ($destino) {
			case 1:
				$resultado = $valor * 1024;
				$resultado2 = $resultado * 1024;
				$resultado3 = $resultado2 * 1024;
				$resultado4 = $resultado * 8;
				echo "El resultado es: ".$resultado4;
				break;
				case 2:
				$resultado = $valor * 1024;
				$resultado2 = $resultado * 1024;
				$resultado3 = $resultado2 * 1024;
				echo "El resultado es: ".$resultado3;
				break;
				case 3:
				$resultado = $valor * 1024;
				$resultado2 = $resultado * 1024;
				echo "El resultado es: ".$resultado2;
				case 4:
				$resultado = $valor * 1024;
				echo "El resultado es: ".$resultado;
				break;
				case 5:
				$resultado = $valor;
				echo "El resultado es: ".$resultado;
				break;
				case 6:
				$resultado = $valor /1024;
				echo "El resultado es: ".$resultado;
				break;

			default:
				echo "Error";
				break;
		}
	}

	function terabytes($valor,$destino)
	{
		switch ($destino) {
			case 1:
				$resultado = $valor * 1024;
				$resultado2 = $resultado * 1024;
				$resultado3 = $resultado2 * 1024;
				$resultado4 = $resultado3 * 1024;
				$resultado5 = $resultado4 * 8;
				echo "El resultado es: ".$resultado5;
				break;
				case 2:
				$resultado = $valor * 1024;
				$resultado2 = $resultado * 1024;
				$resultado3 = $resultado2 * 1024;
				$resultado4 = $resultado3 * 1024;
				echo "El resultado es: ".$resultado4;
				break;
				case 3:
				$resultado = $valor * 1024;
				$resultado2 = $resultado * 1024;
				$resultado3 = $resultado2 * 1024;
				echo "El resultado es: ".$resultado3;
				break;
				case 4:
				$resultado = $valor * 1024;
				$resultado2 = $resultado * 1024;
				echo "El resultado es: ".$resultado2;
				case 5:
				$resultado = $valor * 1024;
				echo "El resultado es: ".$resultado;
				case 6:
				$resultado = $valor;
				echo "El resultado es: ".$resultado;

			
			default:
				echo "Error";
				break;
		}
	}


	



 ?>