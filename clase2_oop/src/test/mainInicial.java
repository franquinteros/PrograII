package test;
import modulo.Auto;
import modulo.Persona;

public class mainInicial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto a1 = new Auto(0, "Chevrolet", "Prisma");
		
		Persona p1 = new Persona(20, "Lara");
		Persona p2 = new Persona(18, "Martín");
		
		//PERSONA 1 ------
		System.out.println(p1.mostrarInformacion());
		a1.asignarConductor(p1);
		a1.setKilometro(1000);
		System.out.println(a1.getModelo());
		System.out.println(a1.getMarca());
		System.out.println(a1.getKilometro());
		
		//acciones sobre el auto
		System.out.println(a1.nafta); //empieza en 0
		a1.cargarNafta(-40); //validación de ingresar número negativo
		a1.andar(-60); //validación de ingresar número negativo
		System.out.println("La nafta del auto luego del uso es de " + p1.nombre + " es de: "+ a1.nafta);
		System.out.println(p1.nombre + " usó el auto. " + a1.kmHechos());
		
		//PERSONA 2 -------
		System.out.println(p2.mostrarInformacion());
		a1.asignarConductor(p2);

		//acciones sobre el auto
		System.out.println("La nafta del auto es de: " + a1.nafta); //nafta restante el uso de la persona 1
		a1.cargarNafta(20);
		a1.andar(80);
		
		//estado final del auto, viendo la nafta y sus kilómetros
		System.out.println("La nafta del auto luego del uso es de " + p2.nombre + " es de: "+ a1.nafta);
		System.out.println(p2.nombre + " usó el auto. " + a1.kmHechos());

	}

}
