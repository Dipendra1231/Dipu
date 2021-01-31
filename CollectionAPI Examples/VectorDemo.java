// Demonstrate various Vector operations.
import java.util.*;
class VectorDemo {
public static void main(String args[]) {

Vector<Integer> v = new Vector<Integer>();
//Vector v = new Vector(3, 2);
	
//Vector<Integer> v = new Vector<Integer>(3,2);

v.addElement(1);
v.addElement(2);
v.addElement(3);
System.out.println("Initial capacity: " +v.capacity());
System.out.println("Initial capacity: " +v.capacity());
v.addElement(5);
System.out.println("Initial capacity: " +v.capacity());
v.add(4,18);
//System.out.println("Initial capacity: " +v.capacity());
//v.addElement(new Integer(6));
//v.addElement(new Integer(7));
//v.addElement(new Integer(8));
//v.addElement(new Integer(9));
//v.addElement(new Integer(10));
//v.add(new Integer(10));
System.out.println("Initial size: " + v.size());
System.out.println("Initial capacity: " +v.capacity());

//v.add(new Integer(10));
/*v.addElement(new Integer(51));
v.addElement(new Integer(12));
v.addElement(new Integer(13));*/
/*v.addElement(new Integer(14));
v.addElement(new Integer(15));
v.addElement(new Integer(16));
v.addElement(new Integer(17));
v.addElement(new Integer(18));
v.addElement(new Integer(19));
v.addElement(new Integer(20));
v.addElement(new Integer(21));*/
/*System.out.println("Capacity after ten additions: " +
v.capacity());
System.out.println("Size after ten additions: " +
v.size()); */
/*v.remove(new Integer(6));
v.remove(new Integer(5));
v.remove(new Integer(4));
System.out.println("Capacity after four deletions: " +
v.capacity());
System.out.println("Size after four deletions: " +
v.size());
*/
/*
v.addElement(new Double(5.45));
System.out.println("Current capacity: " +
v.capacity());
v.addElement(new Double(6.08));
v.addElement(new Integer(7));
System.out.println("Current capacity: " +
v.capacity());
v.addElement(new Float(9.4));
v.addElement(new Integer(10));
System.out.println("Current capacity: " +
v.capacity());
v.addElement(new Integer(11));
v.addElement(new Integer(12));
System.out.println("First element: " +
(Integer)v.firstElement());
System.out.println("Last element: " +
(Integer)v.lastElement());
if(v.contains(new Integer(3)))
System.out.println("Vector contains 3.");*/
// enumerate the elements in the vector.
Enumeration vEnum = v.elements();
System.out.println("\nElements in vector:");
while(vEnum.hasMoreElements())
System.out.print(vEnum.nextElement() + " ");
System.out.println();
}
}