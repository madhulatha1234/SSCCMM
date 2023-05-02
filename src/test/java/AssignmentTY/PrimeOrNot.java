package AssignmentTY;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=3;
int count=0;
for(int i=0;i<=num;i++) {
	if(i%2==0) {
		count++;
	}
}
if(count==2) {
	System.out.println("given no is prime");
}
else {
	System.out.println("not prime");
}
	}

}
