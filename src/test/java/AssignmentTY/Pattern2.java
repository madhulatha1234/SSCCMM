package AssignmentTY;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int row=5;
int value=1;
int k=1;
for(int i=0;i<row;i++) {
	for(int j=0;j<value;j++) {
		if(k<=9) {
			
		
		System.out.print(k++);
		}
		else  {
			k=1;
			System.out.print(k++);
		}
	}
	System.out.println();
	value++;
}
	}

}
