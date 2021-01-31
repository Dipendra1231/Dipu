
// Demonstrate HashSet.
import java.util.*;

class LinkedHashSetDemo {
	public static void main(String args[]) {
// create a hash set
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
// add elements to the hash set
		lhs.add("B");
		lhs.add("A");
		lhs.add("D");
		lhs.add("E");
		lhs.add("C");
		lhs.add("F");
		lhs.add("B");
        lhs.add(null);
        lhs.remove("D");
		System.out.println(lhs);
	}
}