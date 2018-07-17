package firstproject;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"sanj", "priya", "ab","abc","guru"};
		int pos=0;
		int found=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i].equals("guru"))
			{
				found=1;
				pos=i;
				
				
			}
			
		}
		if(found==1)
		{
			System.out.println(pos);
		}
		else
			System.out.println("not found");

	}

}
