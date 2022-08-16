package Ordenar;

public class OrdenamientoInsercion {
	
	public void OrdenamientoInsercion(int []arreglo) {
		
		int aux;//realiza cambios de posicion de elementos
		int cont1, cont2;
		
		for(cont1 = 1; cont1 < arreglo.length; cont1++)
		{
			aux  =arreglo[cont1]; //auxiliar toma el valor de la posicion actual
			
			for(cont2 = cont1-1;cont2>=0 && arreglo[cont2] > aux; cont2--)
			{
				arreglo[cont2+1] = arreglo[cont2];
				arreglo[cont2] = aux;
			}
		}
	}

}
