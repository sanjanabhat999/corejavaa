package firstproject;

public class emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salary=15000;
		double tax=(0.1*salary);
		double allowance=(0.15*salary);
		double net_sal;
		net_sal=(salary-tax+allowance);
		System.out.println(net_sal);

	}

}
