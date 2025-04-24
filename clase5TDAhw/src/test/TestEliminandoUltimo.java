package test;

import interfaces.IPersona;
import modelo.Persona;
import modelo.Vehiculo;

public class TestEliminandoUltimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IPersona P1 = new Persona("Roher",12347654);
		
		Vehiculo V1 = new Vehiculo("765BBC","Audi","A2");
		Vehiculo V2 = new Vehiculo("098ABC","Audi","Q3");
		Vehiculo V3 = new Vehiculo("111EEE","Audi","Q4");
		Vehiculo V4 = new Vehiculo("555FJH","Audi","Q5");
		
		P1.getListaVehiculos().agregarUltimo(V1);
		P1.getListaVehiculos().agregarUltimo(V2);
		P1.getListaVehiculos().agregarUltimo(V3);
		P1.getListaVehiculos().agregarUltimo(V4);
		
		P1.getListaVehiculos().mostrarLista();
		
		P1.getListaVehiculos().eliminarUltimo();
		
		P1.getListaVehiculos().mostrarLista();
	}

}
