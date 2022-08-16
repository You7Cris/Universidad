package Ordenar;

public class OrdenamientoQuicksort {
	
	
	public void OrdenamientoQuicksort(int arreglo[],int limite_izq, int limite_der) {
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
