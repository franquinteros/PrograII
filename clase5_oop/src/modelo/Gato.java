package modelo;

public class Gato extends Animal{

	private boolean esDeInterior; 
	
	public Gato(String nombre, int edad, double peso, boolean esDeInterior) {
		super(nombre, edad, peso);
		// TODO Auto-generated constructor stub
		this.esDeInterior = esDeInterior;
	}

	@Override
	public String mostrarFicha() {
		// TODO Auto-generated method stub
		return (this.getNombre() + ", " + this.getEdad() + ", " + this.getPeso() + ", " + this.esDeInterior);
	}

	@Override
	public String hacerSonido() {
		// TODO Auto-generated method stub
		return "Miau";
	}

	public boolean isEsDeInterior() {
		return esDeInterior;
	}

	public void setEsDeInterior(boolean esDeInterior) {
		this.esDeInterior = esDeInterior;
	}
	
	
}
