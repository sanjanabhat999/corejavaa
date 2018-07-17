package firstproject;
 class cot{
	double price;
}
 
class chair
{
	double price;
}

class diningTable
{
	double price;
}


public class Furniture {
	public double calculateDiscount(cot c)
	{
		return c.price*0.1;
		
	}
	
	public double calculateDiscount(chair cc)
	{
		return cc.price*0.2;
	}
	
	public double calculateDiscount(diningTable dd)
	{
		return dd.price*0.3;
	}
	
   public static void main(String[] args) {
		// TODO Auto-generated method stub
		cot c = new cot();
		c.price=25000;
		chair cc= new chair();
		cc.price=1500;
		diningTable dd= new diningTable();
		dd.price=2500;
		
		Furniture f= new Furniture();
		System.out.println(f.calculateDiscount(cc));
		System.out.println(f.calculateDiscount(c));
		System.out.println(f.calculateDiscount(dd));
		
		
		
		

	}

}
