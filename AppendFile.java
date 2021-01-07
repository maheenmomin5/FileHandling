package filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class AppendFile extends WriteFile {
	
	public void append() throws IOException {
		
		File filePath = new File("myFile.txt");
		String appendText = "hello world";
		
		if(!filePath.exists()){
	    	   filePath.createNewFile();
	    	}
	    	//Here true is to append the content to file
	    	FileWriter fw = new FileWriter(filePath,true);
	    	//BufferedWriter writer give better performance
	    	BufferedWriter bw = new BufferedWriter(fw);
	    	bw.write(appendText);
	    	//Closing BufferedWriter Stream
	    	bw.close();
		System.out.println("Data successfully appended at the end of file");
	
	}
}