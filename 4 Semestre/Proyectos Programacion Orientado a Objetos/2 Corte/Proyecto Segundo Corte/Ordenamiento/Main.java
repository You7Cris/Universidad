package Ordenamiento;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int opcion1,opcion2,n=0;
		
		do {
			System.out.println("\t************************************");
			System.out.println("\t*     METODOS DE ORDENAMIENTO      *");
			System.out.println("\t************************************");
			System.out.println("\t*   1. Insercion  *  2. Mezcla     *");
			System.out.println("\t*   3. Heap Sort  *  4. Quicksort  *");
			System.out.println("\t*5. Counting Sort *  6. Radix Sort *");
			System.out.println("\t*   7. Salir      *                *");
			System.out.println("\t************************************");
			System.out.print("Opcion: ");
			opcion1 = sc.nextInt();
		}while(opcion1<1 || opcion1>7);
		if(opcion1 == 7)
		{
			System.out.println(" ");
			System.out.println("Hasta la proxima!!!");
			System.exit(0);
		}
		System.out.println(" ");
		System.out.println("Ingrese la opcion para generar los datos...");
		System.out.println(" ");
		do {
			System.out.println("\t************************************");
			System.out.println("\t*           GENERAR DATOS          *");
			System.out.println("\t************************************");
			System.out.println("\t*   1. 100 Datos  *  2. 200 Datos  *");
			System.out.println("\t*   3. 500 Datos  *  4. 1000 Datos *");
			System.out.println("\t*   5. 1500 Datos *  6. Volver     *");
			System.out.println("\t************************************");
			System.out.print("Opcion: ");
			opcion2 = sc.nextInt();
		}while(opcion2<1 || opcion2>6);
		if(opcion2 == 1)
		{
			n=100;
		}else if(opcion2 == 2)
		{
			n=200;
		}else if(opcion2 == 3)
		{
			n=500;
		}else if(opcion2== 4)
		{
			n=1000;
		}else if(opcion2 == 5)
		{
			n=1500;
		}else {
			for(int i=0;i<20;i++)
			{
				System.out.println(" ");
			}
			main(args);
		}
		
		//Generar numeros
		
		int arreglo[] = new int[n];
		int contador = 1;
		
		System.out.println("Generando Numeros...");
		System.out.println(" ");
		
		//Generar numeros aleatorios
		for(int i=0;i<n;i++)
		{
			int numeroAleatorio = (int) (Math.random()*99+1);
			arreglo[i] =numeroAleatorio;
			System.out.print(arreglo[i]+"\t");
			if(contador%18 == 0)
			{
				System.out.println(" ");
			}else {
				
			}
			contador++;
		}
		System.out.println(" ");
		System.out.println("Presiona una tecla para empezar a Ordenar los datos.....");
		new java.util.Scanner(System.in).nextLine();
		
		// Selecion de metodo de ordenamiento
		switch(opcion1)
		{
		case 1:
			Insercion i = new Insercion();
			i.Insercion(arreglo);
			Refrescar();
			main(args);
			break;
		case 2:
			Mezcla m = new Mezcla();
			m.Mezcla(arreglo);
			Refrescar();
			main(args);
			break;
		case 3:
			HeapSort h = new HeapSort();
			h.HeapSort(arreglo);
			Refrescar();
			main(args);
			
			break;
		case 4:
			Quicksort q = new Quicksort();
			q.QuickSort(arreglo);
			Refrescar();
			main(args);
			break;
		case 5:
			CountingSort c = new CountingSort();
			c.CountingSort(arreglo);
			Refrescar();
			main(args);
			break;
		case 6:
			RadixSort r = new RadixSort();
			r.RadixSort(arreglo);
			Refrescar();
			main(args);
			break;
		}
		

	}
	
	public static void Refrescar() {
		for(int i=0;i<20;i++)
		{
			System.out.println(" ");
		}
	}

}
