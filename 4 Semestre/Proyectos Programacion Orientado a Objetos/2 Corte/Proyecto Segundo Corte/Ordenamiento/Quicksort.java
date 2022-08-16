package Ordenamiento;

public class Quicksort {
	
	public static void QuickSort(int[] arreglo)
	{
		long Tinicial,Tfin,tiempo;
		double segundos;
		int n=arreglo.length;
		Tinicial = System.nanoTime();
		OrdenamientoQuicksort(arreglo,0,n-1);
		Tfin = System.nanoTime();
		tiempo = (Tfin - Tinicial);
		segundos = (double) tiempo / 1000000000;
		System.out.println(" El tiempo de ejecucion es de: "+String.format("%.9f",segundos )+" segundos");
		System.out.println(" ");
		System.out.println("Presiona una tecla para ver....");
		new java.util.Scanner(System.in).nextLine();
		System.out.println(" ");
		System.out.println("Ordenamiento QuickSort");
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
	
	
	
	private static void OrdenamientoQuicksort(int arreglo[],int limite_izq, int limite_der) {
		int temporal;
		int izq = limite_der; //empieza en cero
		int der = limite_izq; //longitud total
		int pivote = arreglo[(izq+der)/2]; //Pivote almacena el vector
		do {
			while(arreglo[izq]< pivote && izq < limite_der)izq ++;
			while(pivote<arreglo[der] && der > limite_izq)der --;
			if(izq <= der)
			{
				temporal = arreglo[izq]; //temporal almacena el vector en la posicion izquierda
				arreglo[izq] = arreglo[der];
				arreglo[der] = temporal;
				izq++;
				der--;
			}
		}while(izq<=der);
		if(limite_izq < der)
		{
			OrdenamientoQuicksort(arreglo,limite_izq,der);
		}else if(limite_der > izq)
		{
			OrdenamientoQuicksort(arreglo,izq,limite_der);
		}
	}
}
