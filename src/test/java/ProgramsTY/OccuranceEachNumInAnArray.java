package ProgramsTY;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class OccuranceEachNumInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {2,7,6,5,3,7,3};
LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
for(int i=0;i<a.length;i++) {
	set.add(a[i]);
}
System.out.println(set);
for(Integer in:set) {
	//System.out.println(in);
	int count=0;
	for(int i=0;i<a.length;i++) {
		if(in==a[i]) {
			count++;
		}
	}
	System.out.println(in+"--->"+count);
}
	}

}
