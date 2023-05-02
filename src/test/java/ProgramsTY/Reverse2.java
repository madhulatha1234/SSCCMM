package ProgramsTY;

public class Reverse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="madhu";
int row=str.length();
int Space=4;
int value=1;
for(int i=0;i<=row;i++) {
	for(int j=0;j<Space;j++) {
		System.out.print(" ");
	}
	for(int k=0;k<value;k++) {
		System.out.print(str.charAt(k));
	}
	System.out.println();
	Space--;
	value++;
}
	}

}
