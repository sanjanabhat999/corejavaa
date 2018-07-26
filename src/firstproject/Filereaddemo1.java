package firstproject;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
public class Filereaddemo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis= new FileInputStream("file.txt");
		int xx= fis.read();
		while(xx!=-1)
		{
			System.out.print((char)xx);
			xx= fis.read();
		}
		fis.close();
	}

}




