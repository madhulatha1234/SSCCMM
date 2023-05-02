package ProgramsTY2Strings;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=5;
		int space=4;
		int star=1;
		for(int i=0;i<row;i++) {
			for(int j=0;j<space;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<star;k++) {
				
				System.out.print("*");
				
			}
			System.out.println();
			space--;
			star=star+2;
		}
		int space1=1;
		int star1=7;
		for(int ii=0;ii<row;ii++) {
			for(int jj=0;jj<space1;jj++) {
				System.out.print(" ");
			}
			for(int kk=0;kk<star1;kk++) {
				System.out.print("*");
			}
			System.out.println();
			space1++;
			star1=star1-2;
		}

	}

}
