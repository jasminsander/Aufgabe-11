package turing_maschine;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TM {
	final char LEER_FELD = '#';
	List<Zustand> zustaende = new ArrayList<Zustand>();
	List<Character> eingabesymbole= new ArrayList<Character>();
	List<Character> bandsymbole= new ArrayList<Character>();
	Zustand startzustand;
	List<Zustand> endzustaende = new ArrayList<Zustand>();
	Map<String, String> konfigurationen = new HashMap<String, String>();
	
	public void initialisiere(File tm_datei) {
		zustaende = TM_Parser.parse_zustaende(tm_datei);
		eingabesymbole = TM_Parser.parse_eingabesymbole(tm_datei);
		bandsymbole = TM_Parser.parse_bandsymbole(tm_datei);
		startzustand = TM_Parser.parse_startzustand(tm_datei);
		endzustaende = TM_Parser.parse_endzustaende(tm_datei);
		konfigurationen = TM_Parser.parse_konfiguration(tm_datei);
	}
	
	public void naechste_konfiguration() {
		
	}
	
	public void rechnung(int schrittzahl) {
		
	}
	
	public void rechnung() {
		
	}
}
