package turing_maschine;

import java.io.IOException;

public class AusprobierDatei {

	public static void main(String[] args) throws IOException {
	TM unsereTM = new TM("TM_Datei.txt");
	TM_Debugger.debugManually(unsereTM, "aabb");
	
	System.out.println(" ");
	System.out.println(" ");
	
	TM unsereTM1 = new TM("TM_Datei.txt");
	TM_Debugger.debugRechnung(unsereTM1, "aabb");
	
	System.out.println(" ");
	System.out.println(" ");
	
	TM unsereTM2 = new TM("TM_Datei.txt");
	TM_Debugger.debugRechnungUntil(unsereTM2, "aabb", 2);
	}

}
