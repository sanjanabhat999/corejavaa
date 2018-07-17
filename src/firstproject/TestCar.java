package firstproject;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1= new Car();
		Car car2= new Car();
		Car car3= new Car();
		Car car4= new Car();
		Car car5= new Car();
		car1.setCarDetails("Volkswagen", 60, 1000000, true);
		car2.setCarDetails("mercedes", 80, 1000005, true);
		car3.setCarDetails("maruti", 60, 10000, false);
		car4.setCarDetails("A", 60, 50000, true);
		car5.setCarDetails("B", 100, 2000000, true);
		car1.printCarDetails();
		car2.printCarDetails();
		car3.printCarDetails();
		car4.printCarDetails();
		car5.printCarDetails();
		
		Car arr[]= {car1,car2,car3,car4,car5};
		double max=0.0;
		String carname = null;
		for (Car hi : arr) {
			if(hi.price>max)
			{
				carname=hi.carName;
				max=hi.price;
			}
			
		}
		
		System.out.println(carname);

	}

}
