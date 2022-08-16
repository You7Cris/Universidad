package Paquete1;

import java.util.Scanner;

public class Punto21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int n,contador;
		System.out.print("Ingrese un numero : ");
		n = sc.nextInt();
		contador = n;
		if(n % 2 == 0)
		{
			System.out.println("El numero es par");
			for(int i=n;i>0;i--)
			{
				if(i % 2== 0)
				{
					contador = contador - 2;
					System.out.print(i+"- 2 = "+contador+"   ");
				}else {
					
				}
			}
		}else {
			System.out.println("El numero es impar");
			
		}
		
		sc.close();
		
	}

}
