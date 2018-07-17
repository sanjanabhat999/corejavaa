package firstproject;

public class Car {
	String carName;
	double mileage;
	double price;
	boolean luxuryType;
	
	public void setCarDetails(String carName, double mileage, double price, boolean luxuryType)
	{
		this.carName=carName;
		this.mileage=mileage;
		this.price=price;
		this.luxuryType= luxuryType;
	}
	
	public void printCarDetails()
	{
		System.out.println(this.carName);
		System.out.println(this.mileage);
		System.out.println(this.price);
		System.out.println(this.luxuryType);
	}
	
	
	

}
