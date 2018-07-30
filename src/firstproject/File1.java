package firstproject;

import java.io.*;

public class File1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		File f= new File("D://test/mynewfile");
//		if(f.isDirectory())
//			System.out.println("it is a folder");
//		else
//			System.out.println("it is a file");
		
		File f= new File("D://test/mynewfile");
		if(f.canRead())
			System.out.println("This file/folder is readable");
		if(f.canWrite())
			System.out.println("This file/folder is writable");
		
	
//		String[] allfiles= f.list();
//		
//		for (int i=0;i<allfiles.length;i++) {
//			System.out.println(allfiles[i]);
			
//		}

	}

}
