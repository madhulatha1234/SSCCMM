package ProgramsTY;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int row=55;
for(int i=1;i<=row;i++) {
	for(int j=1;j<=row;j++) {
		//if(j==row-i+1||i==j) {
		if(i+j==row+1||i==j) {
			System.out.print("*");
		}
		else {
			System.out.print(" ");
		}
	}
	System.out.println();
}
	}

}
