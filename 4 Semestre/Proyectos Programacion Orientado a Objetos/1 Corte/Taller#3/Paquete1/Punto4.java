package Paquete1;

import java.util.Scanner;

public class Punto4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		double a,x,b,c,y;
		System.out.println("Ingrese los 3 valores para hallar y : ");
		System.out.print("A = ");
		a = sc.nextDouble();
		System.out.print("B = ");
		b = sc.nextDouble();
		System.out.print("C = ");
		c = sc.nextDouble();
		System.out.print("Ingrese el valor de x :");
		x = sc.nextDouble();
		y = (Math.pow((a*x),2)+(b*x)+c);
		System.out.println("y = ("+a+"*"+x+"^2)+("+b+"*"+x+")+("+c+")="+y);
		sc.close();
		
		
		
	}

}
