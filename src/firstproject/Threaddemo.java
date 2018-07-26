package firstproject;

class NumberThread extends Thread
{
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(int i=1;i<=5;i++)
			System.out.print(i);
			
	}
}

class AlphaThread extends Thread{
	public void run()
	{
		for(char c='A';c<='E';c++)
			System.out.print(c);
	}
}

public class Threaddemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NumberThread nt = new NumberThread();
//		nt.setName("run");
		nt.start();
//		System.out.println(Thread.currentThread().getName());
		
		AlphaThread at= new AlphaThread();
		at.start();
		
	}

}
