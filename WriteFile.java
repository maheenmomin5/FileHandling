package filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

	public class WriteFile {
	
	File write = new File("myFile.txt");
	
	public void write() {
		try {
			FileWriter writer = new FileWriter("MyFile.txt", true); 
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
			
			bufferedWriter.write("Hello everyone ");
			bufferedWriter.newLine();
			bufferedWriter.write("How are you? ");
				
			bufferedWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void append() throws IOException {
		
		File filePath = new File("myFile.txt");
		String appendText = "hello world";
		
		if(!filePath.exists()){
	    	   filePath.createNewFile();
	    	}
	    	FileWriter fw = new FileWriter(filePath,true);
	    	BufferedWriter bw = new BufferedWriter(fw);
	    	bw.write(appendText);
	    	bw.close();
		System.out.println("Data successfully appended at the end of file");
	
		}
	}
	
	