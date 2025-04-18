package interfaces;

import modulo.Persona;

public interface IAuto {

	public void asignarConductor(Persona conductor);
	
	public void cargarNafta(int cantidad);
	
	public int restarNafta(int km);
	
	public int andar(int km);
	
	public boolean validarCantidadNafta(int cant);
	
	public boolean validarCantidadKilometros(int kms);
	
	public String kmHechos();

	public int getKilometro();
	
	public void setKilometro(int kilometro);

	public String getMarca();
	
	public String getModelo();
}
