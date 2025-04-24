package modelo;
import interfaces.INodo;
import interfaces.IListas;

public class Listas implements IListas{
			
	private INodo primero;
	//agregaria el valor ulitmo para optimizar obtenerGenerico() y busquedaSecuencial()
	private INodo ultimo;

	///----CONSTRUCTORES---///
	public Listas(INodo primero, INodo ultimo) {
		super();
		this.primero = primero;
		this.ultimo = ultimo;
	}

	public Listas() {//cuando la lista está vacía
		super();
		this.primero = null;
		this.ultimo = null;
	}


	///----METODOS----///

	
	@Override
	public void agregarPrimero(Vehiculo d) {
		//crear nodo
		INodo nuevoPrimero = new Nodo(d);
		if (!estaVacia()) {
			nuevoPrimero.setSiguiente(this.primero);
			this.primero.setAnterior(nuevoPrimero);
			this.primero = nuevoPrimero;

		}else {
			this.primero = nuevoPrimero;
			this.ultimo = nuevoPrimero;
		}
	}
	
	@Override
	public void agregarUltimo(Vehiculo d) {
		INodo nuevoUltimo = new Nodo(d);
		if (!estaVacia()) {
			nuevoUltimo.setAnterior(this.ultimo);
			this.ultimo.setSiguiente(nuevoUltimo);
			this.ultimo = nuevoUltimo;
		}else {
			agregarPrimero(d);
		}
	}
	
	@Override
	public void agregarGenerico(Vehiculo d, int pos) {
		/*unico "inconveniente" con este metodo: 
		 * si la lista tiene 3 nodos (0,1,2) y se quiere insertar uno nuevo en la pos 2, 
		 * agrega el nuevo nodo al final, pero no se logra colocarlo en la pos 2 y trasladar el anterior una pos adelante
		 * ej: 30 (0) <--> 40 (1) <--> 80 (2) y se inserta 20 en pos 2 
		 * 30 <--> 40 <--> 80 <--> 20*/
		//Lista --> A <-> B <-> C <-> null, queremos agregar a N entre A y B

		if (!estaVacia()) {
			
			INodo nuevoNodo = new Nodo(d); //nodo creado
			if (pos >= cantElementos() ||pos < 0 ) {
				System.out.println("No se pudo agregar el Nodo. Posicion fuera de rango!");
			} 

				boolean iterarDesdeInicio = determinarInicioIteracion(pos); 
				if (iterarDesdeInicio) { //recorre desde inicio
					INodo actual = this.primero;
					int posNodoActual = 0;
					while (posNodoActual < pos - 1) { //llegar hasta pos
						actual = actual.getSiguiente();
						posNodoActual++;
					}
					enlazarNodo(nuevoNodo, actual); 

				}else { //recorre desde el final
					INodo actual = this.ultimo;
					int posNodoActual = 0;
					while (posNodoActual < pos - 1) { //-1 para evitar
						actual = actual.getAnterior();
						posNodoActual++;
					}
					
					enlazarNodo(nuevoNodo, actual);

				}
			} else { //si la lista esta vacia
				agregarPrimero(d);
				System.out.println("La lista esta vacia, se agrega a la primera posicion");
			}
	}
	
	public boolean determinarInicioIteracion(int posicion) {
		if (posicion <= cantElementos() / 2) {
				return true; //desde inicio
				 
		} else {
			return false; //desde final
		}
	}
	
	public void enlazarNodo(INodo nuevoNodo, INodo actual) {
		nuevoNodo.setSiguiente(actual.getSiguiente()); //supongamos que el actual es A, entonces N --> B
		nuevoNodo.setAnterior(actual);// A <-- N
		actual.setSiguiente(nuevoNodo); //A --> N
		//la lista queda: A <-> N --> B <-> C, aún falta establecer que B apunte a N!
		if (nuevoNodo.getSiguiente() != null) {//si el siguiente de nuevoNodo no es null, significa que hay otro nodo que le sigue
			nuevoNodo.getSiguiente().setAnterior(nuevoNodo);
			//ahora sí, la lista queda: A <-> N <--> B <-> C
		}
	}
	
	//@Override
	public Vehiculo eliminarPrimero() {
		if (!estaVacia()) {
			///Lista --> |11| --> |22| --> |33| --> null
			Vehiculo datoAEliminar = this.primero.getDato(); //--> 11
			this.primero = primero.getSiguiente();// 22 es el nuevo primero
			this.primero.setAnterior(null);
			return datoAEliminar;
		}else {
			System.out.println("No puedo eliminar el primer elemento ya que no hay");
			return null;
		}
	}
	
