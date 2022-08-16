<?php 

	$tamaño = $_POST["tamaño"];
	$n1 = 1;
	$n2 = 0;
	echo "<center>Espiral de Fibonnaci</center><br><br>";
	fibonnaci($n1,$n2,$tamaño);


	function fibonnaci($n1,$n2,$tamaño){
		for($i=0;$i<=$tamaño-1;$i++)
		{
			$suma = $n1+$n2;
			$n1 = $n2;
			$n2 = $suma;
			echo $suma." ";
		}
	}
	
 ?>