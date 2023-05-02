package collections;

import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap<Object,Object> tm=new TreeMap<Object,Object>();
tm.put('m',1);
tm.put('c',2);
tm.put('k', 3);
tm.put('l',4);
//tm.put('m', 6);
tm.put('s', 5);
tm.put('m', 6);
tm.put('a', 7);
tm.put('f', null);
System.out.println(tm);

	}

}
