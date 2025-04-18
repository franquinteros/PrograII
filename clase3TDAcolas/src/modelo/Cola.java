package modelo;

public class Cola {
	//ATRIBUTOS--
	private int primero;
	private int ultimo; //pos donde iría el elemento al agregarlo
	private int[] colaDatos = new int[100]; //estructura estática como el array, solo que es más sencillo.
	private int cantidadDatos;
	

	
	
	public Cola(int primero, int ultimo, int cantidadDatos) {
		super();
		this.primero = primero;
		this.ultimo = ultimo;
		this.cantidadDatos = cantidadDatos;
	}

	public Cola() {
		super();
		this.cantidadDatos = 0;
		this.primero = 0;
		this.ultimo = 0;
		
	}
	
	//getter & setter
	public int getPrimero() {
		return primero;
	}
	public void setPrimero(int primero) {
		this.primero = primero;
	}
	public int getUltimo() {
		return ultimo;
	}
	public void setUltimo(int ultimo) {
		this.ultimo = ultimo;
	}
	public int[] getColaDatos() {
		return colaDatos;
	}
	public void setColaDatos(int[] colaDatos) {
		this.colaDatos = colaDatos;
	}
	public int getCantidadDatos() {
		return cantidadDatos;
	}
	public void setCantidadDatos(int cantidadDatos) {
		this.cantidadDatos = cantidadDatos;
	}
	@Override
	public String toString() {
		return "Cola [primero=" + primero + ", ultimo=" + ultimo + ", cantidadDatos=" + cantidadDatos + "]";
	}
	
	//METODOS-----
	public void encolar(int numero) {
		
		//ultimo a tope, llego a los 100 elementos
		//ultimo = ( (ultimo +1) % 100 - 1 ) --> cola circular. El resto de la division la 1, al restarle 1 queda en 0.
		this.colaDatos[ultimo] = numero;
		ultimo++;
		cantidadDatos++;
		//primero = 0;
	}
	
	public int desencolar() {
		cantidadDatos --;
		int primeroAntesDesencolarlo = primero;
		primero ++;
		
		return colaDatos[primeroAntesDesencolarlo];
		
	}
	
	
}
