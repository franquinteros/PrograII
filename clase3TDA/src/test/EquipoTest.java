package test;
import modelo.Equipo;
import modelo.Jugador;
public class EquipoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Equipo equipo1 = new Equipo("River", 2);
		Equipo equipo2 = new Equipo("River", 7, 50); //recibe los 50 elementos del array
		
		Jugador jugador1 = new Jugador("Norma", 11, 1.80f);
		Jugador jugador2 = new Jugador("Brenda", 9, 1.70f);
		Jugador jugador3 = new Jugador("Ana", 7, 1.58f);
		Jugador jugador4 = new Jugador("Teresa", 10, 1.65f);
		
		equipo1.comprarJugador(jugador1);
		equipo1.comprarJugador(jugador2);
		equipo1.comprarJugador(jugador3);
		equipo1.borrarJugador(1);
		equipo1.comprarJugador(jugador4);
		equipo1.comprarJugador(jugador2);
		//equipo1.comprarJugador(jugador4);
		
		System.out.print(equipo1);
	}

}
