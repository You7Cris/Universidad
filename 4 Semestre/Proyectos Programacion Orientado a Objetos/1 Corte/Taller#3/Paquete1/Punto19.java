package Paquete1;

import java.util.Scanner;

public class Punto19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		double []vector = new double[10];
		double  sumaPositivos =0, sumaNegativos = 0;
		int contador =0;
		System.out.println("Ingrese 10 numeros: ");
		for(int i=0;i<10;i++)
		{
			System.out.print((i+1)+" numero : ");
			vector[i] = sc.nextDouble();
			if(vector[i] < 0)
			{
				sumaNegativos = (sumaNegativos + vector[i]);
			}else if(vector[i] == 0)
			{
				contador +=1;
			}else {
				sumaPositivos =(sumaPositivos + vector[i]);
			}
		}
		System.out.println("Suma de positivos = "+sumaPositivos);
		System.out.println("Suma de Negativos = "+sumaNegativos);
		System.out.println("Contador de ceros = "+contador);
		sc.close();
	}

}
