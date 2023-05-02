package ProgramsTY;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDublicateOnArrayUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {2,4,5,8,4,9};
LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
//HashSet<Integer> set=new HashSet<Integer>();
for(int i=0;i<a.length;i++) {
set.add(a[i]);
System.out.println(set);
}
	}

}
