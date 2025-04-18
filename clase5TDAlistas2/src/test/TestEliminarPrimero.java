package test;

import interfaces.IListas;
import modelo.Listas;

public class TestEliminarPrimero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IListas lista = new Listas();
		lista.agregarPrimero(44);
		lista.agregarPrimero(33);
		lista.agregarUltimo(55);
		lista.imprimirAdelante();
		lista.imprimirAtras();
		lista.eliminarPrimero();
		lista.imprimirAdelante();
		lista.imprimirAtras();
	}

}
