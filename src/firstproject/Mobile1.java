package firstproject;

public class Mobile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m1= new Mobile();
		m1.brandname="samsung";
		m1.color="red";
		m1.price=20000.0;
		m1.resolution=80;
		System.out.println(m1.color);
		System.out.println(m1.brandname);
		System.out.println(m1.price);
		System.out.println(m1.resolution);
		
		m1.makeACall();
		m1.getDiscount();
		
		
		
		

	}

}
