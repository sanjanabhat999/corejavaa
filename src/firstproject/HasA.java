//@Author-Sanjana      Date- 19-07-2018

package firstproject;

class Emp5
{
	double salary;
	String name;
	int eid;
	String dept;
	Address add;
	 
	Emp5(double salary, String name, int eid, String dept, Address add) {
		super();
		this.salary = salary;
		this.name = name;
		this.eid = eid;
		this.dept = dept;
		this.add = add;
	}
	
	public void printEmployeeDetails()
	 {
		 System.out.println(this.name);
		 System.out.println(this.eid);
		 System.out.println(this.dept);
		 add.printAddress();
		 
	}
}
	 
	 class Address
	 {
		 String flatName;
		 String Main;
		 String cross;
		 int flatno;
		 String city;
		 int pincode;
		
		 Address(String flatName, String main, String cross, int flatno, String city, int pincode) {
			super();
			this.flatName = flatName;
			Main = main;
			this.cross = cross;
			this.flatno = flatno;
			this.city = city;
			this.pincode = pincode;
		}
		 
		 public void printAddress()
		 {
			 System.out.println(this.flatName);
			 System.out.println(this.Main);
			 System.out.println(this.cross);
			 System.out.println(this.flatno);
			 System.out.println(this.city);
			 System.out.println(this.pincode);
			 
		 }
		
	 }
	 
	
	
	

public class HasA {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address a=new Address("Shantineketan","7th main","8th Cross",112,"Bangalore",560009);
		Emp5 e= new Emp5(12345.6,"Peter",123,"Finance",a);
		e.printEmployeeDetails();

	}

}
