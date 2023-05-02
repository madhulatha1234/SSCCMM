package ProgramsTY;

public class PrintOnlyIntegersinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="adry76oi98mm"	;
		// o/p=8967
		for(int i=str.length()-1;i>=0;i--) {
			if(str.charAt(i)>='0'&&str.charAt(i)<='9') {
				System.out.println(str.charAt(i));
			}
		}

	}

}
