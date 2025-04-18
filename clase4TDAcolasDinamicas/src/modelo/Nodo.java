package modelo;
//nodos --> contiene el dato y la referencia al nodo siguiente dentro de una estructura dinámica
//en las estructuras dinámicas no hay posiciones.
public class Nodo {

	///atributos
	///datos o valores
	private int dato; //se fuerza que el dato del nodo sea un entero
	private Nodo siguiente; //clase recursiva, un nodo tiene otro nodo
	
	public Nodo(int dato, Nodo siguiente) {
		super();
		this.dato = dato;
		this.siguiente = siguiente;
	}
	public int getDato() {
		return dato;
	}

	public void setDato(int dato) {
		this.dato = dato;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
	@Override
	public String toString() {
		return "Nodo [dato=" + dato + ", siguiente=" + siguiente + "]";
	}
	
	
	
}
