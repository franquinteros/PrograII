package test;
import modelo.Cola;

public class TestCola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cola colaDelBanco = new Cola();
		System.out.println(colaDelBanco);
		
		colaDelBanco.encolar(1);
		colaDelBanco.encolar(2);
		colaDelBanco.encolar(3);
		colaDelBanco.encolar(4);
		colaDelBanco.encolar(5);
		colaDelBanco.encolar(6);
		colaDelBanco.encolar(7);
		System.out.println(colaDelBanco);
		
		//int ultimoDatoDesencolado = colaDelBanco.desencolar(); //se guarda en una variable para no perder el dato retornado
		//System.out.println(ultimoDatoDesencolado);
		colaDelBanco.desencolar();
		colaDelBanco.desencolar();
		colaDelBanco.desencolar();
		System.out.println(colaDelBanco);
	}

}
