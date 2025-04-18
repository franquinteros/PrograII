package modelo;

import java.util.Arrays;

//en las colas no van los setters ya que los attr se calculan en base a acciones.
public class Cola{
	//primero y último no tienen setters ya que son elementos que mutan dependiendo diferentes acciones.
	private int primero;
	private int ultimo;
	//opcional. "cantidad" es un Atributo  calculable, nunca tienen un setter ya que son derivados.
	//en caso de querer cambiarlo, es necesario cambiar los atributos del cual deriva
	private int cantidad;
	
	//Estructuras estáticas
	private int elementos[] = new int[10];
	private int prioridadElementos[] = new int[10];
	
	
	public Cola() {
		super();
		this.primero = 0;
		this.cantidad = 0;
	}

	//en las colas, esto no debe hacerse a nivel conceptual.
	@Override
	public String toString() {
		return "Cola [primero=" + primero + ", ultimo=" + ultimo + ", cantidad=" + cantidad + ", elementos="
				+ Arrays.toString(elementos) + ", priodidadElementos=" + Arrays.toString(prioridadElementos) + "]";
	}
	
	//encolar
	public void encolar(int dato, int prio) {
		//algoritmo cola con prioridad
		//simpre corroborar que hay espacio para agregar un elemento
		if (cantidad < 10) {
			int ult = cantidad - 1; //pos del ultimo, donde el valor es el num de la cantidad
			
			while(ult >= 0 && prioridadElementos[ult] < prio) {
				elementos[ult + 1] = elementos[ult];
				prioridadElementos[ult + 1] = prioridadElementos[ult];
			}
			elementos[ult + 1] = dato; //se le suma 1 porq si la cant vale 0, entonces ult es -1, además
			prioridadElementos[ult + 1] = prio;
			cantidad++;
			ultimo++;
		}
		
		
		//algoritmo de una cola standar:
		//elementos[ultimo] = dato;
		//cantidad++;
		//ultimo++;
		
		
	}
	
	public int desencolar() {
		
		//simpre es necesario desencolar cuando hay elementos
		
		int variableDesencolada = elementos[primero];
		primero++;
		cantidad--;
		
		return variableDesencolada;
	}
}
