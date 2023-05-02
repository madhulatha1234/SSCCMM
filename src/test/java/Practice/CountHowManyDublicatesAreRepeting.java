package Practice;

import java.util.LinkedHashSet;

public class CountHowManyDublicatesAreRepeting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {2,4,6,8,2,2,4,8,2};
LinkedHashSet<Integer> set=new LinkedHashSet<>();
for(int i=0;i<a.length;i++) {
	set.add(a[i]);
}

for(Integer in:set) {
	int count=0;
	for(int i=0;i<a.length;i++)
	{
		if(in==a[i]) {
			count++;
		}
	}
	if(count>0) {
		System.out.println(in+"   repeted    "+count+"  times ");
	}
}
}

}
