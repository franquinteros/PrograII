package modelo;

import java.util.Arrays;

public class Equipo {
	
	private String nombre;
	private int rank;
	
	//Equipo tenga muchos jugadores,o sea, un array de jugadores. Sería un atributo
	private Jugador[] arrayJugadores = new Jugador[6]; //clases anidadas, cuando hay relaciones entre clases
	//forzamos que cada array de las instancias de equipo tenga max 6
	
	//nuevo atributo---
	private int posDeCompra;
	
	
	//----METODOS----
	public Equipo() {
		super();
	}
	//especificamos que cada array tenga su propio tamano en el constructor, si no queremos que tenga el tamaño forzado al inicio.
	public Equipo(String nombre, int rank, int tamArray) {
		super();
		this.nombre = nombre;
		this.rank = rank;
		this.arrayJugadores = new Jugador[tamArray]; 
		this.posDeCompra = 0;
	}
	
	public Equipo(String nombre, int rank) {
		super();
		this.nombre = nombre;
		this.rank = rank;
		this.posDeCompra = 0;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	

	public Jugador[] getArrayJugadores() {
		return arrayJugadores;
	}

	public void setArrayJugadores(Jugador[] arrayJugadores) {
		this.arrayJugadores = arrayJugadores;
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", rank=" + rank + ", arrayJugadores=" + Arrays.toString(arrayJugadores)
				+ "]";
	}
	//alternativa del add - append en python
	public void comprarJugador(Jugador jugadorNuevo) {
		//this.arrayJugadores.length;
		if (this.posDeCompra < 6) {
				
			while (this.arrayJugadores[this.posDeCompra] != null) {
				this.posDeCompra ++;
			}
			this.arrayJugadores[this.posDeCompra] = jugadorNuevo;//en la posicion 0 se guarda el nuevo jugador
			this.posDeCompra++;
			System.out.print(this.posDeCompra);
		}

	}
	
	public void borrarJugador(int pos) {
		this.arrayJugadores[pos] = null; //se llama al constructor vacío
		this.posDeCompra = pos;
		

	}
	
}
