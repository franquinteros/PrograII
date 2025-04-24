package test;

import interfaces.IPersona;
import interfaces.IVehiculo;
import modelo.Persona;
import modelo.Vehiculo;

public class TestListaVehiculos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IPersona P1 = new Persona("Roher",12347654);
		
		IPersona P2 = new Persona("Roberta",1089567);
		Vehiculo V1 = new Vehiculo("765BBC","Audi","A2");
		Vehiculo V2 = new Vehiculo("098ABC","Audi","Q3");
		Vehiculo V3 = new Vehiculo("111EEE","Audi","Q4");
		Vehiculo V4 = new Vehiculo("555FJH","Audi","Q5");
		
		//MODIFICANDO LA LISTAVEHICULOS
		P1.getListaVehiculos().agregarPrimero(V1);
		P1.getListaVehiculos().agregarPrimero(V2);
		P1.getListaVehiculos().agregarPrimero(V3);
		P1.getListaVehiculos().agregarPrimero(V4);
		
		System.out.println("Lista antes de modificar ");
		P1.getListaVehiculos().mostrarLista();
		System.out.println("Eliminando al ultimo");		
		P1.getListaVehiculos().eliminarUltimo();
		P1.getListaVehiculos().mostrarLista();
		System.out.println("Obteniendo generico 1");
		System.out.println(	P1.getListaVehiculos().obtenerGenerico(1));

	}

}
