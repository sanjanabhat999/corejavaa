
package firstproject;

import java.util.*;

public class Add1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList a1 = new ArrayList();
		a1.add("joey");
		a1.add("chandler");
		a1.add("ross");
		a1.add("rachel");
		a1.add("monica");
		a1.add("pheobe");

		System.out.println(a1);

		int ind = a1.indexOf("ross");

		if (!(ind == -1)) {
			a1.add(ind, "Mike");
		}
		System.out.println(a1);

	}

}
