package Paquete1;

import java.util.Scanner;

public class Punto26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		double velocidad;
		int opcion = 0,contador1=0,contador2=0;
		do
		{
			System.out.print("Ingrese la velocidad del automovil : ");
			velocidad = sc.nextDouble();
			if(velocidad <= 90)
			{
				System.out.println("BIEN");
				contador1 += 1;
				opcion = 2;
			}else if(velocidad > 160) {
				opcion = 1;
				System.out.println("RAPIDO");
				contador2 += 1;
			}else {
				System.out.println("RAPIDO");
				contador2 += 1;
			}
			
		}while(opcion != 1);
		System.out.println("Vehiculos a velocidades menor o iguales a 90 = "+contador1);
		System.out.println("Vehiculos con velocidades mayores a 90 = "+contador2);
		

	}

}
