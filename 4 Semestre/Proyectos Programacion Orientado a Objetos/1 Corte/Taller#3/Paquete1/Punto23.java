package Paquete1;

import java.util.Scanner;

public class Punto23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		int n,contador = 0;
		for(int i=1;i<99999;i += 4)
		{
			if(contador == 500)
			{
				break;
			}else {
				System.out.println(i);
				contador +=1;
			}
			
		}
		sc.close();
		

	}

}
