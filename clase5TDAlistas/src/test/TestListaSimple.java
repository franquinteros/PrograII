package test;

import interfaces.IListas;
import modelo.Listas;
public class TestListaSimple {
	//lista simplemente enlazada, es decir hay un solo enlace entre elementos: el siguiente

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IListas lista = new Listas();
		
		System.out.println("Es vacia: " + lista.estaVacia());
		System.out.println(lista);
		System.out.println("Busco el 44: " + lista.busquedaSecuencial(44));
		
		
		lista.agregarPrimero(11);
		lista.agregarUltimo(22);
		lista.agregarUltimo(33);
		System.out.println(lista);
		lista.agregarGenerico(44, 1);
		System.out.println(lista);
		//lista.eliminar(0);
		//System.out.println(lista);
		//cantidad elementos: 4
		System.out.println("Es vacia: " + lista.estaVacia());
		
		System.out.println("Elemento 1: " + lista.obtenerGenerico(1));
		
		System.out.println("Cantidad de elementos: " + lista.cantElementos());
		System.out.println("Eliminado: " + lista.eliminarPrimero());
		System.out.println(lista);
		lista.mostrarLista();
		
		//System.out.println("Busco el 11: " + lista.busquedaSecuencial(11));
	}

}
