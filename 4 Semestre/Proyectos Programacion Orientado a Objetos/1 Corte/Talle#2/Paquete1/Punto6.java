package Paquete1;

public class Punto6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Suma= 0;
		int SumaPares = 0;
		int SumaImpares = 0;
		int contador = 1;
		while(contador != 101)
		{
			Suma = Suma + contador;
			if(contador<=50)
			{
				if(contador % 2 == 0)
				{
					SumaPares = SumaPares + contador;
				}else
				{
					SumaImpares = SumaImpares + contador;
				}
				
			}
			contador += 1;
			
		}
		System.out.println("La suma de los numeros del 1 al 100 = "+Suma);
		System.out.println("La suma de los pares del 1 al 50 es = "+SumaPares);
		System.out.println("La suma de los impares del 1 al 50 es = "+SumaImpares);
	}

}

