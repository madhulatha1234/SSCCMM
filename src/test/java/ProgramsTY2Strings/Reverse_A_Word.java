package ProgramsTY2Strings;

public class Reverse_A_Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="My name is madhulatha";
		String[] st = str.split(" ");
		for(int i=0;i<st.length;i++) {
			String stree = st[i];
			String rev="";
			
			for(int j=stree.length()-1;j>=0;j--) {
				rev=rev+stree.charAt(j);	
			}
			System.out.println(rev);
		}

	}

}
