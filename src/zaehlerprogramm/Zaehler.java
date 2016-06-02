package zaehlerprogramm;

public class Zaehler {
	public String name;
	public int zaehler;
	
	public Zaehler(String name, int zaehler) {
		this.name = name;
		this.zaehler = zaehler;
	}

	public void dekrement(){
		zaehler--;
	}
	
	public void inkrement(){
		zaehler++;
	}
	
	public String getName() {
		return  name;
	}
	
	public int getZaehler() {
		return zaehler;
	}

	@Override
	public String toString() {
		return "Zaehler [name=" + name + ", zaehler=" + zaehler + "]";
	}
	
}
