package Practice;

public class OnlyGetOnedigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=87669508;
while(a>9) {
	int sum=0;
	while(a>0) {
		int d=a%10;
		sum=sum+d;
		a=a/10;
		
	}
	a=sum;
	
}
System.out.println(a);
	}

}
