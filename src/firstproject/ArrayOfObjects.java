package firstproject;

class Product
{
	String productName;
	double ProductPrice;
	public Product(String productName, double productPrice) {
		super();
		this.productName = productName;
		ProductPrice = productPrice;
	}
	
	
}

public class ArrayOfObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1= new Product("Laptop", 25000);
		Product p2= new Product("TV", 30000);
		Product p3= new Product("Mobile", 35000);
		
		Product p[]= {p1,p2,p3};		
		for(int i=0;i<p.length;i++) {
			System.out.println(p[i].productName);
			
			System.out.println(p[i].ProductPrice);
		}
				
		
		

	}

}
