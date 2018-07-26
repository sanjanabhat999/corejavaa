package firstproject;

class Greeting{
	public synchronized void SayHello(String name)
	{
		System.out.print("!");
		System.out.print(name);
		System.out.print("!");
		
		
	}
}

class GreetingThread extends Thread{
	String name;
	Greeting greeting;
	 GreetingThread(String name, Greeting greeting) {
		
		this.name = name;
		this.greeting = greeting;
	}
	 public void run() {
		 greeting.SayHello(this.name);
	 }
	
}

public class Sychronizeddemo  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeting g1= new Greeting();
		GreetingThread g2= new GreetingThread("Mayur",g1);
		GreetingThread g3= new GreetingThread("Sonia",g1);
		g2.start();
		g3.start();
		
		
		

		

	}

}
