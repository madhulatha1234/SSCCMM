package collections;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<Object> hs=new HashSet<>();
hs.add("hii");
hs.add("bye");
hs.add(null);
hs.add('m');
hs.add(null);
System.out.println(hs);
System.out.println(hs.size());
System.out.println(hs.contains('m'));
//hs.clear();
System.out.println(hs.isEmpty());
System.out.println(hs);
ArrayList<Object> at=new ArrayList<>(hs);
at.add("hi");
at.add("bye");
at.add(88);
at.add(null);
at.add("hi");
System.out.println(at);

	}

}
