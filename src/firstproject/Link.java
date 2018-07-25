package firstproject;
import java.util.*;

public class Link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll= new LinkedList();
		ll.add("Java");
		ll.add("C#");
		ll.add("php");
		ll.add("python");
		ll.add("C++");
		
		System.out.println(ll);
		
		for(int i=0;i<ll.size();i++)
		{
			System.out.println(ll.get(i));
		}
		
		Iterator it=  ll.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		ListIterator lt= ll.listIterator();
		
		while(lt.hasNext()) {
			System.out.print(lt.next());
		}
		System.out.println();
		
		while(lt.hasPrevious())
			System.out.println(lt.previous()+"");
		
		
		
		
		
		}

}
