package interfaces;

public interface IPersona {

	public String getNombre();
	public void setNombre(String nombre);
	public int getDni();
	public void setDni(int dni);
	public IListas getListaVehiculos();
	public void setListaVehiculos(IListas listaVahiculos);

	public String toString();

	public void mostrarPersona();
}
