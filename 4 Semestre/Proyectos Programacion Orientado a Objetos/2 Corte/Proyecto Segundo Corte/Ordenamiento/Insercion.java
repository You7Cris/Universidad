package Ordenamiento;

import java.util.Random;

import Ordenamiento.Main;

public class Insercion {
	
	public void Insercion(int[] arreglo) {
		
		OrdenamientoInsercion(arreglo);
		System.out.println(" ");
		System.out.println("Ordenamiento Insercion");
		System.out.println(" ");
		System.out.println("Ordenando Valores....");
		int contador = 1;
		
		for(int i=0;i<arreglo.length;i++)
		{
			System.out.print(arreglo[i]+"\t");
			if(contador%18 == 0)
			{
				System.out.println(" ");
			}else {
				
			}
			contador++;
		}
		
		System.out.println(" ");
		System.out.println("Presiona una tecla para volver al menu...");
		new java.util.Scanner(System.in).nextLine();
		
	}
	
	public void OrdenamientoInsercion(int[] arreglo) {
		
		int aux;
		int cont1,cont2;
		double segundos;
		long Tinicio,Tfin,tiempo;
		Tinicio = System.nanoTime();
		for(cont1 = 1;cont1 < arreglo.length;cont1++)
		{
			aux = arreglo[cont1];
			
			for(cont2 = cont1-1;cont2 >=0 && arreglo[cont2] > aux;cont2--)
			{
				arreglo[cont2+1] = arreglo[cont2];
				arreglo[cont2] = aux;
			}
		}
		Tfin = System.nanoTime();
		tiempo = (Tfin - Tinicio);
		segundos = (double) tiempo / 1000000000;
		System.out.println(" El tiempo de ejecucion es de: "+String.format("%.9f",segundos )+" segundos");
		System.out.println(" ");
		System.out.println("Presiona una tecla para ver....");
		new java.util.Scanner(System.in).nextLine();
	}

}
