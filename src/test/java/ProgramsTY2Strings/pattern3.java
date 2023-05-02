package ProgramsTY2Strings;

public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//* * * * *
		//  * * * *
		//	  * * *    
		//       * *
		//	       *
int row=5;
int star=5;
int space=0;
for(int i=0;i<=row;i++) {
	for(int j=0;j<=star;j++) {
		System.out.print("* ");
		
	}
	for(int k=0;k<=space;k++) {
		System.out.print(" ");
	}
	System.out.println();
	star--;
	space++;
}

	}

}
