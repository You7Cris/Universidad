package Paquete1;

import java.util.Scanner;

public class Punto18 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		String nombre;
		int horas,opcion,horasExtras;
		float sueldoHora,sueldototal;
		System.out.print("Ingrese su nombre: ");
		nombre = sc.nextLine();
		System.out.print("Ingrese sus horas de trabajo: ");
		horas = sc.nextInt();
		System.out.print("Ingrese su saldo por hora :");
		sueldoHora = sc.nextFloat();
		if(horas > 40)
		{
			sueldototal = (float) sueldoHora * horas;
		}else {
			do {
				System.out.println("Trabajo horas extras? 1.)Si  2.) No");
				opcion = sc.nextInt();
			}while((opcion < 1) || (opcion > 2));
			if(opcion == 1)
			{
				System.out.print("Ingrese las horas extras: ");
				horasExtras = sc.nextInt();
				sueldototal = (float) ((40 * sueldoHora)+(horasExtras * sueldoHora * 1.5));
			}else {
				horasExtras = 0;
				sueldototal = (float) ((40 * sueldoHora)+(horasExtras * sueldoHora * 1.5));
			}
			
		}
		System.out.println("El sueldo de la persona "+nombre+" es de = "+sueldototal+" $pesos");
	}
	

}
