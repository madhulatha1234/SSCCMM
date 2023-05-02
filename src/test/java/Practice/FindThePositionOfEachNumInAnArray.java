package Practice;

import java.util.LinkedHashSet;

public class FindThePositionOfEachNumInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {4,5,76,4,87,98,76};
LinkedHashSet<Integer> set=new LinkedHashSet<>();
for(int i=0;i<a.length;i++) {
	set.add(a[i]);
	//System.out.println(a[i]+"  "+(i+1));
}
for(Integer in:set) {
	//System.out.println();
	for(int i=0;i<a.length;i++) {
		if(in==a[i]) {
			System.out.println(a[i] +"Position is"+(i+1));
			break;
		}
	}
	
}
//System.out.println(in +"Position is"+a[i]);
	}

}
