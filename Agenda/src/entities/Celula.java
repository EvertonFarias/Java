package entities;

public class Celula {
	private Celula proxima;
	private People elemento;
	
	public Celula(Celula proxima, People elemento) {
		this.proxima = proxima;
		this.elemento = elemento;
	}
	
	
	
	
	
	public Celula getProxima() {
		return proxima;
	}

	public void setProxima(Celula proxima) {
		this.proxima = proxima;
	}

	public People getElemento() {
		return elemento;
	}

	public void setElemento(People elemento) {
		this.elemento = elemento;
	}

}
