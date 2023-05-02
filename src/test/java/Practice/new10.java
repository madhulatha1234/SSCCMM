package Practice;

import java.util.LinkedHashSet;

public class new10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {2,5,8,9,0,5,6,5};
LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
for(int i=0;i<a.length;i++) {
set.add(a[i]);
}
for(Integer in:set) {
for(int i=0;i<a.length;i++) {
	if(in==a[i]) {
		System.out.println(a[i]+"is position of "+(i+1));
		break;
	}
}
}
int[] a1={4,5,6,7,3,4,5} ;

int min=a1[0];
for(int i=0;i<a1.length;i++)
{
if(min>a1[i]){
min=a1[i];
}
}
System.out.println(min);

	}

}
