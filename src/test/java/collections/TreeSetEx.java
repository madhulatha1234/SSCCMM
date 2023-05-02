package collections;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<Object> ts=new TreeSet<>();
ts.add(98);
ts.add(78);
ts.add(76);
ts.add(98);
ts.add(67);
ts.add(84);
//ts.add(null);//NullPointerException
//ts.add('c');//ClassCastException
System.out.println(ts);
System.out.println(ts.descendingSet());
System.out.println(ts.first());
System.out.println(ts.last());
System.out.println(ts.higher(76));
System.out.println(ts.lower(76));
System.out.println(ts.headSet(98));//
System.out.println(ts.tailSet(76));
System.out.println(ts.subSet(76,84));
System.out.println(ts);

	}

}
