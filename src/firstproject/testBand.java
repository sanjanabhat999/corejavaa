package firstproject;

public class testBand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Band b1= new Band();
		Band b2= new Band();
		
		String singers[]= {"a","b"};
		String guitarists[]= {"c","d"};
		
		b1.setBandDetails("maroon5",singers,guitarists, "Joey", "jon snow");
		b1.printBandDetails();
		
		String singers1[]= {"e","f","g"};
		String guitarists1[]= {"c","d"};
		
		b2.setBandDetails("maroon6",singers1,guitarists1, "Jo", "han solo");
		b2.printBandDetails();
		

	}

}
