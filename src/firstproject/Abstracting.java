package firstproject;
abstract class Person6 {
	public boolean doesHeBreath()
	{
		System.out.println("Everey Person Breathes ");
		return true;
	}
	public boolean doesHeSleep()
	{
		System.out.println("Every Person Sleeps");
		return true;
	}
	public abstract boolean doesHeDriveCar();
	

}

abstract class Employee6 extends Person6
{
	public abstract boolean doesHeDriveCar();
	
}

class Driver1 extends Employee6
{
	@Override
	public boolean doesHeDriveCar()
	{
		System.out.println("evary driver drives a car");
		return false;
	}
}
	
public class Abstracting {
	public static void main(String[] args) 
	{
		Driver1 d= new Driver1();
		System.out.println("Breathing?"+d.doesHeBreath());
		System.out.println("Sleeping?"+d.doesHeSleep());
		System.out.println("Driving?"+d.doesHeDriveCar());
	 }
	

}
