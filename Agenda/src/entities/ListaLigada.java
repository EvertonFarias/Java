package entities;

public class ListaLigada {
    private Celula primeira;
    private Celula ultima;
    private int tamanho;

    public ListaLigada() {
        this.primeira = null;
        this.ultima = null;
        this.tamanho = 0;
    }

    
    
    public Celula getPrimeira() {
		return primeira;
	}



	public void setPrimeira(Celula primeira) {
		this.primeira = primeira;
	}


	public Celula getUltima() {
		return ultima;
	}






	public void setUltima(Celula ultima) {
		this.ultima = ultima;
	}






	public int getTamanho() {
		return tamanho;
	}






	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}






	public void adicionarNo(People elemento) {
        Celula novaCelula = new Celula(null, elemento);

        if (tamanho == 0) {
            primeira = novaCelula;
            ultima = novaCelula;
        } else {
            ultima.setProxima(novaCelula);
            ultima = novaCelula;
        }

        tamanho++;
    }
    
    
    
    
    public void exibirElementos() {
        Celula atual = primeira;
        while (atual != null) {
  
            System.out.println(atual.getElemento().getName());
            atual = atual.getProxima();
        }
    }

    public ListaLigada removerPrimeirosNElementos(int n) {
        if (n <= 0) {
            return this; 
        }

        if (n >= tamanho) {

            this.primeira = null;
            this.ultima = null;
            this.tamanho = 0;
        } else {
            Celula novaPrimeiraCelula = primeira;
            for (int i = 0; i < n; i++) {
                novaPrimeiraCelula = novaPrimeiraCelula.getProxima();
            }

            this.primeira = novaPrimeiraCelula;
            this.tamanho -= n;
        }

        return this;
    }
    

}
