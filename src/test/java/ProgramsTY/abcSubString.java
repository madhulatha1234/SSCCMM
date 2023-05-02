package ProgramsTY;

public class abcSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abbbcdabcabcdefga";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)==97) {
				System.out.print("\n"+s.charAt(i));
			}
			else {
				System.out.print(s.charAt(i));
			}
		}
	}

}
