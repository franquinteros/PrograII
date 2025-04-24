package interfaces;

import modelo.Vehiculo;

public interface IListas {

	public INodo getPrimero();

	public void setPrimero(INodo primero);

	public String toString();
	
	///-----PRIMITIVAS------///
	
	///agregar elementos. LISTO TODOS
	public void agregarUltimo(Vehiculo d);//como el encolar
	public void agregarPrimero(Vehiculo d);
	public void agregarGenerico(Vehiculo d, int pos);
	
	///eliminar LISTO TODOS
	public void eliminarGenerico(int pos);
	public Vehiculo eliminarUltimo();//sin pos ya q se sabe la pos del elemento a eliminar
	public Vehiculo eliminarPrimero();
	public void eliminarNodo(INodo nodoEliminar);
	
	
	///obtenerElemento TODOS 
	public Vehiculo obtenerPrimero();//sin pos ya q se sabe la pos del elemento a obtener
	public Vehiculo obtenerUltimo();
	public Vehiculo obtenerGenerico(int pos);
	
	///--------EXTRAS----------///
	public boolean estaVacia(); //LISTO
	public int cantElementos(); //LISTO
	public void enlazarNodo(INodo nuevoNodo, INodo actual);//LISTO

	public void imprimirAtras(); //LISTO
	public void imprimirAdelante(); //LISTO
	public void mostrarLista(); //LISTO

}
