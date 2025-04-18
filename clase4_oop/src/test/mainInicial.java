package test;
import modelo.Empleado;
import modelo.Auto;
import modelo.Colectivo;
import modelo.Tren;
import modelo.Bicicleta;
import modelo.Moto;


public class mainInicial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	        Empleado e1 = new Empleado("Ana", new Auto());
	        Empleado e2 = new Empleado("Luis", new Colectivo());
	        Empleado e3 = new Empleado("Marta", new Bicicleta());
	        Empleado e4 = new Empleado("Carlos", new Tren());
	        Empleado e5 = new Empleado("Julia", new Moto());
	   
	        e1.imprimirPremio();
	        e2.imprimirPremio();
	        e3.imprimirPremio();

	}

}
