package test;

import interfaces.IListas;
import modelo.Listas;

public class TestAgregarGenerico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IListas lista = new Listas();
		lista.agregarPrimero(44);
		lista.agregarUltimo(55);
		lista.imprimirAdelante();
		lista.imprimirAtras();
		lista.agregarGenerico(66, 2);
	System.out.println(lista.cantElementos())	;
		lista.imprimirAdelante();
		lista.imprimirAtras();
	}

}
