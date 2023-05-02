package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<Object> lk=new LinkedList<Object>();
lk.add("hii");
lk.add(30);
lk.add('m');
lk.add(null);
lk.add("hii");
System.out.println(lk);
if(lk.contains("bye"))
	System.out.println("yes it is present");
else
	System.out.println("It is not present");
Iterator<Object> it=lk.iterator();
while(it.hasNext()) {
	Object st = it.next();
	System.out.println(st);
}
LinkedList<Object> lk1=new LinkedList<Object>();
System.out.println(lk1.addAll(lk));
System.out.println(lk1);
for(Object obb:lk1) {
	System.out.println(obb);
}
lk1.addFirst("Rangasamudra");
lk1.addLast("mysore");
System.out.println(lk1);
//lk1.clear();
System.out.println(lk1);
lk1.clone();
System.out.println(lk1);
lk1.removeLast();
lk1.remove("hii");
System.out.println(lk1);
	}

}
