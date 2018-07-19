package firstproject;

public class ARRAY1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {20,27,12,60,76};
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
			
		}
		System.out.println();
		for (int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		int flag=0;
		
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]==26)
			{
				flag= 1;
			break;
		
		    }
		}
		if(flag==1)
		{
			System.out.println("found");
		}
		else
		{
			System.out.println("not found");
		}
	}
}

		

	
		


