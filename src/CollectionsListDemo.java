import java.util.*;
public class CollectionsListDemo {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("Guru");
		v.add("Shyam");
		
		ArrayList al=new ArrayList();
		
		Enumeration e=v.elements();
		
		al=Collections.list(e);
		
		System.out.println(al);
	

	}

}
