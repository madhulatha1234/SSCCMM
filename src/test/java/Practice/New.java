package Practice;

import java.util.LinkedHashSet;

public class New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={2,4,7,8,9,8,2,2,7};
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++){
		set.add(a[i]);
		}
		for(Integer in:set)
		{
		int count=0;
		for(int i=0;i<a.length;i++){
		if(in==a[i]){
		count++;
		}
		}
		if(count>1)
		{
		System.out.println(in+ "is repeted "+count+"times");
		}
		}
	}

}
