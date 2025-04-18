package test;
import interfaces.IAnimal;
import modelo.Perro;
import modelo.Ave;
import modelo.Gato;
public class testAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IAnimal perro1 = new Perro("Lola", 10, 15.7, "Labrador");
		IAnimal ave1 = new Ave("Lara", 1, 3.5, false);
		IAnimal gato1 = new Gato("Lila", 0, 0.6, true);
		System.out.println(perro1.mostrarFicha());
		System.out.println(ave1.mostrarFicha());
		System.out.println(gato1.mostrarFicha());
		System.out.println(perro1.hacerSonido());
		System.out.println(ave1.hacerSonido());
		System.out.println(gato1.hacerSonido());
	}

}
