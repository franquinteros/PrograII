package modelo;

public class Animal implements interfaces.IAnimal{
	private int energia;
	private int hambre;
	private String raza;
	private String nombre;


	public Animal() {
		super();
		this.energia = -1;
		this.hambre = -1;
		this.raza = " ";
		this.nombre = " ";
	}

	public Animal(int energia, int hambre, String raza, String nombre) {
		super();
		this.energia = energia;
		this.hambre = hambre;
		this.raza = raza;
		this.nombre = nombre;
	}

	public Animal(String raza, String nombre) {
		super();
		this.raza = raza;
		this.nombre = nombre;
		this.energia = 100;
		this.hambre = 70;
		
	}

	@Override
	public void comer(int cant) {
		// TODO Auto-generated method stub
		if (this.hambre < 100 && this.hambre > 0) {
			hambre += cant;
		}
		else {
			System.out.println(this.nombre + " no tiene hambre");
		}
	}

	@Override
	public void dormir(float hrs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jugar(float hrs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Animal [energia=" + energia + ", hambre=" + hambre + ", raza=" + raza + ", nombre=" + nombre + "]";
	}

	@Override
	public void comer(int cant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dormir(float hrs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jugar(float hrs) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
