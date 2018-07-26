package firstproject;
import java.io.*;

public class Scan1 {

	public static void main(String[] args) throws IOException {
		//How to read a single character
		System.out.println("Please enter a character");
		int x= System.in.read();
		System.out.println("You have Entered as "+(char)x);
	}

}
