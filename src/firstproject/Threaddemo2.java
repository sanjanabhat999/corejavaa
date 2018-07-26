package firstproject;
class NumberThread1 implements Runnable
{
	public void run() {
		for(int i=1;i<=5;i++)
			System.out.print(i+" ");
	}
}

class AlphaThread1 implements Runnable
{
	public void run()
	{
		for(char c='A';c<='E';c++)
			System.out.print(c+" ");
	}
}
public class Threaddemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread nt = new Thread(new NumberThread1());
		Thread at= new Thread(new AlphaThread1());
		
		
		nt.start();
		at.start();
		
		
	}

}
