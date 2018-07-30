package firstproject;

class Places implements Cloneable {
	String name;
	String country;
	long population;

	public Places(String name, String country, long population) {
		super();
		this.name = name;
		this.country = country;
		this.population = population;
	}

	@Override

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();

	}
}

public class Clone {
	

public static void main(String[] args) {
	Places p1=new Places("Mumbai","India",936548L);
	System.out.println(p1);
	
	Places p2= null;
	try {
		p2=(Places)p1.clone();
	}catch (CloneNotSupportedException e)
	{
		System.out.println("Cloning is not available");
		e.printStackTrace();
	}
	
	p1.country="USA";
	System.out.println(p1.country);
	System.out.println(p2.country);
}
}
