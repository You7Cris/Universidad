package Paquete1;

import java.util.Scanner;

public class Punto15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		float []vector = new float[3];
		float mayor=0, menor=99999;
		System.out.println("Ingrese 3 numeros :");
		for(int i=0;i<3;i++)
		{
			vector[i] = sc.nextFloat();
			if(vector[i] < menor)
			{
				menor = vector[i];
			}else if(vector[i] > mayor)
			{
				mayor = vector[i];
			}else {
				
			}
		}
		System.out.println("El numero mayor es "+mayor);
		System.out.println("El numero menor es "+menor);
		sc.close();
	}

}
