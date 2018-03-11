package vista;

public enum NumeroMinas {
	Diez(10), Veinte(20), Treinta(30);
	private int valor;

	private NumeroMinas(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}
	
}
