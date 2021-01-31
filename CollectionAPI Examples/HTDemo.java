// Demonstrate a Hashtable
import java.util.*;
class HTDemo {
public static void main(String args[]) {

Hashtable balance = new Hashtable();
//Enumeration names;
//String str;
//StringBuffer sb=new StringBuffer(10);
//double bal;
balance.put("John Doe", new Double(3434.34));
balance.put("Tom Smith", new Double(123.22));
balance.put("Jane Baker", new Double(1378.00));
balance.put("Todd Hall", new Double(99.22));
balance.put("Todd Hall", new Integer(9));
balance.put("Ralph Smith", "-19.08");
//balance.put("Ralph Smith", null);
//balance.put(null, "111");
System.out.println(balance);
//balance.put("Ralph Smith", null);
//
//balance.put("Ralph Smith1", null);

balance.put(new Double(8.1),1 );
balance.put(new Double(9.1),2 );
balance.put(new Float(1.9),"1" );
balance.put(new Double(8.1),"1" );
balance.put(new Integer(1),1 );
System.out.println(balance);
//balance.put(a,1 );
//balance.put(sb,1 );
//System.out.println(balance);
//balance.put("Ralph Smit", new Integer(99.22));
//balance.put("Ralph Smith", new Double(-10.08));
//balance.put(null, new Double(-19.08));
//balance.put("Ralph Smit",null);
// Show all balances in hash table.
/*names = balance.keys();
while(names.hasMoreElements()) {
str = (String) names.nextElement();
System.out.println(str + ": " +
balance.get(str));
}
System.out.println();
// Deposit 1,000 into John Doe's account
bal = ((Double)balance.get("John Doe")).doubleValue();
balance.put("John Doe", new Double(bal+1000));
System.out.println("John Doe's new balance: " +
balance.get("John Doe"));*/
}
}