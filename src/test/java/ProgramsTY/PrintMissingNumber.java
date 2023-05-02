package ProgramsTY;

public class PrintMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,7,3,4,5};
for(int i=0;i<9;i++) {
	int count=0;
	for(int j=0;j<a.length;j++) {
		if(i==a[j]) {
			count++;
		}
	}
	if(count==0) {
		System.out.println(i);
	}
}
	}

}
