package modulo;
import interfaces.IPersona;

public class Persona {

	public String nombre;
	private int edad;
	public Auto auto;
	
	//constructor
	public Persona(int edad, String nombre) {
		super();
		this.edad = edad;
		this.nombre = nombre;
	}

	//metodos
	
	// Metodo para asignar un auto (de la clase Auto) a la persona
    public void asignarAuto(Auto auto) {
        this.auto = auto;
    }
	

	public String mostrarInformacion() {
        if (auto != null) {
            return "Persona: " + nombre + ", Edad: " + edad + ", Maneja el auto: " + auto.getMarca() + " " + auto.getModelo();
        } else {
            return "Persona: " + nombre + ", Edad: " + edad + ", No tiene auto asignado";
        }
    }

	

	
}