	//@Override
	public Vehiculo eliminarUltimo() {//mismo que eliminarPrimero, pero con el último valor
		if (!estaVacia()) {
			Vehiculo nodoAEliminar = this.ultimo.getDato();
			this.ultimo = ultimo.getAnterior();
			this.ultimo.setSiguiente(null);
	
			return nodoAEliminar;
		}else {
			System.out.println("No puedo eliminar el primer elemento ya que no hay");
			return null;
		}
	}

	
	public void eliminarNodo(INodo nodoEliminar) {
		//eliminando a nodoAEliminar:
		INodo nodoSiguiente = nodoEliminar.getSiguiente(); //siguiente del que se va a eliminar
		INodo nodoAnterior = nodoEliminar.getAnterior();//anterior del que se va a eliminar
		
		if (nodoAnterior != null) {
	        nodoAnterior.setSiguiente(nodoSiguiente);
	    }
	    if (nodoSiguiente != null) {
	        nodoSiguiente.setAnterior(nodoAnterior);
	    }

	}
	
	//@Override
	public void eliminarGenerico(int pos) {
		if (estaVacia()) {
			System.out.println("No se pudo eliminar, la lista está vacía");
			return;
		}
		if (pos == 0) {
			eliminarPrimero();
		}
		if (pos == cantElementos() - 1) {
			eliminarUltimo();
		}
		
		if (pos < 0 || pos >= cantElementos()) {
			System.out.println("Posicion fuera de rango");
			return;
		}
		
		
		boolean iterarDesdeInicio = determinarInicioIteracion(pos); 

		if (iterarDesdeInicio) { //recorre desde inicio
			INodo actual = this.primero;
			int posNodoActual = 0;
			while (posNodoActual < pos) { //llegar hasta pos
				actual = actual.getSiguiente();
				posNodoActual++;
			}
			eliminarNodo(actual); 
			
			
		}else { //recorre desde el final
			INodo actual = this.ultimo;
			int posNodoActual = 0;
			while (posNodoActual < (cantElementos() - 1 - pos)) { //-1 para evitar
				actual = actual.getAnterior();
				posNodoActual++;
			}
			
			eliminarNodo(actual);
			
			
		}
	}
	

	///---EXTRAS---///
	
	//@Override
	public void imprimirAdelante() {
        INodo actual = this.primero;
        System.out.print("Lista (adelante): ");
        while (actual != null) {
            System.out.print(actual.getDato() + " ");
            actual = actual.getSiguiente();
        }
        System.out.println();
    }
	
	//@Override
	public void imprimirAtras() {
		INodo actual = this.ultimo;
        System.out.print("Lista (atras): ");
        while (actual != null) {
            System.out.print(actual.getDato() + " ");
            actual = actual.getAnterior();
        }
        System.out.println();
    }
	
	//@Override
	public int cantElementos() {
		if (estaVacia()) {
			return 0;
		}else {
			int cant = 1;
			INodo actual = this.primero;
			while (actual.getSiguiente() != null) {
				actual = actual.getSiguiente();
				cant++;
			}
			return cant;
		}
		
	}

	//@Override
	public boolean estaVacia() {
		/*boolean respuesta = (primero == null);//operacion lógica
		return respuesta;*/
		return primero == null;
	}
	
	public void mostrarLista() {
		INodo actual = this.primero;
		while (actual != null) {
			System.out.println(actual.getDato() + "\n");
			actual = actual.getSiguiente();
		}
		
	}
	
	///-----MODIFICAR LOS SIGUIENTES METODOS----///

	public Vehiculo obtenerGenerico(int pos) {

		if (!estaVacia()) {

			if (pos >= cantElementos() ||pos < 0 ) {
				System.out.println("No se pudo agregar el Nodo. Posicion fuera de rango!");
			} 
			boolean iterarDesdeInicio = determinarInicioIteracion(pos); 

			if (iterarDesdeInicio) { //recorre desde inicio
				INodo actual = this.primero;
				int posNodoActual = 0;
				while (posNodoActual < pos) { //llegar hasta pos
					actual = actual.getSiguiente();
					posNodoActual++;
				}
				return actual.getDato();

			}else { //recorre desde el final
				INodo actual = this.ultimo;
				int posNodoActual = 0;
				while (posNodoActual < (cantElementos() - 1 - pos)) { //-1 para evitar
					actual = actual.getAnterior();
					posNodoActual++;
				}
					
				return actual.getDato();

			}
		}else {
			System.out.println("La lista está vacía. No puedo mostrar ningún Nodo");
			return null;
	}

	}

	public Vehiculo obtenerPrimero() {//MODIFICAR PARA LISTA DOBLE
		if (!estaVacia()) {
			INodo actual = this.primero;
			return actual.getDato();
			
		}else {
			//devuelve -1 e imprime un mensaje de error
			System.out.println("No se puede devolver el primer elemento porque está vacía");
			return null;
			
		}
	}

	//@Override
	public Vehiculo obtenerUltimo() {//MODIFICAR PARA LISTA DOBLE
		if (!estaVacia()) {
			INodo actual = this.ultimo;
			return actual.getDato();
			
		}else {
			//devuelve -1 como valor e imprime un mensaje de error
			System.out.println("La lista está vacía, no se puede devolver el último elemento");
			return null;
			
		}
	}
	
	///----GETTER & SETTER----///
	public INodo getPrimero() {
		return primero;
	}


	public void setPrimero(INodo primero) {
		this.primero = primero;
	}

}
