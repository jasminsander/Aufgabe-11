package turing_maschine;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class TM {
	final char LEER_FELD = '#';
	List<Zustand> zustaende = new ArrayList<Zustand>();
	List<Character> eingabesymbole= new ArrayList<Character>();
	List<Character> bandsymbole= new ArrayList<Character>();
	Zustand startzustand;
	List<Zustand> endzustaende = new ArrayList<Zustand>();
	String eingabeband;
	String startkonfiguration = startzustand + eingabeband;
	
	public void initialisiere(File tm_datei) {
	}
	
	public void naechste_konfiguration() {
		
	}
	
	public void rechnung(int schrittzahl) {
		
	}
	
	public void rechnung() {
		
	}
}
