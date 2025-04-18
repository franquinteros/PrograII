package modelo;

public class PremioCascoChaleco extends Premio {
	
	@Override
	String mostrarPremio() {
		return "¡Recibe un kit de seguridad: un casco y un chaleco fluorescente!";
	}

	@Override
	public String toString() {
		return "PremioCascoChaleco [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	
}
