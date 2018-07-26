package firstproject;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Filewriter1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw= new FileWriter("D:\\java\\file_out2.txt");
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write("First line");
		bw.newLine();
		bw.write("second line");
		bw.newLine();
		bw.write("third line");
		bw.newLine();
		bw.close();
		fw.close();
		System.out.println("Created");
		

	}

}
