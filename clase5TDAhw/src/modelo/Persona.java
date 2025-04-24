package modelo;
import interfaces.IPersona;
import interfaces.IListas;

public class Persona implements IPersona{

	private String nombre;
	private int dni;
	private IListas listaVehiculos;
	
	
	public Persona(String nombre, int dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.listaVehiculos = new Listas(); //creamos una lista vacía, sino figura error.
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public IListas getListaVehiculos() {
		return listaVehiculos;
	}
	public void setListaVehiculos(IListas listaVahiculos) {
		this.listaVehiculos = listaVahiculos;
	}
	
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", dni=" + dni + "]";
	}

	public void mostrarPersona() {
		System.out.println(this);
		listaVehiculos.mostrarLista();
	}
	
}
