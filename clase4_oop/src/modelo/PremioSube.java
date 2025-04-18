package modelo;

public class PremioSube extends Premio{
	
	@Override
	String mostrarPremio() {
		return "¡Recibe un voucher de $80000 para carga de sube!";
	}

	@Override
	public String toString() {
		return "PremioSube [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	

}
