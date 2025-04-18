package modelo;

public class colaDinamica {

	private Nodo primero;
	private Nodo ultimo;
	private int cantidad;
	
	public colaDinamica() {
		super();
		this.primero = null; //está en null porque no hay número de posiciones, sino que ahora se apuntan a los nodos
		//como ahora se inicializa, se usa null para referenciar que hay un elemento no inicializado.
		this.ultimo = null;
		this.cantidad = 0;
		

		
	}
	
	public void encolar(int dato) {
		//crear un nodo con la nueva información.
		
		Nodo nuevoNodo = new Nodo(dato, null);
		if (ultimo != null) { //si hay un último nodo
			ultimo.setSiguiente(nuevoNodo); //configuramos que el attr sig. del último nodo apunte al nuevo nodo, no más a null
		}
		else {//cuando el último es null, es decir, cuando está vacío
			primero = nuevoNodo;
		}
		ultimo = nuevoNodo;
		cantidad++;
		
	}
	
	public Nodo desencolar() {
		Nodo variableDesencolada = primero;
		//variableDesencolada.setSiguiente(null); 
		cantidad--;
		primero = primero.getSiguiente();
		
		return variableDesencolada;
		
	}

	@Override
	public String toString() {
		return "colaDinamica [primero=" + primero + ", ultimo=" + ultimo + ", cantidad=" + cantidad + "]";
	}
	
	
	
}
