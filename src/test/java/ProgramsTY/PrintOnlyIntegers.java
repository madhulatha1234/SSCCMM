package ProgramsTY;

public class PrintOnlyIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "It is in the firm 12.09";
		
		char[] chh = str.toCharArray();
			for(int i=0;i<=str.length()-1;i++) {
			
				if(str.charAt(i)>='0'&&str.charAt(i)<='9'||str.charAt(i)=='.') {
					
					System.out.print(str.charAt(i));
				}
			}

	}

}
