package test;
import modelo.colaDinamica;

public class ColaDinamicaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int n = 11;
		//int m = 11;
		//System.out.println(n++); //n = n + 1. primero agarra el n y lo usa, y luego le suma 1. post-incremento, luego de usarlo
		//System.out.println(++m); //m = m + 1. primero suma m y luego da el valor. pre-incremento antes de usarlo
		//System.out.println(n);
		//System.out.println(m);
				
		colaDinamica cd = new colaDinamica();
		System.out.println(cd);
		
		cd.encolar(13);
		cd.encolar(9);
		cd.encolar(4);
		System.out.println(cd);
		System.out.println("\n\n" + cd.desencolar());
		System.out.println("\n\n" + cd);
	}
}
