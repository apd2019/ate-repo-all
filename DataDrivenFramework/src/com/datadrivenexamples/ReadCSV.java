package com.datadrivenexamples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.Test;

public class ReadCSV {
	
	@Test
	public void ReadCSVExample() throws IOException {
		String file = "./DataDrivenTestDataFiles/userTestData.csv";
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String dataLine;
		
		br.readLine();
		
		while((dataLine = br.readLine())!= null)
		{
			String[] data = dataLine.split(",");
			
			String userID = data[0];
			String userPass = data[1];
			
			System.out.println(userID);
			System.out.println(userPass);
			
			
		}
		
		br.close();
	}
}
