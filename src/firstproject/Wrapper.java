package firstproject;

public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String company = "deloitte works for 9 hours *";
		char carray[] = company.toCharArray();

		for (int i = 0; i < company.length(); i++) {
			// char x= carray[i];
			if (Character.isDigit(carray[i]))
				System.out.println("its a digit");
			else if (Character.isAlphabetic(carray[i]))
				System.out.println("its a alphabet");
			else if (Character.isWhitespace(carray[i]))
				System.out.println("its a whitespace");
			else
				System.out.println("its a Special character");
		}

	}

}
