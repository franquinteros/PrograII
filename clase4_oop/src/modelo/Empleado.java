package modelo;

public class Empleado {

	private String nombre;
	private Vehiculo vehiculo;
	
	public Empleado(String nombre, Vehiculo vehiculo) {
		super();
		this.nombre = nombre;
		this.vehiculo = vehiculo;
	}
	
	public void cambiarVehiculo(Vehiculo nuevoVehiculo) {
		this.vehiculo = nuevoVehiculo;
	}
	
	public void imprimirPremio() {
		System.out.println("Premio para " + this.nombre + " es: " + this.vehiculo.asignarPremio());
	}
}
