package firstproject;

public class sal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sal= 55555.55;
		double tax= sal*(20.0/100);
		double bonus= sal*(15.0/100);
		double spend= sal*(15.0/100);
		double lunch =sal*(50.0/100);
		double save;
		save= (sal+bonus-tax-spend-lunch);
		System.out.println(save);
		
	}

}
