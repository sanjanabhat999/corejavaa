package firstproject;

import java.io.*;

public class Scan2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter Your name Please");
		String myName = br.readLine();
		System.out.println("Welcome " + myName);
		System.out.println("Enter your age: ");
		int age = Integer.parseInt(br.readLine());
		System.out.println("Your age is " + age);

	}

}
