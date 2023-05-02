package Practice;

public class firstminnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {4,7,8,9};
int min=a[0];
for(int i=0;i<a.length;i++) {
	if(min>a[i]) {
		int temp=a[i];
		a[i]=min;
		min=temp;
	}
	
}
System.out.println(min);
}

}
