package Paquete1;

import java.util.Scanner;

public class Punto27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int []vector = new int[5];
		int suma = 0;
		for(int i=0;i < 5;i++)
		{
			System.out.print("Ingrese el "+(i+1)+" numero: ");
			vector[i] = sc.nextInt();
			suma = suma + vector[i];
		}
		System.out.println("La suma de los vectores = "+suma);
		suma = 0;
		for(int i=0; i < 5; i++)
		{
			suma = suma + vector[i];
			System.out.print(vector[i]+ " + ");
			if(i == 4)
			{
				System.out.println(" = "+suma);
			}else {
				//System.out.print(vector[i]+" + ");
			}
			
		}
		sc.close();
	}

}
