package firstproject;

public class PasswordValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password= "He$loW0rld";
		char pass[]= password.toCharArray();
		int sp=0;
		int up=0;
		int dig=0;
		int wc = 0;
		int lw=0;
		
		
		
		for(int i=0;i<pass.length;i++)
		{
			if(Character.isUpperCase(pass[i]))
			{
				
				up= up+1;
				
			}
			
			else if(Character.isDigit(pass[i]))
			{
				
				dig=dig+1;
			}
			else if(Character.isWhitespace(pass[i]))
			{
				wc=wc+1;
			}
			else if(Character.isLowerCase(pass[i]))
			{
				lw=lw+1;
			}
			else 
				sp=sp+1;
			
		}
		
		if(pass.length>=5 && pass.length<=10 && up>=1 && dig>=1 && sp>=1 && wc==0 && lw>=1)
		{
			System.out.println(" Valid password");
		}
		
		else
		{
			System.out.println(" invalid");
		}
		
		

	}

}
