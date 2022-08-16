package Paquete1;

import java.util.Scanner;

public class Punto12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		double A,B,C,D,CAT,x;
		
		System.out.print("A = ");
		A =sc.nextDouble();
		System.out.print("B = ");
		B = sc.nextDouble();
		System.out.print("C = ");
		C = sc.nextDouble();
		System.out.print("D = ");
		D = sc.nextDouble();
		System.out.print("Ingrese el valor de x =");
		x = sc.nextDouble();
		if(x > 0)
		{
			CAT = (A+B)*(C+D);
		}else if(x == 0)
		{
			CAT = (A+B)/(C+D);
		}else {
			CAT = A+B-C+D;
		}
		System.out.println("El resultado es = "+CAT);
		

	}

}
