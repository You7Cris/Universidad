package Paquete1;

import java.util.Scanner;

public class Punto3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		double A,B,C,S,Area;
		System.out.println("Ingrese la medida de los 3 lados del triangulo: ");
		A = sc.nextFloat();
		B = sc.nextFloat();
		C = sc.nextFloat();
		S = (A+B+C)/2;
		Area =(double) Math.sqrt(S*(S-A)*(S-B)*(S-C));
		System.out.println("El area del triangulo es: "+Area);
		
	}

}
