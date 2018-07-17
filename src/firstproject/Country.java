package firstproject;

public class Country {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String country[]= {"India","albania","angola","austria","australia"};
		String capital[]= {"New Delhi","Tirana","Luanda","vienna","canberra"};
		int pos=0;
		for(int i=0;i<=country.length-1;i++)
		{
			if(country[i].equals("albania"))
			{
				 pos=i;
			}
		}
		System.out.println(capital[pos]);

	}
	
	
	

}

