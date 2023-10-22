package Main;

import entities.ListaLigada;
import entities.People;
import entities.Sala_Reuniao;

public class Main {

	public static void main(String[] args) {
		
		
		People p1 = new People("joao");
	    People p2 = new People("caio");
	    People p3 = new People("ana");
	    People p4 = new People("pedro");
	    People p5 = new People("maria");

	    ListaLigada pessoas = new ListaLigada();
	    pessoas.adicionarNo(p1);
	    pessoas.adicionarNo(p2);
	    pessoas.adicionarNo(p3);
	    pessoas.adicionarNo(p4);
	    pessoas.adicionarNo(p5);

	    Sala_Reuniao reuniao_dia_10 = new Sala_Reuniao(pessoas);
	    
	    
	    reuniao_dia_10.verificarDisponibilidade(10);
	    
	 
	    p1.getAgenda().exibirDias();
	    System.out.println("-------------------------");
	    p2.getAgenda().exibirDias();
	    System.out.println("-------------------------");
	    p3.getAgenda().exibirDias();
	    System.out.println("-------------------------");
	    p4.getAgenda().exibirDias();
	    System.out.println("-------------------------");
	    p5.getAgenda().exibirDias();
			
	   Sala_Reuniao reuniao2 = new Sala_Reuniao(pessoas);
	   reuniao2.verificarDisponibilidade(10);
		
		

	}



}
