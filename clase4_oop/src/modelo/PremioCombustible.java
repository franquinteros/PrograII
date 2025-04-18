package modelo;

public class PremioCombustible extends Premio{
	@Override
	String mostrarPremio() {
		return "¡Recibe un voucher de $50000 para carga de combustible!";
	}
	@Override
	public String toString() {
		return "PremioCombustible [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	
}
