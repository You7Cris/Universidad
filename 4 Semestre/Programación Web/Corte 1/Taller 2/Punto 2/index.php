<?php
	$nombre1 	= $_POST["Nombre1"];
	$dias1 		= $_POST["Dias1"];
	$salario1 	= $_POST["Salario1"];
	$nombre2 	= $_POST["Nombre2"];
	$dias2 		= $_POST["Dias2"];
	$salario2 	= $_POST["Salario2"];
	$nombre3 	= $_POST["Nombre3"];
	$dias3 		= $_POST["Dias3"];
	$salario3 	= $_POST["Salario3"];
	$contador 	= 0;
	
	if($nombre1 != NULL){ $contador = $contador+1; }
	if($nombre2 != NULL){ $contador = $contador+1; }
	if($nombre3 != NULL){ $contador = $contador+1; }

	for($i = 1; $i <= $contador; $i++){
		/*Variables */
		$SueldoBasico =0;
		$Comisiones = 0;
		$Horasextras = 0;
		$RecargosN =0;
		$RecargosF = 0;
		$AuxilioTransporte =0;
		$TotalDesvengado = 0;
		$salud =0;
		$Pension = 0;
		$Arl = 0;
		$Total  =0;
		$AportesSalud = 0;
		$AportesPension = 0;
		$CreditoLibranza = 0;
		$CuotaSindicato = 0;
		$CuotaCooperativa = 0;
		$Embargo = 0;
		$TotalDeducciones = 0;
		$TotalNeto = 0;
		$Sena = 0;
		$CajasCompesancion = 0;
		$Icbf = 0 ;
		$TotalAportes = 0;
		$PriamaServicios = 0;
		$Cesantias = 0;
		$InteresCesantias = 0;
		$Vacaciones  = 0;
		$TotalPrestaciones = 0;
		$TotalApropiaciones = 0;
		$TotalNomina = 0;

//------------------------------------------------------------------------

		echo "Nombre: ".${'nombre'.$i};
		echo "<br>";
		echo "Dias: ".${'dias'.$i};
		echo "<br>";
		echo "Salario: ".${'salario'.$i};
		echo "<br>";
		

		/*Devengado*/
		echo "<br><br><b>Desvengado</b><br><br>";
		$SueldoBasico = ${'salario'.$i};
		$Comisiones = ${'salario'.$i} * 0.2;
		$Horasextras = ${'salario'.$i} * 0.15;
		$RecargosN = ${'salario'.$i} * 0.05;
		$RecargosF = ${'salario'.$i} * 0.05;
		$AuxilioTransporte = ${'salario'.$i} * 0.088;
		$TotalDesvengado = $SueldoBasico + $Comisiones + $Horasextras + $RecargosN + $RecargosF + $AuxilioTransporte;

		echo "Sueldo Basico: ".$SueldoBasico."<br>";
		echo "Comisiones: ".$Comisiones."<br>";
		echo "Horas Extras: ".$Horasextras."<br>";
		echo "Recargos Nocturnos: ".$RecargosN."<br>";
		echo "Recargos Festivos: ".$RecargosF."<br>";
		echo "Auxilio de Transporte: ".$AuxilioTransporte."<br>";
		echo "<br>Total devengado : ".$TotalDesvengado;

		/*Seguridad social*/
		echo "<br><br><b>Seguridad Social</b><br><br>";

		$salud 					= ${'salario'.$i} * 0.08;
		$Pension 				= ${'salario'.$i} * 0.12;
		$Arl		= ${'salario'.$i} * 0.00522;
		$TotalSeguridad					= $salud + $Pension + $Arl;

		echo "Salud(8%) = ".$salud."<br>";
		echo "Pension(12%) = ".$Pension."<br>";
		echo "Arl(0,522%) = ".$Arl."<br><br>";
		echo "Total = ".$TotalSeguridad."<br>";


		/*Deducciones*/
		$AportesSalud = ${'salario'.$i} * 0.058;
		$AportesPension = ${'salario'.$i} * 0.058;
		$CreditoLibranza = ${'salario'.$i} * 0.10;
		$CuotaSindicato = ${'salario'.$i} * 0.02;
		$CuotaCooperativa = ${'salario'.$i} * 0.03;
		$Embargo = ${'salario'.$i} * 0.15;
		$TotalDeducciones = $AportesSalud + $AportesPension + $CreditoLibranza + $CuotaSindicato + $CuotaCooperativa + $Embargo;
		echo "<br><b>Deducciones</b><br><br>";

		echo "Aportes de Salud = ".$AportesSalud."<br>";
		echo "Aportes de Pension = ".$AportesPension."<br>";
		echo "Credito de Libranza = ".$CreditoLibranza."<br>";
		echo "Cuota sindicato = ".$CuotaSindicato."<br>";
		echo "Cuota Cooperativa = ".$CuotaCooperativa."<br>";
		echo "Embargo Judicial = ".$Embargo."<br>";
		echo "<br>Total Deducciones = ".$TotalDeducciones."<br><br>";


		$TotalNeto = $TotalDesvengado - $TotalDeducciones;
		echo "<br><b>Neto a Pagar = </b>".$TotalNeto." <br><br>";

		/*Aportes */
		$Sena = ${'salario'.$i} * 0.02;
		$CajasCompesancion = ${'salario'.$i} * 0.04;
		$Icbf = ${'salario'.$i} * 0.03;
		$TotalAportes = $Sena + $CajasCompesancion + $Icbf;
		echo "<b>Aportes Fiscales</b><br><br>";
		echo "Sena(2%) = ".$Sena."<br>";
		echo "Cajas de Compensacion (4%) = ".$CajasCompesancion."<br>";
		echo "Icbf (3%) = ".$Icbf,"<br>";
		echo "<br>Total = ".$TotalAportes."<br><br>";

		/*Prestamos Sociales*/
		$PriamaServicios = ${'salario'.$i} * 0.128;
		$Cesantias = ${'salario'.$i} * 0.128;
		$InteresCesantias = $Cesantias * 0.12;
		$Vacaciones  = ${'salario'.$i} * 0.052;
		$TotalPrestaciones = $PriamaServicios + $Cesantias + $InteresCesantias + $Vacaciones;

		$TotalApropiaciones = $TotalSeguridad + $TotalAportes + $TotalPrestaciones;
		echo "<b>Prestaciones Sociales</b><br><br>";
		echo "Priama de servicios = ".$PriamaServicios."<br>";
		echo "Cesantias = ".$Cesantias."<br>";
		echo "Intereses sobre las cesantias = ".$InteresCesantias."<br>";
		echo "Vacaciones = ".$Vacaciones."<br>";
		echo "<br>Total = ".$TotalPrestaciones."<br><br>";

		echo "Total Apropiaciones = ".$TotalApropiaciones."<br><br>";

		$TotalNomina = $TotalNeto + $TotalApropiaciones;
		echo "<br><br><b>Total Nomina</b> = ".$TotalNomina."<br><br><br><br><br>";






	}
	
?>
