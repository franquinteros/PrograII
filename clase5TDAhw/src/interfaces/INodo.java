package interfaces;
import modelo.Vehiculo;


public interface INodo {
	
	public String toString();
	//getter & setter
	public Vehiculo getDato();
	public void setDato(Vehiculo dato);
	public INodo getSiguiente();
	public void setSiguiente(INodo siguiente);
	public INodo getAnterior();

	public void setAnterior(INodo anterior);
	
}
