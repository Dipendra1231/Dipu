
// Demonstrate TreeSet.
import java.util.*;

class TreeSetDemo {
	public static void main(String args[]) {
// Create a tree set
		TreeSet<Integer> ts = new TreeSet<>();
// Add elements to the tree set
		/*
		 * ts.add("C"); ts.add("A"); ts.add("B"); ts.add("E"); ts.add("F"); ts.add("D");
		 * ts.add("B");
		 */
//ts.add(new Integer(2));
		ts.add(1);
		ts.add(3);
		ts.add(2);
		ts.add(4);
		ts.add(10);
//ts.add(null);
		//ts.add("");
		System.out.println(ts);
	}
}
