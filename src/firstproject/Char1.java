package firstproject;

public class Char1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a= args[0];
		int c=0;
		
	    for(int i=0;i<a.length();i++)
	    {
	           if(a.charAt(i)=='C' || a.charAt(i)=='c')
	           {
	        	   c++;
	           }
	    }
	    System.out.println("frequency:"+c);

	}

}
