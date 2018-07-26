package firstproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Scan3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter a number");
		int a = Integer.parseInt(br.readLine());
		
		if(a%3 == 0)
			System.out.println(a+" is divisible by 3");
		else
			System.out.println(a+" is not divisible by 3");
			

	}

}
