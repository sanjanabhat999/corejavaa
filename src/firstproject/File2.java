package firstproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class File2 {

	public  static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw= new FileWriter("D:\\java\\myinput.txt");
		BufferedWriter bw= new BufferedWriter(fw);
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		String line=null;
		
		System.out.println("Enter a line:");
		line= br.readLine();
		
	
		while(!(line.equalsIgnoreCase("Stop")))
		{
			bw.write(line);
			
			System.out.println("Enter a line:");
			line= br.readLine();
		}
		System.out.println("created");
		
		
	}

}
