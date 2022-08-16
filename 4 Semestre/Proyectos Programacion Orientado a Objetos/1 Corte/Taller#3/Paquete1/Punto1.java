package Paquete1;

import java.util.Scanner;

public class Punto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int numero;
		
		System.out.print("Ingrese un numero: ");
		numero = sc.nextInt();
		
		for(int i=2; i<=3;i++)
		{
			System.out.println("El numero "+numero+" elevado a la "+i+" = "+(numero*i));
		}
		
		sc.close();

	}

}
