package Pelota;

public class Pelota {
	
	//atributos
	float radio;
	float peso;
	
	//Constructor
	public Pelota() {
		radio = 100;
		peso = 250;
	}
	
	public Pelota(float radio, float peso)
	{
		this.radio = radio;
		this.peso = peso;
	}
	
	
	//Metodos
	public float ObtenerRadio() {
		return radio;
	}
	
	public float ObtenerPeso() {
		return peso;
	}
	
	public void PatearPelota() {
		System.out.println("Haz pateado la pelota");
	}
	
	public void AtraparPelota() {
		System.out.println("Haz Atrapado la pelota");
	}
}
