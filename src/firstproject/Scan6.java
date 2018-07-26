package firstproject;

import java.io.*;

public class Scan6 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int max=0, num=0;
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter your numbers: ");
			 num = Integer.parseInt(br.readLine());
			if (num> max) {
				max = num;
			}
		}
		System.out.println(max);

	}

}
