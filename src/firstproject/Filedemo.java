package firstproject;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Filedemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr= new FileReader("file.txt");
		BufferedReader br= new BufferedReader(fr);
		int flag=0;
		String line=br.readLine();
		while(line!=null)
		{
			if(line.contains("java")) {
				flag=1;
				break;
			}
			line= br.readLine();
		}
		
		if(flag==1)
			System.out.println("Success");
		else
			System.out.println("word not found");
		fr.close();

	}

}
