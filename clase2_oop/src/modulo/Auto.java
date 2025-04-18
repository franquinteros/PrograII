package modulo;
import interfaces.IAuto;

public class Auto implements IAuto {
	private int kilometro;
	private String marca;
	private String modelo;
	public Persona conductor;
	public int nafta = 0;
	private final int max_nafta = 100;
	private final int min_nafta = 0;
	

	//---- CONSTRUCTOR ----

	public Auto(int kilometro, String marca, String modelo) {
		super();
		this.kilometro = kilometro;
		this.marca = marca;
		this.modelo = modelo;
	}
	
    
	//----- METODOS -----

	// Método para asignar un conductor (de la clase Persona) al auto
    public void asignarConductor(Persona conductor) {
        this.conductor = conductor;
        conductor.asignarAuto(this); ///establede dirección bidireccinal,
        							///ya que aignarAuto() recibe de la clase Auto un auto, por eso el this
    }

	
	public void cargarNafta(int cantidad) {
		if (conductor != null) {
			if (this.validarCantidadNafta(cantidad)) {
				if(nafta == max_nafta) {
					System.out.println("No se puede cargar nafta, se ha alcanzado el máximo.");
				}
				
				else if (nafta > min_nafta && nafta < max_nafta){
					System.out.println("No se puede cargar nafta porque queda más de 1/4L");
				}
				else{
					nafta += cantidad;
					System.out.println("Se ha cargado " + cantidad + " de nafta. Total combustible: " + nafta);
				}
			}
			else {
				System.out.println("No se pueden cargar litros negativos");
			}
			
		}
		else {
			System.out.println("No se puede cargar la nafta ya que no tiene conductor");
		}
		
	}
	
	public int restarNafta(int km) {
		if (conductor != null) {
			if (this.validarCantidadKilometros(km)) {
				nafta -= km * 0.2;
			}
			else {
				System.out.println("No se puede recorrer una distancia negativa");
			}
		}
		else {
			System.out.println("No se puede conducir el auto ya que no tiene conductor");
		}
		return nafta;
	}
	
	public int andar(int km) {
		if (conductor != null) {
			
			if (this.validarCantidadKilometros(km)) {
				
				if (nafta > min_nafta) {
					kilometro += km;
					this.restarNafta(km);
				}
				else {
					System.out.println("No se puede conducir, no tiene nafta el auto");
				}
				
			}
			else {
				System.out.println("No se puede conducir el auto ya que no tiene conductor");
			}
			
		}
		else {
			System.out.println("No se puede conducir ya que no tiene conductor");
		}
		return kilometro;
	}
	
	public boolean validarCantidadNafta(int cant) {
		if (cant > 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean validarCantidadKilometros(int kms) {
		if (kms > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	public String kmHechos() {
		return ("El auto tiene un total de " + kilometro + " kilómetros");
	}

	public int getKilometro() {
		return kilometro;
	}

	public void setKilometro(int kilometro) {
		this.kilometro = kilometro;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}


}
