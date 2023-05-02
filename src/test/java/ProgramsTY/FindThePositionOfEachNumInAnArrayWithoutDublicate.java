package ProgramsTY;

import java.util.LinkedHashSet;

public class FindThePositionOfEachNumInAnArrayWithoutDublicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {4,6,7,8,3,7};
LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
for(int i=1;i<a.length;i++) {
	set.add(a[i]);
}
for(Integer in:set) {
	for(int i=0;i<a.length;i++) {
		if(in==a[i]) {
			System.out.println(a[i]+"is in"+(i+1));
			break;
		}
	}
}
		}

}
