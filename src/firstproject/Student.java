package firstproject;

public class Student {
	
	String Studentname;
	double m1;
	double m2;
	double m3;
	String grade;
	int result;
	public void calculateResult()
	{
		if(m1>=35 && m2>=35 && m3>=35)
		{
			System.out.println("Pass");
		}
		
	}
	public void calculateGrade()
	{
		if(m1>90 && m2>90 && m3>90)
		{
			System.out.println("A");
		}
		else if(m1>80 && m2>80 && m3>80)
		{
			System.out.println("B");
		}
		else
			System.out.println("c");
	}
	
	public void display()
	{
		
	}
	
	
	
	
	

}
