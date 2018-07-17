package firstproject;

public class Mobile {
	String brandname;
	double price;
	String color;
	int resolution;

	
	public void makeACall()
	{
	System.out.println("Please wait...call connecting");
	}
	
	public double getDiscount()
	{
		double discount=0.0;
		if(this.brandname=="samsung")
		{
			discount= this.price*0.1;		}
		return discount;
	}
	

}
