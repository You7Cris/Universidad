package Paquete1;

import java.util.Scanner;


public class Punto9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int segundos,dias,minutos;
		double horas;
		do {
			System.out.print("Ingrese las horas : ");
			horas  = sc.nextDouble();
		}while(horas<1);
		dias = (int) (1*horas)/24;
		minutos =(int)((3600*horas)/60);
		segundos = (int)(horas * 3600)+(minutos*60);
		System.out.println("Dias = "+dias);
		System.out.println("Minutos = "+minutos);
		System.out.println("Segundos = "+segundos);
		
		
		
		
	}

}
