package firstproject;

import java.io.*;

public class File4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// File f= new File("D://test/mynewfile");
		// boolean created = f.createNewFile();
		// if(created==true)
		// System.out.println("File created");
		// else
		// System.out.println("File couldn't create");

		File f = new File("D://test/folder1");
		boolean status = f.mkdir();
		if (status)
			System.out.println("folder created");
		else
			System.out.println("Folder couldn't create");

	}

}
