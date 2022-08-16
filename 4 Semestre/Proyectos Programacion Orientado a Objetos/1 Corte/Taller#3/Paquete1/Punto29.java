package Paquete1;

import java.util.Scanner;

public class Punto29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int matriz[][]= new int[2][2];
		int matriz2[][] = new int[2][2];
		int suma[][] = new int[2][2];
		int resta[][] = new int[2][2];
		
		System.out.println("MATRIZ 1\t \tMATRIZ 2\t \t SUMA \t \t \t RESTA");
		for(int i=0;i< matriz.length;i++)
		{
			for(int j=0;j< matriz.length;j ++)
			{
				matriz[i][j] = (int)Math.floor(Math.random()*100+1);
				System.out.print(matriz[i][j]+"\t");
				if(j == (matriz.length-1))
				{
					System.out.print("\t");
					for(j=0;j<matriz2.length;j++)
					{
						matriz2[i][j] = (int)Math.floor(Math.random()*100+1);
						System.out.print(matriz2[i][j]+"\t");
						if(j == (matriz2.length-1))
						{
							System.out.print("\t");
							for(j= 0; j< matriz.length;j++)
							{
								suma[i][j] = matriz[i][j] + matriz2[i][j];
								System.out.print(suma[i][j]+"\t");
								if(j == (matriz.length-1))
								{
									System.out.print("\t");
									for(j=0;j < matriz.length; j++)
									{
										resta[i][j] = matriz[i][j] - matriz2[i][j];
										System.out.print(resta[i][j]+"\t");
									}
									
								}
							}
						}
					}
					
					
				}
				
			}
			System.out.print("\n");
		}
		
	}
}