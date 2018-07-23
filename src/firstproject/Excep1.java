package firstproject;

public class Excep1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		try {
			System.out.println(5/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("can't divide by zero");
		}
		System.out.println("End");

	}

}
