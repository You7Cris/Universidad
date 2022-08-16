package Paquete1;

import java.util.Scanner;

public class Punto14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		float []vector = new float[3];
		System.out.println("Ingrese los 3 numeros : ");
		for(int i=0; i<3;i++)
		{
			vector[i] = sc.nextFloat();
			if(vector[i]>100)
			{
				vector[i] = vector[i]+20;
			}else if(vector[i] == 100)
			{
				vector[i] = vector[i] + 1;
			}else {
				vector[i] = vector[i] - 20;
			}
		}
		for(int i=0;i<3;i++)
		{
			System.out.println(vector[i]);
		}
		sc.close();
			
	}

}
