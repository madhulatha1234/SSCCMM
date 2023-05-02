package ProgramsTY2Strings;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int row=5;
int star=1;
int space=4;
int l=1;
for(int i=1;i<row;i++) {
	for(int j=0;j<space;j++) {
		System.out.print(" ");
	}
	for(int k=0;k<star;k++) {
		if(k<i) {
		System.out.print(k++);}
		else {
			System.out.print(k--);
		}
	}
	System.out.println();
	space--;
	star=star+2;
}
	}

}
