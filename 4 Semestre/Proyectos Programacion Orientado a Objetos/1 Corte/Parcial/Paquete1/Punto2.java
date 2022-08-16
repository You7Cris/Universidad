package Paquete1;

import java.util.Scanner;

public class Punto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner (System.in);
		
		double centigrados;
		System.out.println("Ingrese los grados celsius, para pasarlos a grados Fahrenheit: ");
		centigrados = sc.nextDouble();
		
		double fahrenheit = (32 + ((9 * centigrados)/5));
		System.out.println("El resultado es : "+String.format("%.2f", fahrenheit)+ " grados Fahrenreit");
		sc.close();

	}
	

}
