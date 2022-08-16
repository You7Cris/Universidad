package Pelota;

import Pelota.Pelota;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pelota p = new Pelota(300,600);//Instanciar la clase;
		System.out.println("El peso de la pelota es "+p.ObtenerPeso());
		System.out.println("El radio de la pelota es "+p.ObtenerRadio());
		p.AtraparPelota();
		p.PatearPelota();
	}

}
