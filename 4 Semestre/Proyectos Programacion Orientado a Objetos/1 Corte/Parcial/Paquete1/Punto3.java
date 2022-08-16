package Paquete1;

import java.util.Scanner;

public class Punto3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner (System.in);
			String nombre;
			int dias,horasextras,TipoDia = 0,HorasDias;
			int TipoHora;
			double sueldoHora, sueldoMensual,valorHora,ValorAdicional;
			System.out.println("Ingrese los siguientes datos:");
			System.out.print("Nombre: ");
			nombre = sc.nextLine();
			System.out.print("Dias laborados: ");
			dias = sc.nextInt();
			System.out.print("Horas trabajadas por Dia: ");
			HorasDias = sc.nextInt();
			int HorasMensuales = HorasDias * dias;
			if(HorasMensuales>48)
			{
				
				System.out.println("El usuario trabaja mas de 48 horas");
				sc.close();
			}else {
				System.out.print("Sueldo por hora: ");
				sueldoHora = sc.nextDouble();
				sueldoMensual = sueldoHora * HorasDias * dias;
				System.out.println("Su sueldo normal es de : "+sueldoMensual);
				
				if(sueldoMensual <= 781242 )
				{
					System.out.print("Horas Extras: ");
					horasextras = sc.nextInt();
					do {
						System.out.println("Tipo de Horas Extras");
						System.out.println("1.) Diurno\t2.)Nocturno\t3.)Dominical\t4.)Festivos: ");
						System.out.print("Opcion: ");
						TipoHora = sc.nextInt();
					}while(TipoHora <0 || TipoHora > 4);
					if(TipoHora == 3 || TipoHora == 4)
					{
						do {
							System.out.println("Ingrese Tipo de dia");
							System.out.println("1.)Diurno 2.)Nocturno : ");
							TipoDia = sc.nextInt();
						}while(TipoDia <1 || TipoDia>2);
						if((TipoHora == 3 && TipoDia == 1) || (TipoHora == 4 && TipoDia == 1))
						{
							valorHora = 6510;
							ValorAdicional = valorHora + (sueldoMensual * 0.75)+(sueldoMensual * 0.25);
							System.out.println("Tendra un valor agregado de "+ValorAdicional+" por sus horas extras ");
						}else {
							valorHora = 8138;
							ValorAdicional = valorHora + (sueldoMensual * 0.75)+(sueldoMensual * 0.25);
							System.out.println("Tendra un valor agregado de "+ValorAdicional+" por sus horas extras ");
							
						}	
					}else {
						if(TipoHora == 1)
						{
							valorHora = 4069;
							ValorAdicional = valorHora + (sueldoMensual * 0.25);
							System.out.println("Tendra un valor agregado de "+ValorAdicional+" por sus horas extras "+TipoHora);
						}else {
							valorHora = 5697;
							ValorAdicional = valorHora + (sueldoMensual * 0.75);
							System.out.println("Tendra un valor agregado de "+ValorAdicional+" por sus horas extras "+TipoHora);
						}
					}
					double SaldoDefinitivo = sueldoMensual + ValorAdicional;
					System.out.println("Nombre: "+nombre);
					System.out.println("Dias laborales : "+dias);
					System.out.println("Horas Laborales : "+HorasDias);
					System.out.println("Sueldo por hora: "+sueldoHora);
					System.out.println("Tipo de Hora Extra : 1.)Diurna 2.)Nocturna 3.)Dominical 4.)Festivo :"+TipoHora);
					if(TipoHora == 3 || TipoHora == 4)
					{
						System.out.println("Tipo de dia : 1.)Diurna 2.)Nocturna :"+TipoDia);
					}
					System.out.println("Horas Extras : "+horasextras);
					System.out.println("Su saldo total es de : "+SaldoDefinitivo);
					
					
				}else {
					System.out.println("Nombre: "+nombre);
					System.out.println("Dias laborales : "+dias);
					System.out.print("Horas Laborales : "+HorasDias);
					System.out.print("No cuenta con Horas extras, su saldo mensual es de : "+sueldoMensual);
					
					
					
				}
				
				
			}
			
			
			
	}

}

