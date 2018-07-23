package firstproject;
interface TVRemote{
	public void switchoff();
	public void switchon();
	public void changeChannel();
	public void increaseVolume();
	public void decreaseVolume();
	
}

class samsungTV implements TVRemote{

	@Override
	public void switchoff() {
		// TODO Auto-generated method stub
		System.out.println("SWitching off");
		
	}

	@Override
	public void switchon() {
		// TODO Auto-generated method stub
		System.out.println("SWitching on");
		
	}

	@Override
	public void changeChannel() {
		// TODO Auto-generated method stub
		System.out.println("Changing Channel");
	}

	@Override
	public void increaseVolume() {
		// TODO Auto-generated method stub
		System.out.println("Increasing Volume");
		
	}

	@Override
	public void decreaseVolume() {
		// TODO Auto-generated method stub
		System.out.println("Decreasing Volume");
	}
	
}
class sonyTV implements TVRemote{
	@Override
	public void switchoff() {
		// TODO Auto-generated method stub
		System.out.println("SWitching off");
		
	}

	@Override
	public void switchon() {
		// TODO Auto-generated method stub
		System.out.println("SWitching on");
		
	}

	@Override
	public void changeChannel() {
		// TODO Auto-generated method stub
		System.out.println("Changing Channel");
	}

	@Override
	public void increaseVolume() {
		// TODO Auto-generated method stub
		System.out.println("Increasing Volume");
		
	}

	@Override
	public void decreaseVolume() {
		// TODO Auto-generated method stub
		System.out.println("Decreasing Volume");
	}
	
	
	
}

public class Interface1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		samsungTV s=new samsungTV();
		s.changeChannel();
		s.decreaseVolume();
		s.increaseVolume();
		s.switchoff();
		s.switchon();
		System.out.println();
		
		sonyTV t= new sonyTV();
		t.changeChannel();
		t.decreaseVolume();
		t.increaseVolume();
		t.switchoff();
		t.switchon();
		

	}

}
