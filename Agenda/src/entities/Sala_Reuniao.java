package entities;
public class Sala_Reuniao {
    public ListaLigada pessoas;

    public Sala_Reuniao(ListaLigada pessoas) {
        this.pessoas = pessoas;
    }

    
    

    
    
    public void verificarDisponibilidade(int diaDaReuniao) {

    	for (Celula celula = pessoas.getPrimeira(); celula != null; celula = celula.getProxima()) {
    		People pessoa = (People) celula.getElemento();
    		Agenda agenda = pessoa.getAgenda();
    		int[] disponibilidade = agenda.getDisponibilidade();
            if (diaDaReuniao < 1 || diaDaReuniao > disponibilidade.length) {
                System.out.println("Dia fora do intervalo válido (1 a 31).");
                return;
            }

            if (disponibilidade[diaDaReuniao] == 1) {
                System.out.println("A data não está disponível para a reunião.");
                return;
            }
            disponibilidade[diaDaReuniao] = 1;
            	
            }
            
    	System.out.println("Reunião Marcada para o dia: "+diaDaReuniao);
        }
    	

        
      
        

}