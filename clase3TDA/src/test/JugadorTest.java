package test;
import modelo.Jugador;

public class JugadorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jugador jugador1 = new Jugador("Brenda",11, 1.63f); //en los float y double hay q especificar cuál es, x eso la f
		
		jugador1.setNombre("nico");
		///aunq los attr sean privados, se pueden acceder con el setter.
		///por qué? porque podemos definir y controlar el cambio, usando condicionales x ejemplo. 
		System.out.println(jugador1);
	}

}
