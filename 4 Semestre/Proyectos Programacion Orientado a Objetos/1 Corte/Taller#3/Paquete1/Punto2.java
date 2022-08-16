package Paquete1;


import java.util.Scanner;

public class Punto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		float R,A,B,C,D;
		System.out.println("Ingrese los valores en orden, A,B,C y D");
		System.out.println("Para solucionar esta ecuacion R = (A+B/D)*D");
		System.out.print("A: ");
		A = sc.nextFloat();
		System.out.print("B: ");
		B =sc.nextFloat();
		System.out.print("C: ");
		C = sc.nextFloat();
		System.out.print("D: ");
		D = sc.nextFloat();
		R = ((A+B)/C)*D;
		System.out.println("El resultado es : "+R);
		sc.close();
		
		
	}

}
