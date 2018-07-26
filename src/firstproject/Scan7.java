package firstproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Scan7 {

	public static void main(String[] args) throws IOException {
		
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String name=null;
		int city=0;
		System.out.println("Enter the city: ");
		name= br.readLine();
		while(!(name.equalsIgnoreCase("Stop"))) {
			System.out.println("Enter the city: ");
			name= br.readLine();
			city+=1;
			 
			}
		
		
		System.out.println(city);
		

	}

}
