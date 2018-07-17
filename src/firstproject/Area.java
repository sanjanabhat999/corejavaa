package firstproject;

class square{
	double x;
}
class triangle{
	double base, height;
}
class circle{
	double rad;
}

public class Area {
	
	public static double calculateArea(square a )
	{
		return (a.x*a.x);
	}

	public double calculateArea(triangle b,triangle h )
	{
		return (0.5*b.base*h.height);
	}
	
	public static double calculateArea(circle n)
	{
		return (3.1415*n.rad);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle c=new circle();
		c.rad=9;
		System.out.println(calculateArea(c));
		
		square b=new square();
		b.x=5;
		System.out.println(calculateArea(b));
		
		
		

	}

}
