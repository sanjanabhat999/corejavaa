package firstproject;

import java.io.File;
import java.io.IOException;

public class File3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f= new File("D://test/mynewfile");
		if(f.exists())
		{
			System.out.println("file exists");
			boolean dstatus= f.delete();
			if(dstatus)
				System.out.println("Deleted");
			else
				System.out.println("already Deleted");
		}else
		{
			System.out.println("File doesnt exist");
			boolean cstatus= f.createNewFile();
			if(cstatus)
				System.out.println("created");
			else
				System.out.println("problem creating file");
		}
		
			
		
	}

}
