package Paquete1;

import java.util.Scanner;

public class Punto6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		double l1,l2,area;
		System.out.println("Ingrese la longitud de los lados del cuadrado: ");
		l1 = sc.nextDouble();
		l2 = sc.nextDouble();
		area = l1 * l2;
		System.out.println("El area del triangulo es : "+area);
		sc.close();
	}
	

}
