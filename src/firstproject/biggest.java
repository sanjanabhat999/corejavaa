package firstproject;

public class biggest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double prod1, prod2, prod3;
		prod1=20.0;
		prod2=40.0;
		prod3=50.0;
		if(prod1>prod2)
		{
			 if(prod1>prod3)
			 {
			System.out.println(prod1+"is the largest");
			 }
			 else
				 System.out.println(prod3+"is the largest");
			 }
			 
			 else
			 {
				 if(prod2>prod3)
				 {
					 System.out.println(prod2+"is the largest");
					 
				
				 }
				 else
					 System.out.println(prod3+"is the largest");
			 }
			 

	}

}
