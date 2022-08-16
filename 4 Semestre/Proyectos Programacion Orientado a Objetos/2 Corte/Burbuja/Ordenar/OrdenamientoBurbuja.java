package Ordenar;

public class OrdenamientoBurbuja {
	
	public void OrdenamientoBurbuja(int []array) {
		
		int aux;
		boolean cambiar=false;
		
		while(true) {//mienstras se cumpla la condicion 
			cambiar = false; //al reiniciar el ciclo debe quedar falso
			
			for(int i=1;i<array.length;i++) //
			{
				if(array[i] < array[i-1])
				{
					aux = array[i];
					array[i] = array[i-1];
					array[i-1] = aux;
					cambiar = true;
				}
			}
			if(cambiar == false)//si el arreglo se encuentra ordenado, terminar ejecucion
			{
				break;
			}
		}
	}

}
