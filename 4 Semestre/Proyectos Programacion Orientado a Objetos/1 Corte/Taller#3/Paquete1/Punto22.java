package Paquete1;

import java.util.Scanner;

public class Punto22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Altura inicial de la pelota: 10 pies (3.048 metros)");
		double Altura=10,AlFinal=0; //2/3 = 0.6666666666666667
		for(int i=0;i<40;i++) {
			Altura = ( Altura * 0.6666666666666667 );
			AlFinal+=Altura;
		}
		System.out.println("La distancia recorrida en el salto 40 es de: "+String.format("%.2f",(AlFinal+40)));	
		sc.close();

	}

}
