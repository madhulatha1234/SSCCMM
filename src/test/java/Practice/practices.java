package Practice;

public class practices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {3,5,7,8,6};
int b[]= {8,6,8,9,7,5};

for(int i=0;i<a.length;i++) {
	try {
	System.out.println(a[i]+b[i]);
}
catch(Exception e) {
	if(a.length>b.length) {
		System.out.println(a[i]);
	}
	else
		
	{
		System.out.println(b[i]);
	}
}
	}
	}
}
