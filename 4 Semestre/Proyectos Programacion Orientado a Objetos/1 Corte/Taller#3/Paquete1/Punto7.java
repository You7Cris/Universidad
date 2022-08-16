package Paquete1;

import java.util.Scanner;



public class Punto7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		double b,c,h;
		System.out.print("Ingrese la altura del triangulo : ");
		b = sc.nextDouble();
		System.out.print("Ingrese la base del triangulo: ");
		c = sc.nextDouble();
		h = Math.sqrt(Math.pow(b,2)+Math.pow(c,2));
		System.out.println(" h = Raiz ( b ^ 2 + c ^ 2)");
		System.out.println("La longitud de la hipotenusa es : "+String.format("%.2f",h));
		sc.close();
	}

}
