package collections;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashSet<Object> lhs =new LinkedHashSet<>();
lhs.add("hii");
lhs.add("bye");
lhs.add('m');
lhs.add(null);
lhs.add(8);
lhs.add(7);
lhs.add("bye");
lhs.add(null);
System.out.println(lhs);
System.out.println(lhs.contains(null));
System.out.println(lhs.size());
System.out.println(lhs.remove("bye"));
System.out.println(lhs);


	}

}
