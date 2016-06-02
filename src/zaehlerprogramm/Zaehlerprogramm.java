package zaehlerprogramm;

import java.io.IOException;
import java.util.List;

public class Zaehlerprogramm {
	private List<Zaehler> zaehlerliste;
	private List<String> programm;
	int aktuelleProgrammzeile = 0;

	public Zaehlerprogramm(String txt_File) throws IOException {
		Parser Temp = new Parser(txt_File);
		Temp.compile();
		this.zaehlerliste = Temp.getZaehler();
		this.programm = Temp.getCode();
		System.out.println("Eingabe:");
		zaehlerliste.forEach(c -> System.out.println(c.toString()));
	}

	private void ausfuehren(Integer aktuelleZeile) {
		String ausfuehren = programm.get(aktuelleZeile);
		if (ausfuehren.contains("++")) {
			doInkrement(Integer.valueOf(ausfuehren.substring(1, 2)));
			aktuelleProgrammzeile ++;
		} else if (ausfuehren.contains("--")) {
			doDekrement(Integer.valueOf(ausfuehren.substring(1, 2)));
		    aktuelleProgrammzeile ++;
		} else if (ausfuehren.contains(":")){
			if(ausfuehren.contains("==")){
			Integer zaehler = Integer.valueOf(ausfuehren.substring(1, 2));
			Integer kennziffer = Integer.valueOf(ausfuehren.substring(4, 5));
			Integer fall1 = Integer.valueOf(ausfuehren.substring(6, 7));
			Integer fall2 = Integer.valueOf(ausfuehren.substring(8, 9));
			doSprung((zaehlerliste.get(zaehler-1).getZaehler()) == kennziffer, fall1, fall2);
		}
		}
	}

	public void programmAusfuehren() {
		while (aktuelleProgrammzeile < programm.size()) {
			ausfuehren(aktuelleProgrammzeile);
		}
		System.out.println("Ergebnis:");
		zaehlerliste.forEach(c -> System.out.println(c.toString()));
	}

	private void doInkrement(Integer zaehler) {
		zaehlerliste.get(zaehler-1).inkrement();
	}

	private void doDekrement(Integer zaehler) {
		zaehlerliste.get(zaehler-1).dekrement();
	}

	private void doSprung(boolean bedingung, Integer fall1, Integer fall2) {
		if(bedingung == true){
			this.aktuelleProgrammzeile = fall1; 
		}else{
			this.aktuelleProgrammzeile = fall2;
		}

	}
}
