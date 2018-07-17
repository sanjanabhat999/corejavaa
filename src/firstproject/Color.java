package firstproject;

public class Color {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String basket1[]= {"red","orange","red","black","white","red","orange","red","black","white"};
		String basket2[]= {"red","orange","red","black","white","red","orange","red","black","violet"};
		int count=0;
		for(int i=0;i<=basket1.length-1;i++)
		{
			if(basket1[i].equals("red"))
			{
				count++;
			}
		}
		for(int i=0;i<=basket2.length-1;i++)
		{
			if(basket2[i].equals("red"))
			{
				count++;
			}
		}
		System.out.println(count);
		
		

	}

}
