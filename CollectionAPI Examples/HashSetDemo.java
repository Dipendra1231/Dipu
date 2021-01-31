
// Demonstrate HashSet.
import java.util.Collections;
import java.util.*;

class HashSetDemo {
	public static void main(String args[]) {
// create a hash set
		HashSet<String> hs = new HashSet<String>();
// add elements to the hash set
		hs.add("B");
		hs.add("A");
		hs.add("D");
		hs.add("E");
		hs.add("C");
		hs.add("F");
		hs.add("Z");
		hs.add("B");
//hs.add(2);
		hs.add(null);
		hs.add(null);
//hs.add(new Integer(3));
//hs.remove(2);*/
		System.out.println(hs);
//Collections.sort(hs);
//System.out.println(hs);
//hs.add("B");

	}
}
