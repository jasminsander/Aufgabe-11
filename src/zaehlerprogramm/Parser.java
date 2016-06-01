package zaehlerprogramm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Parser {

	private static String fileTitle;
	private List<String> Programm = new ArrayList<String>();
	private List<Zaehler> zaehlerlist = new ArrayList<Zaehler>();

	public Parser(String txt) {
		Parser.fileTitle = txt;
	}

	void lies() throws IOException {

		BufferedReader br = new BufferedReader(new FileReader(fileTitle));
		String line = br.readLine();

		// while Zählerprogramm wird gelesen
		while (line != null) {

			Programm.add(line);
			line = br.readLine();

		}

		// schließt die Datei wieder
		br.close();
	}

	void compile() {
		Programm.forEach((String c) -> this.check(c));
		zaehlerlist.forEach((Zaehler c) -> System.out.println(c.getZaehler()));
	}

	void check(String line) {
		int i = 1;

		if (line.contains("c =")) {
			zaehlerlist
					.add(new Zaehler("c" + i, Integer.valueOf(line.substring((line.indexOf("=") + 2), line.length()))));
			i++;
			System.out.println(zaehlerlist);
		} else if (line.contains("++")) {
			// Zählerdekrement
			zaehlerlist.get(Integer.valueOf(line.substring((line.indexOf("c") + 1), (line.indexOf("++") - 1))) - 1)
					.dekrement();
		} else if (line.contains("--")) {
			// Zählerinkrement
			zaehlerlist.get(Integer.valueOf(line.substring((line.indexOf("c") + 1), (line.indexOf("--") - 1))) - 1)
					.inkrement();
		} else if (line.contains("if")) {
			// Sprung
			Integer zaehlerWert = zaehlerlist
					.get(Integer.valueOf(line.substring((line.indexOf("c") + 1), (line.indexOf("c") + 2))))
					.getZaehler();
			Integer kennziffer = Integer.valueOf(line.substring((line.indexOf("th") - 2), (line.indexOf("th") - 1)));
			Zaehler fall1 = zaehlerlist
					.get(Integer.valueOf(line.substring((line.indexOf("b") + 1), (line.indexOf("b") + 2))));
			Zaehler fall2 = zaehlerlist
					.get(Integer.valueOf(line.substring((line.indexOf("se") + 4), (line.indexOf("se") + 5))));
			if (line.contains("==")) {
				System.out.println(this.Sprung((zaehlerWert == kennziffer), fall1, fall2));
			}
		}
	}

	private Zaehler Sprung(boolean Fall, Zaehler eins, Zaehler zwei) {
		if (Fall == true) {
			return (eins);
		} else {
			return (zwei);
		}
	}

}