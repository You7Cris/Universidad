package Paquete1;

import java.util.Scanner;

public class Punto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		float numero;
		System.out.println("Ingrese un numero: ");
		numero = sc.nextFloat();
		for(int i=2; i<=5; i++)
		{
			System.out.println("El "+i+" del numero "+numero+" es: "+(numero*i));
		}
		sc.close();
	}

}
