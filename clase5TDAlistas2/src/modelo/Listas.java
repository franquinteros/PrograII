package modelo;
import interfaces.INodo;
import interfaces.IListas;

public class Listas implements IListas{
	//LISTAS --> generalización del array, sólo que no tiene un tamaño fijo. Colección de nodos
			// (dato: 1) (3) (44) (12) -> null
			// (siguiente ->)
			//interesa sólo el primer elemento ya que a partir de él se accede al resto de los nodos siguientes.
			//lista vacía --> primer nodo = null
			//insertar y eliminar nodos en cualquier pos, como tmb obtenr info d cualquier nodo. Tmb permite el ordenamiento y metodos de busquedas
			
	private INodo primero;
	
	
	public Listas(Nodo primero) {
		super();
		this.primero = primero;
	}

	public Listas() {//cuando la lista está vacía
		super();
		this.primero = null;
	}


	///MÉTODOS------
	public void agregarPrimero(int d) {
		//lista --> |22| --> |3| --> |4|
		//crear nodo
		INodo nuevoPrimero = new Nodo(d);//dato: 44, siguiente: null, anterior: null.
		if (!estaVacia()) {
			nuevoPrimero.setSiguiente(this.primero);//vincular al 44 con el 22
			this.primero.setAnterior(nuevoPrimero);

			this.primero = nuevoPrimero;
			//Lista --> (44) --> |22| --> |3| --> |4|
		}else {
			this.primero = nuevoPrimero;
		}
	}
	
	public void agregarUltimo(int d) {
		//lista --> |22| --> |3| --> |4|
		//crear nodo
		INodo nuevoUltimo = new Nodo(d);//dato: 44, siguiente: null, anterior: null.
		if (!estaVacia()) {
			INodo anteriorUltimo = this.primero;
			while (anteriorUltimo.getSiguiente() != null) {
				anteriorUltimo = anteriorUltimo.getSiguiente();
			}
			anteriorUltimo.setSiguiente(nuevoUltimo);//vincular al 44 con el 22
			nuevoUltimo.setAnterior(anteriorUltimo);
			
			//this.primero = nuevoPrimero;
			//Lista --> (44) --> |22| --> |3| --> |4|
		}else {
			agregarPrimero(d);
		}
	}
	
	
	public void imprimirAdelante() {
        INodo actual = this.primero;
        System.out.print("Lista (adelante): ");
        while (actual != null) {
            System.out.print(actual.getDato() + " ");
            actual = actual.getSiguiente();
        }
        System.out.println();
    }
	
	// Método para imprimir de fin a inicio (sin tener cola)
    public void imprimirAtras() {
        if (this.primero == null) return;

        // Primero llegamos al último nodo
        INodo actual = this.primero;
        while (actual.getSiguiente() != null) {
        	//System.out.println(actual);
            actual = actual.getSiguiente();
        }

        // Ahora recorremos hacia atrás
        System.out.print("Lista (atrás): ");
        while (actual != null) {
            System.out.print(actual.getDato() + " ");
            actual = actual.getAnterior();
        }
        System.out.println();
    }
	
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
	public int eliminarPrimero() {
		if (!estaVacia()) {
			///Lista --> |11| --> |22| --> |33| --> null
			int datoAEliminar = this.primero.getDato(); //--> 11
			this.primero = primero.getSiguiente();// 22 es el nuevo primero
			this.primero.setAnterior(null);
			return datoAEliminar;
		}else {
			System.out.println("No puedo eliminar el primer elemento ya que no hay");
			return -1;
		}
	}
	
	////---METODOS A MODIFICAR----////
	public int obtenerGenerico(int pos) {//MODIFICAR PARA LISTA DOBLE
		//pos = 2
		//Lista --> |11| --> |22| --> |33| --> null
		//return 33
		if (!estaVacia() && pos < cantElementos()) {
			int contador = 0;
			INodo actual = this.primero;
			while(contador != pos) {
				actual = actual.getSiguiente();
				contador++;
			}
			return actual.getDato();
		}else {
			System.out.println("No puedo obtener un elemento de esta lista");
			return -1;
		}
		
	}

	public int busquedaSecuencial(int d) {//MODIFICAR PARA LISTA DOBLE
		///Lista --> |11| --> |22| --> |33| --> |44| --> null; buscamos el 44, el return debe ser un 3, la pos.
		if (!estaVacia()) {
			INodo actual = this.primero;
			int pos = 0;
			while (actual.getSiguiente() != null && actual.getDato() != d) {
				actual = actual.getSiguiente();
				pos++;
			}
			if (pos >= 0 && pos < cantElementos()) {//hacer un flag de si se encuentra o no
				return pos;
			}else {
				System.out.println("Está vacía");
				return -1;
			}
			
		}else {
			System.out.println("Está vacía");
			return -1;
		}
		
	}
	
	
	@Override
	public void agregarGenerico(int d, int pos) {//MODIFICAR PARA LISTA DOBLE
		//Lista --> |33| --> |22| --> |11| --> null (44, pos1)
		if (!estaVacia()) {
			INodo nuevoNodo = new Nodo(d); //nodo creado
			INodo actual = this.primero;// me paro en el primero
			int posNodoActual = 0;
			while (posNodoActual < pos - 1 && pos < cantElementos()) {
				actual = actual.getSiguiente();
				posNodoActual++;
			}
			if (posNodoActual >= 0 && pos < cantElementos()) {
				nuevoNodo.setSiguiente(actual.getSiguiente());//44;sig -> siguiente del 33, o sea, 22
				actual.setSiguiente(nuevoNodo);//33, siguiente -> 44
			}else {
				System.out.println("No se pudo agregar el elemento a la posición indicada");//anda bien
			}
				
		}else {
			agregarPrimero(d);
			System.out.println("La lista esta vacia, se agrega a la primera posicion");
			
		}
		
	}

	@Override
	public void eliminar(int pos) {//MODIFICAR PARA LISTA DOBLE
		// TODO Auto-generated method stub
		if (!estaVacia()) {
			int contador = 0;
			INodo actual = this.primero;
			
			while (actual.getSiguiente() != null && contador < cantElementos()) {
				actual = actual.getSiguiente();
				contador++;
			}
			if (actual.getSiguiente() == null) {
				System.out.println("Posicion fuera de rango");
				
			}
			actual.setSiguiente(actual.getSiguiente().getSiguiente());
			
		}else {
			System.out.println("No se pudo eliminar, la lista está vacía");
		}
	}

	@Override
	public int eliminarUltimo() {//MODIFICAR PARA LISTA DOBLE
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int obtenerPrimero() {//MODIFICAR PARA LISTA DOBLE
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int obtenerUltimo() {//MODIFICAR PARA LISTA DOBLE
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void mostrarLista() {
		INodo actual = this.primero;
		int elem = 0;
		if (estaVacia()) return;
		
		while (actual.getSiguiente() != null && elem < cantElementos() + 1) {
			System.out.println("Elemento " + (elem + 1) + " " +  actual.getDato());
			actual = actual.getSiguiente();
			elem++;
		}
		
	}
	
	///GETTER & SETTER----
	public INodo getPrimero() {
		return primero;
	}


	public void setPrimero(INodo primero) {
		this.primero = primero;
	}

	
	
	public boolean estaVacia() {
		/*boolean respuesta = (primero == null);//operacion lógica
		return respuesta;*/
		return primero == null;
	}

	@Override
	public String toString() {
		return "Listas [primero=" + primero + "]";
	}

	
	
	
}
