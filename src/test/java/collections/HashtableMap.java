package collections;

import java.util.Hashtable;
import java.util.Map.Entry;

public class HashtableMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hashtable< Object, Object> ht=new Hashtable();
ht.put(0,"mysore");
ht.put(1,"bannur");
ht.put("hii",'m');
ht.put('o',12);
//ht.put(null, "ht");//not allowed null pointer exception
//ht.put("kk", null);//not allowed null pointer exception
System.out.println(ht);
ht.replace("hii",'c');
System.out.println(ht);
System.out.println(ht.size());
System.out.println(ht.containsKey('k'));
//System.out.println(ht.remove());
ht.remove("hii");
for(Entry<Object, Object> mm: ht.entrySet()) {
	System.out.println(mm.getKey()+" "+mm.getValue());
}

	}

}
