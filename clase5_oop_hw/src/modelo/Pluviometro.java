package modelo;
import interfaces.IPluviometro;
public class Pluviometro extends Sensor implements IPluviometro{

	public Pluviometro(String identificador, String ubicacion) {
		super(identificador, ubicacion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String mostrarDatos() {
		// TODO Auto-generated method stub
		return toString();
	}

	@Override
	public String leer(double d) {
		// TODO Auto-generated method stub
		return ("Lluvia acumulada: " + d + "mm");
		
	}

	@Override
	public String toString() {
		return "Pluviometro [identificador=" + identificador + ", ubicacion=" + ubicacion + "]";
	}

	


}
