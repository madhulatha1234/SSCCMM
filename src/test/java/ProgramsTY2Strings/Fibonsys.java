package ProgramsTY2Strings;

public class Fibonsys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,n3=1;
		for(int i=0;i<=8;i++) {
			System.out.println(n1);
			n1=n2;
			n2=n3;
			n3=n1+n2;
	}
	}
}
