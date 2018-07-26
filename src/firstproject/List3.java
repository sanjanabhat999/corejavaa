package firstproject;

import java.util.ArrayList;

public class List3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList aList3= new ArrayList();
		aList3.add("a");
		aList3.add("b");
		aList3.add("c");
		aList3.add("d");
		
		ArrayList aList4= new ArrayList();
		aList4.add("a");
		aList4.add("b");
		aList4.add("f");
		aList4.add("j");
		
		aList3.retainAll(aList4);
		System.out.println(aList3);

	}

}
