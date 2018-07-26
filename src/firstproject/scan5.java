package firstproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class scan5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter 1st ");
		int a = Integer.parseInt(br.readLine());
		
		System.out.println("Enter 2nd number");
		int b = Integer.parseInt(br.readLine());
		
		System.out.println("Enter 3rd number");
		int c = Integer.parseInt(br.readLine());
		
		System.out.println("Enter 4th number");
		int d = Integer.parseInt(br.readLine());
		
		System.out.println("Enter 5th number");
		int e = Integer.parseInt(br.readLine());
		
		int avg= (a+b+c+d+e)/5 ;
		System.out.println(avg);

	}

}
