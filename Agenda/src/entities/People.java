package entities;

public class People {
	private String name;
	private Agenda agenda;
	
	public People(String name) {
		this.name = name;
		this.agenda = new Agenda();
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Agenda getAgenda() {
		return agenda;
	}

	public void setAgenda(Agenda agenda) {
		this.agenda = agenda;
	}




}
