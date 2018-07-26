package firstproject;
class FirstThread extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
		
		for (int i=1; i<=5;i++) {
			System.out.print(i);
		}
		
	}
}

class SecondThread extends Thread{
	public void run() {
		System.out.println();
		System.out.println(Thread.currentThread().getName());
		
		for (int i=15; i<=20;i++) {
			System.out.print(i);
		}
		
	}
}

public class Thread2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstThread ft= new FirstThread();
		ft.setName("MyThread1");
		ft.start();
		
		SecondThread st=new SecondThread();
		st.setName("MyThread2");
		st.start();
		
		
		

	}

}
