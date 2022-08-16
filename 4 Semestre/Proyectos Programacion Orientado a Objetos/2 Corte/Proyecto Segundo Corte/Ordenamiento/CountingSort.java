package Ordenamiento;

public class CountingSort {
	
	private static final int Max_Rango = 1000000; //Variable constante, no permite cambios en su declaracion y asignacion de valor
	
	public static void CountingSort(int[] arreglo) {
		
		long Tinicial,Tfin,tiempo;
		double segundos;
		Tinicial = System.nanoTime();
		OrdenamientoCountingSort(arreglo);
		Tfin = System.nanoTime();
		tiempo = Tfin - Tinicial;
		segundos = (double) tiempo / 1000000000;
		System.out.println(" El tiempo de ejecucion es de: "+String.format("%.9f",segundos )+" segundos");
		System.out.println(" ");
		System.out.println("Presiona una tecla para ver....");
		new java.util.Scanner(System.in).nextLine();
		System.out.println(" ");
		System.out.println("Ordenamiento Counting Sort");
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
	
	
	private static void OrdenamientoCountingSort(int[] arreglo) 
	{
		int n = arreglo.length;
        if (n == 0)
        {
            return;
        }
        //encontrar valores máximos y mínimos
        int max = arreglo[0], min = arreglo[0];
        for (int i = 1; i < n; i++)
        {
            if (arreglo[i] > max)
                max = arreglo[i];
            if (arreglo[i] < min)
                min = arreglo[i];
        }
        int rango = max - min + 1;
 
        /**Comprueba si el rango es lo suficientemente pequeño para la matriz de conteo  **/
        /** de lo contrario, podría dar una excepción de memoria al asignar memoria para la matriz **/
        if (rango > Max_Rango)
        {
            System.out.println("\nError : Demasiado grande");
            return;
        }
 
        int[] count = new int[rango];
        /**Hacer una matriz de conteo / frecuencia para cada elemento. **/
        for (int i = 0; i < n; i++)
            count[arreglo[i] - min]++;
        /** Modificar el conteo para que se obtengan las posiciones en el arreglo final. **/
        for (int i = 1; i < rango; i++)
            count[i] += count[i - 1];
        /** Modifica el arreglo original **/
        int j = 0;
        for (int i = 0; i < rango; i++)
            while (j < count[i])
                arreglo[j++] = i + min;
	}
}
