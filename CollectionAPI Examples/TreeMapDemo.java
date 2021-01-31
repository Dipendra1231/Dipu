import java.util.*;
class TreeMapDemo {
public static void main(String args[]) {
// Create a tree map
TreeMap tm = new TreeMap();
// Put elements to the map
tm.put("John Doe", new Double(3434.34));
tm.put("Tom Smith", new Double(123.22));
tm.put("Jane Baker", new Double(1378.00));
tm.put("Todd Hall", new Double(99.22));
tm.put("Ralph Smith", new Double(-19.08));
tm.put("Ralph Smith", new Double(-18.08));
tm.put("Ralph ", null);
//tm.put(null, new Double(-18.08));
//tm.put(null, new Double(10));
//tm.put("Ralph A",new Integer(19));
System.out.println(tm);
/*
tm.put(1,1 );
tm.put(1,2 );
tm.put(2,"1" );
tm.put(3,"1" );
tm.put(4,1 );
System.out.println(tm);
//tm.put("Ralph Smith", new Double(-18.00));
// Get a set of the entries*/

Set set = tm.entrySet();
// Get an iterator
Iterator i = set.iterator();
// Display elements
while(i.hasNext()) {
Map.Entry me = (Map.Entry)i.next();
System.out.print(me.getKey() + ": ");
System.out.println(me.getValue());
}
System.out.println();
// Deposit 1000 into John Doe's account
double balance = ((Double)tm.get("John Doe")).doubleValue();
tm.put("John Doe", new Double(balance + 1000));
System.out.println("John Doe's new balance: " +
tm.get("John Doe"));
}
}
