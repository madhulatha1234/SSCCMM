package Practice;

public class Appandd {
	public static void main(String[] args) {
	
		int[] a= {0,0,1,1,0};
int[] b=new int[a.length];
int m=0;
int n=a.length-1;
for(int i=0;i<b.length;i++) {
	if(a[i]==1) {
		b[m]=a[i];
		m++;
			}
	else if(a[i]==0){
		b[n]=a[i];
		n--;
	}
}
for(int i=0;i<b.length;i++ ) {
	System.out.println(b[i]);
}
	}
}
