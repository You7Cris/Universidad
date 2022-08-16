package Paquete1;

import java.util.Scanner;

public class Punto3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		float grados;
		float fahren;
		System.out.println("Ingrese la cantidad de grados Celsius para pasarlos a grados Fahrenheit: ");
		grados = sc.nextFloat();
		fahren = 32 +((9*grados)/5);
		System.out.println("El resultado es :"+fahren+" grados fahrenheit");
		sc.close();
	}

}


