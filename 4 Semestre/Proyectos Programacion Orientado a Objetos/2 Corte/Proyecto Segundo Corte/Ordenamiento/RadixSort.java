package Ordenamiento;

public class RadixSort {
	
	static int getMax(int[] arreglo, int n)
	{
		int mx = arreglo[0]; 
        for (int i = 1; i < n; i++) 
            if (arreglo[i] > mx) 
                mx = arreglo[i]; 
        return mx; 
	}
	
	public void RadixSort(int[] arreglo) {
		long Tinicial,Tfin,tiempo;
		double segundos;
		Tinicial = System.nanoTime();
		OrdenamientoRadixSort(arreglo);
		Tfin = System.nanoTime();
		tiempo = Tfin - Tinicial;
		segundos = (double) tiempo / 1000000000;
		System.out.println(" El tiempo de ejecucion es de: "+String.format("%.9f",segundos )+" segundos");
		System.out.println(" ");
		System.out.println("Presiona una tecla para ver....");
		new java.util.Scanner(System.in).nextLine();
		System.out.println(" ");
		System.out.println("Ordenamiento RadixSort");
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
	
	public void countSort(int arreglo[], int n, int exp) {
	    int [] output = new int[n];
	    int [] count  = new int[10];
	    int i;
	 
	    for (i = 0; i < n; i++)
	        count[(arreglo[i] / exp) % 10]++;
	 
	    for (i = 1; i < 10; i++)
	        count[i] += count[i - 1];
	 
	    for (i = n - 1; i >= 0; i--) {
	        output[count[(arreglo[i] / exp) % 10] - 1] = arreglo[i];
	        count[(arreglo[i] / exp) % 10]--;
	    }
	 
	    for (i = 0; i < n; i++)
	        arreglo[i] = output[i];
	}
	
	
	
	public void OrdenamientoRadixSort(int[] arreglo)
	{
		int n = arreglo.length;
		int m = getMax(arreglo, n);
		 
	    int exp;
	    for (exp = 1; m / exp > 0; exp *= 10)
	        countSort(arreglo, n, exp);
	}
	
	//Robado de https://www.geeksforgeeks.org/radix-sort/

}
