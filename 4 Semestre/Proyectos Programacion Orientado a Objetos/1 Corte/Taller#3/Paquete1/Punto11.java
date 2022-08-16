package Paquete1;

import java.util.Scanner;

public class Punto11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int A,B,C,D;
		double Division1,Division2;
		System.out.print("A = ");
		A = sc.nextInt();
		System.out.print("B = ");
		B = sc.nextInt();
		System.out.print("C = ");
		C = sc.nextInt();
		System.out.print("D = ");
		D = sc.nextInt();
		Division1 = (double) A/B;
		Division2 = (double) C/D;
		if((B == 0) || (D == 0))
		{
			System.out.println("Indefinido");
		}else if(Division1 == Division2)
		{
			System.out.println(Division1+" = "+Division2);
			System.out.println("SI");
		}else {
			System.out.println(Division1+" /= "+Division2);
			System.out.println("NO");
		}
		
	}

}
