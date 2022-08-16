package Paquete1;

import java.util.Scanner;

public class Punto20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		int n = 5;
		for(int i=1;i<=10;i++)
		{
			if(i == 10)
			{
				System.out.println(n+"*"+i+"="+(n*1)+".");
			}else {
			System.out.print(n+"*"+i+"="+(n*1)+", ");
			}
		}
		sc.close();
	}

}
