package firstproject;

class Restaurant
{
	public synchronized void takeLunch(String Menu)
	{   System.out.print("!");
		System.out.print(Menu);
		System.out.print("!");
	}
}

class Restaurant1 extends Thread{
	String Menu;
	Restaurant r1;
	 Restaurant1(String Menu, Restaurant r1) {
		
		this.Menu = Menu;
		this.r1 = r1;
	}
	 public void run() {
		 r1.takeLunch(this.Menu);
	 }
	
	
}

public class Sychronizeddemo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Restaurant r2=new Restaurant();
		Restaurant1 r3= new Restaurant1("a", r2);
		Restaurant1 r4= new Restaurant1("M",r2);
		r4.setPriority(Thread.MAX_PRIORITY);
		r3.start();
//		Thread.sleep(5000);
		r4.start();
	
		

	}

}
