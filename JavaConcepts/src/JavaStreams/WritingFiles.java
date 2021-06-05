package JavaStreams;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFiles {

	public static void main(String[] args) throws IOException {

		//Stream connectivity
		File f = new File("C:\\FileWriting\\myTextFile.txt");
		FileWriter fw = new FileWriter (f);
		BufferedWriter writer = new BufferedWriter(fw);
		
		//writing inside the file
		writer.write("First Line");
		writer.newLine();
		writer.write("India");
		writer.newLine();
		writer.write("Way2Automation");
		writer.newLine();
		writer.write("Dhoni");
		
		//close stream
		writer.close();
		
		System.out.println("File Created!!");
		
		
	}
	
			
	
	
	

}
