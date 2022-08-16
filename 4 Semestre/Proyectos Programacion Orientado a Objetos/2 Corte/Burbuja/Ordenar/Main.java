package Ordenar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int arreglo[] = {8,0,2,3,5,1,3,67,45,2,45,7,7,4,8,0,34,5,2,7}; //Crear Arreglo
		
		OrdenamientoBurbuja o = new OrdenamientoBurbuja();
		o.OrdenamientoBurbuja(arreglo); //Ordenar Arreglo
		
		System.out.println("Metodo Burbuja");
		
		for(int i =0; i< arreglo.length;i++)
		{
			System.out.print(arreglo[i]+"\t");
		}
		
		System.out.println();
		System.out.println("Metodo Insercion");
		
		OrdenamientoInsercion p = new OrdenamientoInsercion();
		p.OrdenamientoInsercion(arreglo);
		
		
		
		for(int i=0;i<arreglo.length;i++)
		{
			System.out.print(arreglo[i]+"\t");
		}
		
		System.out.println();
		System.out.println("Metodo Quicksort");
		
		int n = arreglo.length;
		OrdenamientoQuicksort q = new OrdenamientoQuicksort();
		q.OrdenamientoQuicksort(arreglo,0,n-1);
		
		
		
		for(int i= 0;i<arreglo.length;i++)
		{
			System.out.print(arreglo[i]+"\t");
		}
	}

}
