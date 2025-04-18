package test;

import interfaces.IListas;
import modelo.Listas;

public class TestAgregarUltimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IListas lista = new Listas();
		lista.agregarPrimero(44);
		lista.agregarPrimero(33);
		lista.imprimirAdelante();
		lista.imprimirAtras();
		lista.agregarUltimo(55);
		lista.imprimirAdelante();
		lista.imprimirAtras();
	}

}
