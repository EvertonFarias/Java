package entities;

public class Agenda {
    private int[] dias; 
    public Agenda() {
        this.dias = new int[31]; // quantiadde de dias
    }

    public void adicionarTarefa(int dia) {   
        if (dia >= 1 && dia <= 31) {
        	if (this.dias[dia] != 1) {
        		this.dias[dia] = 1; 
        	}
        	else {
        		System.out.println("Esse dia já está ocupado");
        	}
        	
        	
        } else {
            System.out.println("Dia fora do intervalo válido (1 a 31).");
        }
    }

    public int[] getDisponibilidade() {
        return dias;
     
    }
    public void exibirDias() {
        for (int i = 0; i < this.dias.length; i++) {
            System.out.printf("dia %d: %d\n", i, this.dias[i]);
        }
    }

}
