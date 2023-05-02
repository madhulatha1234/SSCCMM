package ProgramsTY;

public class Commoncharactersintwostrings {
	public static String findCommonChars(String s1, String s2) {
		String common = "";
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			if (s2.indexOf(c) != -1 && common.indexOf(c) == -1) {
				common += c;
				//common=common+c;
			}
		}
		return common;
	}
	public static void main(String[] args) {
		
		// Example usage:
		String s1 = "abcdefg";
		String s2 = "defghij";
		
		String common = findCommonChars(s1, s2);
		System.out.println("The common characters between '" + s1 + "' and '" + s2 + "' are '" + common + "'.");

	}
	

}
