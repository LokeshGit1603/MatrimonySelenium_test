package Automation.Selenium_test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UsingFilereader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String location = "Usingpath.txt";
		
		FileReader fileReader = new FileReader(location);
		
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		String reader;
		
		while((reader = bufferedReader.readLine()) != null)
				{
			System.out.println(reader);
				}
		
	

	}

}
