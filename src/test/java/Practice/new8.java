package Practice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class new8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {6,7,8,9,5,6,7,7};
		TreeSet<Integer> set=new TreeSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		for( Integer se:set) {
		System.out.print(se+"se");
		//System.out.println();
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"i");
			//System.out.println();
			if(se!=arr[i]) {
				//System.out.println(arr[i]+"  hii");
			}
		}
		
			}}

}
