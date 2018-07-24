package firstproject;

public class Str3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name= "Sanjana";
		int indx=name.indexOf('a');
		for(int i=0;i<name.length();i++)
			
			{
				System.out.println(indx);
				indx+=1;
				indx= name.indexOf('a', indx);
				
				
			}
		
		
		
	}

}
