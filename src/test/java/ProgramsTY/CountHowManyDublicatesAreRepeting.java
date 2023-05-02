package ProgramsTY;

import java.util.LinkedHashSet;

public class CountHowManyDublicatesAreRepeting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,7,6,5,3,7,3};
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
		}
		for(Integer in:set) {
			int count=0;
			for(int i=0;i<a.length;i++) {
				System.out.println(a[i]);
				if(in==a[i])//in=2,7,6,5,3
					//a[i]2,7,6,5,3,7,3
				{
					count++;
				}
			}
			if(count>1) {
				System.out.println(in+"repeted"+count+"times");
		}
		}
	}

}
