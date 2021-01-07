package filehandling;

import java.io.FileReader;
import java.io.IOException;

public class ActionClass {
	
	public static void main (String[] args) {
		
		ReadFile file = new ReadFile();
		file.write();
		file.read();
		try {
			file.append();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
