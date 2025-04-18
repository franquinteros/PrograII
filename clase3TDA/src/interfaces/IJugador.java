package interfaces;

public interface IJugador {

	public String getNombre();
	
	public void setNombre(String n);

	public int getNro();
	
	public void setNro(int nroNuevo);
	
	public float getAltura();

	public void setAltura(float alturaNueva);
	
	@Override
	public String toString();
	
	///atributos en la interface: solo una forma, atributos CONSTANTES con la palabra reservada final. 
}
