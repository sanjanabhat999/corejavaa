package firstproject;

public class Employee2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e2=new Employee();
		Employee e1= new Employee(123, "ab",5600.0);
		double bonus= e1.calculateBonus();
		System.out.println(Employee.getCompanyName());
		
		System.out.println(e2.getCompanyName());
		
		

	}

}
