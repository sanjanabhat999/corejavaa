package firstproject;
import java.util.*;

class Mobile2 {
	String name;
	int price;
	public Mobile2(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	
	
	@Override
	public String toString() {
		
		return this.name+"-"+this.price;
	}	
	
	
	@Override
	
	public boolean equals(Object obj) {
		Mobile2 mm=(Mobile2)obj;
		if(this.name.equals(mm.name) && this.price== mm.price)
			return true;
		else
			return false;
	}
	
	@Override
	public int hashCode() {
		return this.price*5;
	}
	

}

public class SethashDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile2 m1= new Mobile2("Samsung",1000);
		Mobile2 m2= new Mobile2("Samsung",1000);
		Mobile2 m3= new Mobile2("Samsung",10001);
		
		HashSet hs=new HashSet();
		hs.add(m1);
		hs.add(m2);
		hs.add(m3);
		
		System.out.println(hs);
		
		
		
		
		

	}

}
