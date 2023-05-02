package ProgramsTY2Strings;

public class ReverseEachWordsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Welcome to the mysore";
		String[] str = s.split(" ");
		for(int i=0;i<str.length;i++) {
			String st=str[i];
	
			for(int j=st.length()-1;j>=0;j--)
			{
		System.out.print(st.charAt(j));
		 
	}
			System.out.println("  ");
		}
	}
}

