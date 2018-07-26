package firstproject;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Filewritedemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos= new FileOutputStream("D:\\java\\file_out1.txt");
		DataOutputStream dos= new DataOutputStream(fos);
		
		dos.writeBytes("hello world\n");
		dos.writeBytes("hello world");
		
		dos.close();
		fos.close();
		System.out.println("check now");
		

	}

}
