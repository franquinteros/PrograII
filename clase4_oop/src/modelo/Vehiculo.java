package modelo;

public abstract class Vehiculo {

	protected Premio premio; //el protected se usa cuando xxx 
	
	public String asignarPremio() {
		return premio.mostrarPremio();
	}
	
	
}
