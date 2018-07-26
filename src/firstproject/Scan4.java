package firstproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Scan4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter Your name");
		String name= br.readLine();
		
		System.out.println("Welcome "+name);
		
		System.out.println("Enter Your city");
		String city= br.readLine();
		
		System.out.println("You are living in "+city);
		
		

	}

}
