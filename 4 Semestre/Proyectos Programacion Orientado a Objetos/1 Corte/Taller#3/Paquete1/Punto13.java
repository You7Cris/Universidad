package Paquete1;

import java.util.Scanner;

public class Punto13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		double x1,x2,A,B,C;
		
		System.out.println("Ingresa lo siguientes valores: ");
		System.out.print("A: ");
		A=sc.nextFloat();
		System.out.print("B: ");
		B=sc.nextFloat();
		System.out.print("C: ");
		C=sc.nextFloat();
		double discriminante = ((Math.pow(B,2))-(4*A*C));
		System.out.println("("+B+"^2)-(4*"+A+"*"+C+")= "+discriminante);		
		if(discriminante<0) {
			System.out.println ("No hay solucion para la ecuacion");
			}else if(discriminante==0) {
				x1 = (-B)/(2*A);
				System.out.println ("La ecuacion solo tiene una solucion X1 y X2 son iguales, resultado: ["+x1+"]");
				}else if(discriminante>0){
						x2 = (-B)-Math.sqrt(discriminante)/(2*A);
						x1 = (-B)+Math.sqrt(discriminante)/(2*A);
						System.out.println ("La ecuacion tiene dos soluciones X1 ["+String.format("%.2f",x1)+"] y X2 ["+String.format("%.2f",x2)+"]");
					}
		
	}

}
