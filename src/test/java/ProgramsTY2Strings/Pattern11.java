package ProgramsTY2Strings;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=5;
	
		for(int i=0;i<row;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
				
			}
			for(int k=0;k<row;k++) {
				System.out.print(i);
			}
			System.out.println();
			
		}

	}

}
