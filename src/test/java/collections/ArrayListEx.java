package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList list =new ArrayList<>();
list.add("hii");
list.add(10);
list.add("bye");
list.add(null);
list.add("bye");
System.out.println(list);
ArrayList<Integer> list1 =new ArrayList<Integer>();
//list1.add(null);
list1.add(82);
list1.add(84);
list1.add(83);
list1.add(88);
list1.add(86);
list1.add(87);

System.out.println(list1);
Collections.sort(list1);
System.out.println(list1+"after sorting");
list.addAll(list1);
System.out.println(list);
if(list.contains("bye")) 
	System.out.println("yes it is present");
else
	System.out.println("not present");
for(Object obj:list) {
	System.out.print(obj+" ");
}
list.add(5,"hello mysore");
list.remove(2);
System.out.println(list.get(5));
System.out.println(list.remove(null));
System.out.println(list.set(7,"bannur"));//replacing
System.out.println(list.size());
System.out.println(list);
	}

}
