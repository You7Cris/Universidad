<?php
	
	echo "<center> <strong> TALLER No.1 </strong> </center> <br><br>";
	echo "<br><br> <strong> Carlos Andres Arroyave Ladino <br>";
	echo "Cristian Steven Gonzalez Arango </strong> <br> <br>";
	/*Punto 1. IF*/
	echo "Punto 1. IF <br> <br>";

	/*Punto a.*/
	echo "a.)";
	$primero_a1 = -3;
	$primero_a2 = 2;
	if($primero_a1 < 0)
	{
		echo "El numero ".$primero_a1." es negativo.";
	}else{
		echo "El numero ".$primero_a1." es positivo.";
	}
	echo "<br>";
	if($primero_a2 < 0)
	{
		echo "El numero ".$primero_a2." es negativo.";
	}else{
		echo "El numero ".$primero_a2." es positivo.";
	}

	/*Punto b*/
	echo "<br> <br>";
	echo "b.)";
	$primero_b1 = 13;
	$primero_b2 = 15;
	$contador_b = 0;
	for($i = 1 ; $i <= $primero_b1; $i ++)
	{
		if($primero_b1 % $i == 0)
		{
			$contador_b += 1;
		}
	}

	if($contador_b == 2)
	{
		echo "El numero ".$primero_b1." es primo.";
	}else{

		echo "El numero ".$primero_b1." no es primo.";
	}
	echo "<br>";
	$contador_b = 0;
	for($i = 1 ; $i <= $primero_b2; $i ++)
	{
		if($primero_b2 % $i == 0)
		{
			$contador_b += 1;
		}
	}

	if($contador_b == 2)
	{
		echo "El numero ".$primero_b2." es primo.";
	}else{

		echo "El numero ".$primero_b2." no es primo.";
	}

	/*Punto c*/
	echo "<br> <br> c.)";
	$primero_c1 = 68;
	$primero_c2 = 101;
	if($primero_c1 >= 0 && $primero_c1 < 100)
	{
		echo "El numero ".$primero_c1." es positivo menor de 100.";
	}else if($primero_c1 >= 0 && $primero_c1 > 100){
		echo "El numero ".$primero_c1." es positivo mayor o igual a 100.";
	}else{
		echo "El numero ".$primero_c1." es negativo";
	}
	echo "<br>";

	if($primero_c2 >= 0 && $primero_c2 < 100)
	{
		echo "El numero ".$primero_c2." es positivo menor de 100.";
	}else if($primero_c2 >= 0 && $primero_c2 > 100){
		echo "El numero ".$primero_c2." es positivo mayor o igual a 100.";
	}else{
		echo "El numero ".$primero_c2." es negativo";
	}

	/*Punto d*/
	echo "<br> <br>";
	$primero_d1 = -1;
	$primero_d2 = 20;
	$primero_d3 = 28;
	echo "d.)";
	if($primero_d1 >= -3 && $primero_d1 <= 27)
	{
		echo "El numero ".$primero_d1." esta en el intervalo [-3,27]";
	}else{
		echo "El numero ".$primero_d1." no esta en el intervalo [-3,27]";
	}
	echo "<br>";

	if($primero_d2 >= -3 && $primero_d2 <= 27)
	{
		echo "El numero ".$primero_d2." esta en el intervalo [-3,27]";
	}else{
		echo "El numero ".$primero_d2." no esta en el intervalo [-3,27]";
	}
	echo "<br>";

	if($primero_d3 >= -3 && $primero_d3 <= 27)
	{
		echo "El numero ".$primero_d3."  esta en el intervalo [-3,27]";
	}else{
		echo "El numero ".$primero_d3." no esta en el intervalo [-3,27]";
	}

	/*Punto e*/
	echo "<br> <br>";
	$e2 = 3;
	$e3 = 6;
	echo "e.)";

	if($e2 % 2 == 0 )
	{
		echo "El numero ".$e2." es par";
	}else{
		echo "El numero ".$e2." es impar";
	}
	echo "<br>";

	if($e3 % 2 == 0 )
	{
		echo "El numero ".$e3." es par";
	}else{
		echo "El numero ".$e3." es impar";
	}

	/*Punto f*/
	echo "<br> <br>";
	$f1 = 4;
	$f2= 3;
	$f3 = 0;
	$f4 = 0;
	echo "f.)";

	if($f1 % 2 == 0)
	{
		$f3 = $f1 * $f1;      /*Pow= Funcion para Potencia*/
		echo "El numero ".$f1." elevado al cuadrado da ".$f3;
	}else{
		$f4 = $f1 * $f1 * $f1;
		echo "El numero ".$f1." elevado al cubo da ".$f4;
	}
	echo "<br>";
	$f3 = 0;
	$f4 = 0;
	if($f2 % 2 == 0)
	{
		$f3 = $f2 * $f2;
		echo "El numero ".$f2." elevado al cuadrado da ".$f3;
	}else{
		$f4 = $f2 * $f2 * $f2;
		echo "El numero ".$f2." elevado al cubo da ".$f4;
	}

	/*Punto g*/
	echo "<br> <br>";
	echo "g.)";
	$g1 = 5;
	$g2 = 3;
	$g3 = 8;
	echo "De los numeros $g1,$g2,$g3 <br>";
	if($g1 > $g2 && $g1 > $g3)
	{
		echo "El mayor es ".$g1;
	}else if($g2 > $g1 && $g2 > $g3)
	{
		echo "El mayor es ".$g2;
	}else{
		echo "El mayor es ".$g3;
	}

	/*Punto h*/
	echo "<br> <br>";
	echo "h.)";
	$h1 = 5;
	$h2 = 2;
	$h3 = 9;
	$menor = 0;
	$medio = 0;
	$mayor = 0;
	if(($h1 <= $h2) & ($h1 <= $h3))
	{
		$menor = $h1;
		if($h2 <= $h3)
		{
			$medio = $h2;
			$mayor = $h3;
		}else{
			$medio = $h3;
			$mayor = $h2;
		}
	}else if(($h2 <= $h1) & ($h2 < $h3))
	{
		$menor = $h2;
		if($h1 <= $h3)
		{
			$medio = $h1;
			$mayor = $h3;
		}else{
			$medio = $h3;
			$mayor = $h1;
		}
	}else{
		$menor = $h3;
		if($h1 <= $h2)
		{
			$medio = $h1;
			$mayor = $h2;
		}else{
			$medio = $h2;
			$mayor = $h1;
		}
	}
	echo "$mayor <br> $medio <br> $menor";

	/*Punto i*/
	echo "<br><br>i.)";
	$largo = 0;
	$i_1 = "Cristian";
	$i_2 = "Sara";
	$contador = 0;
	/*while(($i_1) != NULL)
	{
		$contador = $contador + 1;
	}
	if($contador > 5)
	{
		echo "El nombre ".$i_1." es un Nombre largo";
	}else{
		echo "El nombre ".$i_1." es un Nombre corto";
	}
	*/
	if(strlen($i_1) > 5)  /* strlen = Obtiene el numero de ccaracteres de la cadena*/
	{
		echo "$i_1 es un Nombre Largo";
	}else{
		echo "$i_1 es un Nombre Corto";
	}
	echo "<br>";

	if(strlen($i_2) > 5)
	{
		echo "$i_2 es un Nombre Largo";
	}else{
		echo "$i_2 es un Nombre Corto";
	}
	

	/*---------------------------------------------------------------------*/

	/*PUNTO 2. WHILE */
	echo "<br> <br> Punto 2. WHILE";

	/*Punto a*/
	echo "<br> <br> a.)";
	$P2_a = 1;
	while($P2_a != 101)
	{
		echo "$P2_a, ";
		$P2_a += 1;
	}

	/*Punto b*/
	echo "<br> <br> b.)";
	$P2_b = 1;
	$P2_b1 = 0;
	while($P2_b != 101)
	{
		$P2_b1 = $P2_b1 + $P2_b;
		$P2_b += 1;
	}
	echo "La suma de los numeros del 1 al 100 = ".$P2_b1;

	/*Punto c*/
	echo "<br> <br> c.)";
	$P2_c = 1;
	$P2_c1 = 0;
	while ($P2_c != 51) 
	{
		if($P2_c % 2 == 0)
		{
			$P2_c1 = $P2_c + $P2_c1 ;
		}
		$P2_c += 1;
	}
	echo "La suma de los numeros pares del 1 al 50 = ".$P2_c1;

	/*Punto d*/
	echo "<br> <br>d.)";
	$P2_d = 1;
	$P2_d1 = 0;
	while ($P2_d != 51) 
	{
		if($P2_d % 2 == 0)
		{
			
		}else{
			$P2_d1 = $P2_d + $P2_d1 ;
		}
		$P2_d += 1;
	}
	echo "La suma de los numeros impares del 1 al 50 = ".$P2_d1;

	/*Punto e*/
	echo "<br> <br>e.)";
	$P2_e = 8;
	$P2_e1 = 1;
	$P2_ec = 0;
	while($P2_e !=0)
	{
		$P2_e1 = $P2_e * $P2_e1 ;
		$P2_e -= 1;
		$P2_ec += 1;
	}
	echo "El factorial de $P2_ec es = ".$P2_e1;

	/*Punto f*/
	echo "<br> <br>f.)";
	$P2_f = 0;
	$P2_f1 = 0;
	$P2_f2 = 1;
	$P2_f3 = 1;
	while ($P2_f3 <= 14) {
		$P2_f = $P2_f1 + $P2_f2 ; 
		$P2_f1 = $P2_f2 ;
		$P2_f2 = $P2_f ;
		$P2_f3 += 1;
	}
	echo "Espiral de Fibonnaci hasta la Posicion 14 = ".$P2_f;

	/*-----------------------------------------------------------------*/

	/*PUNTO 3. FOR*/
	echo "<br> <br> Punto 3. FOR";

	/*Punto a*/
	echo "<br> <br>a.)";
	$sumatoria_a = 0;
	for($i = 1; $i <= 10; $i++)
	{
		$sumatoria_a = ($i * $i) + $sumatoria_a;
	}
	echo "La sumatoria de los cuadrados de los 10 primeros numeros = ".$sumatoria_a;

	/*Punto b*/
	echo "<br> <br>b.)";
	$promedio = 0;
	$num =0;
	$temp1=17;
	$temp2=36;
	$temp3=12;
	$temp4=35;
	$temp5=15;
	$temp6=28;
	$cont=0;
	$acum=0;
	$media=0;
	$mayor=0;
	$menor=0;
	 
	for ($num=1;$num<=24;$num++){
	    
	    if($num==4){
	        echo 'La temperatura de las 4 a.m es '.$temp1.'<br>';
	        $cont+=$temp1;
	        $acum=$temp1;
	    }elseif($num==8){
	        echo 'La temperatura a las 8 a.m es '.$temp2.'<br>';
	        $cont+=$temp2;
	        $acum=$temp2;
	    }elseif($num==12){
	        echo 'La temperatura a las 12 p.m es '.$temp3.'<br>';
	        $cont+=$temp3;
	        $acum=$temp3;
	    }elseif($num==16){
	        echo 'La temperatura a las 16 p.m es '.$temp4.'<br>';
	        $cont+=$temp4;
	        $acum=$temp4;
	    }elseif($num==20){
	        echo 'La temperatura a las 20 p.m es '.$temp5.'<br>';
	        $cont+=$temp5;
	        $acum=$temp5;
	    }elseif($num==24){
	        echo 'La temperatura a las 24 a.m es '.$temp6.'<br>';
	        $cont+=$temp6;
	        $acum=$temp6;
	    }
	    
	}
	    /*SELECCION DE LA TEMPERATURA MAYOR*/
	if(($temp1>$temp2)){
	    if($temp1>$temp3){
	        if($temp1>$temp4){
	            if($temp1>$temp5){
	                if($temp1>$temp6){
	                    $mayor=$temp1;
	                }else{
	                    $mayor=$temp6;
	                }
	            }
	        }
	    }
	}else if(($temp2 >$temp3)){
	    if($temp2>$temp4){
	        if($temp2 >$temp5){
	            if($temp2>$temp6){
	                $mayor=$temp2;
	            }else{
	                $mayor=$temp6;
	            }
	        }
	    }
	}else if(($temp3 > $temp4)){
	    if($temp3 > $temp5){
	        if($temp3>$temp6){
	            $mayor=$temp3;
	        }else{
	            $mayor=$temp6;
	        }
	    }
	}else if(($temp4>$temp5)){
	    if($temp4>$temp6){
	        $mayor=$temp4;
	    }else{
	        $mayor=$temp6;
	    }
	}else if(($temp5>$temp6)){
	    $mayor=$temp5;
	}else{
	    $mayor=$temp6;
	}
	/*FIN DEL MAYOR*/
	 
	//SELECCION DE LA TEMPERATURA MENOR
	if(($temp1 <= $temp2) & ($temp1 <= $temp3) & ($temp1 <= $temp4) & ($temp1 <= $temp5) & ($temp1 <= $temp6)){
		$menor = $temp1;
	}else if(( $temp2 <= $temp3) & ($temp2 <= $temp4) & ($temp2 <= $temp5) & ($temp2 <= $temp6))
	{
		$menor= $temp2;
	}else if(($temp3 <= $temp4) & ($temp3 <= $temp5) & ($temp3 <= $temp6))
	{
		$menor = $temp3;
	}else if(($temp4 <= $temp5) & ($temp4 <= $temp6))
	{
		$menor = $temp4;
	}else if(($temp5 <= $temp6))
	{
		$menor = $temp5;
	}else{
		$menor = $temp6;
	}
	 
	$media=$cont/6;
	echo '<br> <br>La temperatura media es :'.$media;
	echo '<br> La temperatura mayor es :'.$mayor;
	echo '<br> La temperatura menor es :'.$menor;


	/*Punto c*/
	echo "<br> <br>c.)";
	$P3_c1 = 1;
	$P3_suma = 0;
	for($i = 1; $i <= 10 ; $i++)
	{
		$P3_suma= $i + $P3_suma;
	}
	echo "La suma de los primeros 10 = ".$P3_suma;

	/*Punto d*/
	echo "<br> <br>d.)";
	$num=8;
	$a=0;
	$potencia = 1;
	for($i = 1; $i <= $num ; $i++)
	{
		echo "2^$i";
		if($i != $num)
		{
			echo "+ ";
		}
		for($j = 1; $j <= 1; $j ++)
		{
			$potencia *= 2;
		}
		$a += $potencia;
		if($i == $num)
		{
			echo "=" ;
		}
	}
	echo $a;

	/*Punto e*/
	echo "<br> <br>e.)";
	$P3_e = 8;
	$suma_positiva = 0;
	$neg = 0;
	$suma_neg = 0;
	$suma = 0;
	for($i = 0; $i < $P3_e ; $i ++ )
	{
		$i = $i+1;
		$suma_positiva = $suma_positiva + 1;
	}
	for($j = 1; $j < $P3_e ; $j ++)
	{
		$j = $j + 1;
		$neg = $j * (-1);
		$suma_neg = $suma_neg + $neg;
	}
	$suma = $suma_positiva + $suma_neg;
	echo "Numero de Elementos 8, la suma da = ".$suma;


	/*---------------------------------------------------------------*/

	/*PUNTO 4. SWITCH*/
	echo "<br> <br> Punto 4. SWITCH";

	/*Punto a*/
	echo "<br> <br>a.)";
	//$vocal1= 'e';
	$vocal1= 'I';
	//$vocal1=2;
	 
	switch($vocal1){
	    case 'a':
	    echo 'La vocal "'.$vocal1.'" es una minuscula';
	    break;
	    case 'e':
	    echo 'La vocal "'.$vocal1.'" es una minuscula';
	    break;
	    case 'i':
	    echo 'La vocal "'.$vocal1.'" es una minuscula';
	    break;
	    case 'o':
	    echo 'La vocal "'.$vocal1.'" es una minuscula';
	    break;
	    case 'u':
	    echo 'La vocal "'.$vocal1.'" es una minuscula';
	    break;
	    case 'A':
	    echo 'La vocal "'.$vocal1.'" es una mayuscula';
	    break;
	    case 'E':
	    echo 'La vocal "'.$vocal1.'" es una mayuscula';
	    break;
	    case 'I':
	    echo 'La vocal "'.$vocal1.'" es una mayuscula';
	    break;
	    case 'O':
	    echo 'La vocal "'.$vocal1.'" es una mayuscula';
	    break;
	    case 'U':
	    echo 'La vocal "'.$vocal1.'" es una mayuscula';
	    break;
	    default:
	    echo 'El dato que ingreso, no es una vocal';
	    break;
	}

	/*Punto b*/
	echo "<br> <br>b.)";
	$mes=8;
 
	switch($mes){
	    case 1:
	    echo 'Enero';
	    break;
	    case 2:
	    echo 'Febrero';
	    break;
	    case 3:
	    echo 'Marzo';
	    break;
	    case 4:
	    echo 'Abril';
	    break;
	    case 5:
	    echo 'Mayo';
	    break;
	    case 6:
	    echo 'Junio';
	    break;
	    case 7:
	    echo 'Julio';
	    break;
	    case 8:
	    echo 'Agosto';
	    break;
	    case 9:
	    echo 'Septiembre';
	    break;
	    case 10:
	    echo 'Octubre';
	    break;
	    case 11:
	    echo 'Noviembre';
	    break;
	    case 12:
	    echo 'Diciembre';
	    break;
	}

	/*Punto c*/
	echo "<br> <br>c.)";
	$num=500;
	$entero=0;
	$res=0;
	 
	$entero = $num/100; 
	$res = $num%100; 
	switch( $entero ) 
	{ 
	case 1: printf( "C" ); break; 
	case 2: printf( "CC" ); break; 
	case 3: printf( "CCC" ); break; 
	case 4: printf( "CD" ); break; 
	case 5: printf( "D" ); break; 
	case 6: printf( "DC" ); break; 
	case 7: printf( "DCC" ); break; 
	case 8: printf( "DCCC" ); break; 
	case 9: printf( "CM" ); break; 
	} 
	 
	$entero = $res/10; 
	$res=$res%10; 
	switch( $entero ) 
	{ 
	case 1: printf( "X" ); break; 
	case 2: printf( "XX" ); break; 
	case 3: printf( "XXX" ); break; 
	case 4: printf( "XL" ); break; 
	case 5: printf( "L" ); break; 
	case 6: printf( "LX" ); break; 
	case 7: printf( "LXX" ); break; 
	case 8: printf( "LXXX" ); break; 
	case 9: printf( "XC" ); break; 
	} 
	 
	switch( $res ) 
	{ 
	case 1: printf( "I" ); break; 
	case 2: printf( "II" ); break; 
	case 3: printf( "III" ); break; 
	case 4: printf( "IV" ); break; 
	case 5: printf( "V" ); break; 
	case 6: printf( "VI" ); break; 
	case 7: printf( "VII" ); break; 
	case 8: printf( "VIII" ); break; 
	case 9: printf( "IX" ); break; 
	} 

	/*Punto d*/
	echo "<br> <br>d.)";
	$saldo=1000000;
	$num=3;
	$opc=3;
	 
	echo '  BIENVENIDO AL CAJERO AUTOMATICO <br><br>';
	echo '1.)Ver Saldo.<br>';
	echo '2.)Retirar dinero.<br>';
	echo '3.)Consignar dinero.<br>';
	echo 'Escoja opcion.<br><br>';
	switch($num){
	    case 1:
	    echo 'El saldo en su cuenta es de '.$saldo;
	    break;
	    case 2:
	    echo 'Cuanto dinero desea retirar :<br><br>';
	    echo '1.)700.000 -------------2.)500.000<br>';
	    echo '3.)300.000--------------4.)200.000<br>';
	    echo '5.)100.000--------------6.)80.000<br><br>';
	    switch($opc){
	        case 1:
	        echo 'Usted decidio retirar 700.000<br>';
	        $saldo=$saldo-700000;
	        break;
	        case 2:
	        echo 'Usted decidio retirar 500.000<br>';
	        $saldo=$saldo-500000;
	        break;
	        case 3:
	        echo 'Usted decidio retirar 300.000<br>';
	        $saldo=$saldo-300000;
	        break;
	        case 4:
	        echo 'Usted decidio retirar 200.000<br>';
	        $saldo=$saldo-200000;
	        break;
	        case 5:
	        echo 'Usted decidio retirar 100.000<br>';
	        $saldo=$saldo-100000;
	        break;
	        case 6:
	        echo 'Usted decidio retirar 80.000<br>';
	        $saldo=$saldo-80000;
	        break;
	    }
	    break;
	    case 3:
	    echo 'Cuanto dinero desea consignar :<br><br>';
	    echo '1.)700.000 -------------2.)500.000<br>';
	    echo '3.)300.000--------------4.)200.000<br>';
	    echo '5.)100.000--------------6.)80.000<br><br>';
	    switch($opc){
	        case 1:
	        echo 'Usted decidio consignar 700.000<br>';
	        $saldo=$saldo+700000;
	        break;
	        case 2:
	        echo 'Usted decidio consignar 500.000<br>';
	        $saldo=$saldo+500000;
	        break;
	        case 3:
	        echo 'Usted decidio consignar 300.000<br>';
	        $saldo=$saldo+300000;
	        break;
	        case 4:
	        echo 'Usted decidio consignar 200.000<br>';
	        $saldo=$saldo+200000;
	        break;
	        case 5:
	        echo 'Usted decidio consignar 100.000<br>';
	        $saldo=$saldo+100000;
	        break;
	        case 6:
	        echo 'Usted decidio consignar 80.000<br>';
	        $saldo=$saldo+80000;
	        break;
	    }
	    break;
	}
	echo '<br><br> Su saldo final es de '.$saldo; 

	/*FIN*/

?>