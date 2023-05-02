package ProgramsTY;

public class Reverse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="madhu";
char[] hh = str.toCharArray();
int row = hh.length;
int value=1;
for(int i=0;i<=row-1;i++) {
	for (int j=value-1;j>=0;j--) {
		System.out.print(hh[j]);
	}
	System.out.println();
	value++;
}
	}

}
