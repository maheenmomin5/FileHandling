package filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile extends WriteFile {
	
	public void read() {
		
		try {
			BufferedReader reader = new BufferedReader (new FileReader ("MyFile.txt"));
			String a;
				
			while ((a = reader.readLine()) != null) {
				System.out.println(a);
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
			}
		}
	}



