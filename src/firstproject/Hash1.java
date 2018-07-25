package firstproject;
import java.util.*;

public class Hash1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		HashMap hm= new HashMap();
//		
//		hm.put("1", "Kevin");
//		hm.put("2", "Sam");
//		hm.put("3", "Dean");
//		hm.put("4", "Jill");
//		
//		System.out.println(hm);
//		
//		System.out.println(hm.get("2"));
//		
//		Set keys= hm.keySet();
//		
//		Iterator it=  keys.iterator();
//		
//		while(it.hasNext())
//		{
//			//type casting
//			String key= (String) it.next();
//			System.out.println(hm.get(key));
//		}
		
//		TreeMap hm= new TreeMap();
//		hm.put("1", "Kevin");
//		hm.put("2", "Sam");
//		hm.put("3", "Dean");
//		hm.put("4", "Jill");
//		
//		
//		
//		Set keys= hm.keySet();
//		
//		Iterator it=  keys.iterator();
//		
//		while(it.hasNext())
//		{
//			//type casting
//			String key= (String) it.next();
//		
//			System.out.println(hm.get(key));
//		}
		
	    LinkedHashMap hm= new LinkedHashMap();
		hm.put("1", "Kevin");
		hm.put("2", "Sam");
		hm.put("3", "Dean");
		hm.put("4", "Jill");
		
		
		
		Set keys= hm.keySet();
		
		Iterator it=  keys.iterator();
		
		while(it.hasNext())
		{
			//type casting
			String key= (String) it.next();
		
			System.out.println(hm.get(key));
		}
		
		
		
		
		
		
		
		
		

	}

}
