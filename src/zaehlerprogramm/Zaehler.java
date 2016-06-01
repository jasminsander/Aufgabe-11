package zaehlerprogramm;

public class Zaehler {
	public int zaehler;
	public String name;
	
	public Zaehler(String name, int zaehler) {
		this.name = name;
		this.zaehler = zaehler;
	}

	public void dekrement(){
		this.zaehler++;
	}
	
	public void inkrement(){
		this.zaehler--;
	}
	
	public String getName() {
		return name;
	}
	
	public int getZaehler() {
		return zaehler;
	}

	
	
}
