package zaehlerprogramm;

import java.io.IOException;

import org.junit.Test;

public class ParserTest {
	
	@Test
	public void test() throws IOException {
		/**
		 * gibt alle Files im Ordner aus
		 */
		//File file = new File(".");
		//for(String fileNames : file.list()) System.out.println(fileNames);
		
		Parser test = new Parser("Zaehlerprogramm.txt");
		test.lies();
		test.compile();
		
	}

}
