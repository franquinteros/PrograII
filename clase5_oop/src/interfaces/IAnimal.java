package interfaces;

public interface IAnimal {

	abstract String mostrarFicha();
	abstract String hacerSonido();
	
	public String getNombre();
	public void setNombre(String nombre);
	public int getEdad();
	public void setEdad(int edad);
	public double getPeso();
	public void setPeso(double peso);
}
