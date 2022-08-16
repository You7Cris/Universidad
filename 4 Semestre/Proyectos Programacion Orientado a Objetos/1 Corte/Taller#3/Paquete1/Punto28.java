package Paquete1;

import java.util.Scanner;

public class Punto28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int matriz[][] = new int[4][4];
		int sumaFilas=0, sumaColumnas=0;
		int contador = 1;
		for(int i=0;i < 4; i++)
		{
			for(int j=0; j< 4;j++)
			{
				System.out.print("Ingrese el dato "+contador+" = ");
				matriz[i][j] = sc.nextInt();
				contador += 1;
			}
		}
		//Suma de Filas
		for(int i=0;i < 4;i++)
		{
			sumaColumnas = 0;
			for(int j = 0; j<4;j++)
			{
				System.out.print(matriz[i][j]+"\t");
				sumaFilas = sumaFilas + matriz[i][j];
				sumaColumnas = sumaColumnas + matriz[j][i];
				if(j == 3)
				{
					System.out.print("Fila "+(i+1)+" = "+sumaFilas);
					sumaFilas = 0;
				}
				
			}
			System.out.println("\tColumna "+(i+1)+"="+sumaColumnas);
			System.out.print("\n");
		}
		
	}
}
