package firstproject;

public class EnumDemo {
	enum weekday  {sunday,monday,tuesday,wednesday,thursday,friday,saturday};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		weekday w[]= weekday.values();
//		for(weekday w1:w)
//		{
//			System.out.println(w1);
//		}
//		System.out.println(weekday.tuesday);
		
//		weekday w1;
//		w1= weekday.tuesday;
//		if(w1==weekday.friday)
//		{
//			System.out.println("Its weekend!");
//		}
//		else
//		{
//			System.out.println("Not yet weekend");
//		}
//		
//		Double D=new Double(123.4);
//		System.out.println(D.MAX_VALUE);
//		System.out.println(D.MAX_EXPONENT);
//		
//		String s1= "123";
//		String s2= "564";
//		
//		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
//		System.out.println(s1+s2);
		
		int k= 878;
		Integer kk= new Integer(k);
		System.out.println(Integer.toBinaryString(k));
		System.out.println(kk.toBinaryString(k));
	}

}
