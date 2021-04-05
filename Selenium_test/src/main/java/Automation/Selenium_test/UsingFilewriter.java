package Automation.Selenium_test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UsingFilewriter {

	public static void main(String[] args) throws IOException {
		
		String location = "UsingFileWriting.txt";
		String content = "I'm File Writer";
		
		String location1 = "UsingBufferedWriting.txt";
		String content1 = "I'm Buffered Writer";
		
		String location2 = "UsingFOSWriting.txt";
		String content2 = "I'm FileOutputStream";
		
		String location3 = "Usingpath.txt";
		String content3 = "I'm Path Writer";
		
		/*
		 * FileWriter fileWriter = new FileWriter(location); fileWriter.write(content);
		 * fileWriter.close();
		 */
		
		/*
		 * FileWriter fileWriter = new FileWriter(location1); BufferedWriter
		 * bufferedWriter = new BufferedWriter(fileWriter);
		 * bufferedWriter.write(content1); bufferedWriter.close();
		 */

		
		  FileOutputStream fileOutputStream = new FileOutputStream(location2); 
		  byte[] towrite = content2.getBytes(); fileOutputStream.write(towrite);
		  fileOutputStream.close();
		 
		
		/*
		 * Path path = Paths.get(location3); Files.write(path, content3.getBytes());
		 */
	}

}
