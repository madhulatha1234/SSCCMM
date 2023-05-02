package ProgramsTY;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int row=5;
int Star=1;
int space=4;
for(int i=0;i<=row;i++ ) {
	for(int j=0;j<space;j++) {
		System.out.print(" ");
	}
	for(int k=0;k<Star;k++) {
		System.out.print("* ");
	}
	System.out.println();
	Star++;
	space--;
}
	}

}
