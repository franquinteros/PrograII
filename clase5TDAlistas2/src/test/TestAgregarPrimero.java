package test;

import interfaces.IListas;
import modelo.Listas;

public class TestAgregarPrimero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IListas lista = new Listas();
		lista.agregarPrimero(44);
		lista.agregarPrimero(33);
		lista.agregarPrimero(22);
		lista.agregarPrimero(11);

		lista.imprimirAdelante();
		lista.imprimirAtras();

	}

}
