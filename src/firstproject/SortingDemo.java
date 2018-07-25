package firstproject;

import java.util.*;
class cars implements Comparable{
	String colors;
	String brand;
	double price;
	public cars(String colors, String brand, double price) {
		super();
		this.colors = colors;
		this.brand = brand;
		this.price = price;
	}
	@Override
	public String toString() {
		return this.brand+"-"+this.colors+"-"+this.price ;
	}
	@Override
	public int compareTo(Object o) {
		cars cc=(cars)o;
//		int val=0;
//		if(this.price==cc.price)
//			val= 0;
//		else if(this.price>cc.price)
//			val= 1;
//		else
//			if(this.price<cc.price)
//				val =-1;
//		
//		return val;
		
//		return this.brand.compareTo(cc.brand);
		return this.colors.compareTo(cc.colors);
	}
	
	
}

public class SortingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList a1 = new ArrayList();
//		a1.add("George");
//		a1.add("Victoria");
//		a1.add("Aria");
//		a1.add("Emily");
//		System.out.println(a1);
//		Collections.sort(a1);
//		System.out.println(a1);
		
		cars c1= new cars("BLACK","TATA",737393);
		cars c2= new cars("Aqua","Bugati",737375);
		cars c3= new cars("GREY","BMW",737376);
		cars c4= new cars("White","Ford",737383);
		
		a1.add(c1);
		a1.add(c2);
		a1.add(c3);
		a1.add(c4);
		
		Collections.sort(a1);
		
		System.out.println(a1);
		
		
		

	}

}
