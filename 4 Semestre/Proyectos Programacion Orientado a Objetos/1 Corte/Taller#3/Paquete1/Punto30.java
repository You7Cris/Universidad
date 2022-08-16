package Paquete1;

import java.util.Scanner;

public class Punto30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		int matriz[][] = new int[8][8];
		System.out.println("\t\t Matriz");
		for(int i=0;i < matriz.length;i++)
		{
			for(int j=0;j < matriz.length;j ++)
			{
				if((i == j))
					{
						matriz[i][j] = 0;
						System.out.print(matriz[i][j]+" \t");
					}else if(j> i)
					{
						matriz[i][j] = 1;
						System.out.print(matriz[i][j]+" \t");
					}else {
						matriz[i][j] = 2;
						System.out.print(matriz[i][j]+" \t");
						}
			}
			System.out.print("\n");
		}

	}

}
