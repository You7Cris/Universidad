package Paquete1;

import java.util.Scanner;

public class Punto8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		double Altura= 1.454, gravedad = 32;
		double Resultado;
		Resultado = Math.sqrt(2*gravedad*Altura);
		System.out.println("V = Raiz(2 *"+gravedad+" * "+Altura+") = "+String.format("%.2f", Resultado)+" pies/segundos ");
		sc.close();
		
		
	}

}
