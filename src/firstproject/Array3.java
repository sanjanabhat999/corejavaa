package firstproject;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,50,2,5,25};
		int sum=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2==0)
			{
				sum+=arr[i];
			}
			
		}
		System.out.println(sum);
		

	}

}
