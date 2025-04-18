package modelo;

import interfaces.IJugador;

public class Jugador implements interfaces.IJugador{
	private String nombre;
	private int nro;
	private float altura;
	
	
	public Jugador(String nombre, int nro, float altura) {
		super();
		this.nombre = nombre;
		this.nro = nro;
		this.altura = altura;
	}


	public Jugador() { //reserva la memoria, es buena práctica inicializar las variables indicando que están vacías, 
						//ya que si no se inicializan, se encuentran en estado basura.
		super();
		this.nombre = "";
		this.altura = -1;
		this.nro = -1;
		
	}

	@Override //respetar el nombre asignado de los metodos ya definidos, cuando se sobreescribe el metodo que ya está definido.
	public String getNombre() {
		return nombre;
	}

	@Override
	public void setNombre(String n) {
		this.nombre = n;
	}

	@Override
	public int getNro() {
		return nro;
	}

	@Override
	public void setNro(int nroNuevo) {
		this.nro = nroNuevo;
	}

	@Override
	public float getAltura() {
		return altura;
	}

	@Override
	public void setAltura(float alturaNueva) {
		this.altura = alturaNueva;
	}


	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", nro=" + nro + ", altura=" + altura + "]";
	}
	
}
