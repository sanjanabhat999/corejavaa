package firstproject;

public class commandLineArg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("you passed \t"+args.length);
		for(int i=0;i<args.length;i++)
		{
			System.out.println("data is \t"+args[i]);
		}

	}

}
