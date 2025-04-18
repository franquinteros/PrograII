package interfaces;

import modelo.Nodo;

public interface INodo {
	
	
	//getter & setter
	public int getDato();
	public void setDato(int dato);
	public INodo getSiguiente();
	public void setSiguiente(INodo siguiente);
	public String toString();
	
}
