package modelo;

import interfaces.IAnimal;

public abstract class Animal implements IAnimal{

	private String nombre;
	private int edad;
	private double peso;

	
	public Animal(String nombre, int edad, double peso) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
	}
	public abstract String mostrarFicha();

	public abstract String hacerSonido();
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}

}
