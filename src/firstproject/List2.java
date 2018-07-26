package firstproject;
import java.util.*;

public class List2 {

	public static void main(String[] args) {
		ArrayList aList1= new ArrayList();
		aList1.add("1");
		aList1.add("2");
		aList1.add("3");
		aList1.add("4");
		
		ArrayList aList2= new ArrayList();
		aList2.add("5");
		aList2.add("6");
		aList2.add("7");
		aList2.add("8");
		
		aList1.addAll(aList2);
		
		System.out.println(aList1);
		
		
		ArrayList aList5= new ArrayList();
		aList1.add("x");
		aList1.add("y");
		aList1.add("z");
		aList1.add("l");
		System.out.println(aList5);
		
	   Collections.unmodifiableList(aList5);
	   System.out.println(aList5);
		
		
		
		
		
		
		
		
		
		
		

	}

}
