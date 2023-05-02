package Practice;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {2,6,8,9,76,3,2};
for(int i=0;i<a.length;i++) {
	for(int j=i+1;j<a.length;j++) {
		if(a[i]>a[j]) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		//System.out.println(a[j]);
	}
	System.out.println(a[i]);
}

}

}
