package zaehlerprogramm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Parser {

	private static String fileTitle;
	
	public Parser(String txt){
		Parser.fileTitle = txt;
	}
		void lies() throws IOException
	    {
			
	            BufferedReader br = new BufferedReader(new FileReader(fileTitle));
	            String fileRead = br.readLine();

	            // while Z‰hlerprogramm wird gelesen
	            while (fileRead != null)
	            {

	            	String[] programmzeile = fileRead.split(",");
	            	this.check(programmzeile.toString());

	            	System.out.println(Arrays.toString(programmzeile));
	            		
	                fileRead = br.readLine();
	            
	            }

	            // schlieﬂt die Datei wieder
	            br.close();
	        }
		
		private void check(String programmzeile){
			if(programmzeile.contains("c =")){
				// Z‰hler dekleration
			}else if (programmzeile.contains("++")) {
				//Z‰hlerdekrement
			}else if (programmzeile.contains("--")){
				//Z‰hlerinkrement
			}else if (programmzeile.contains("if")){
				//Sprung
			}
		}
}

