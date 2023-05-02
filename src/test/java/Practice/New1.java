package Practice;

public class New1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {5,7,8,94,7,9};
for(int i=0;i<a.length;i++) {
	for(int j=i+1;j<a.length;j++) {
		if(a[i]>a[j]) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			
		}
	}}
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
		//System.out.println("ist minimum num"+a[0]);
	}
	System.out.println("ist minimum num"+a[a.length-2]);

	}

}
