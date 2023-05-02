package Practice;

public class Practiceeee {
	public static void main(String[] args) {
		String s1 = "madhu";
		//String s2 = "defghij";
		String common = "";
		for (int i = 0; i <= s1.length()-1; i++) {
			char c = s1.charAt(i);
		//	System.out.println(common);
			if(common.indexOf(c)==-1) {
				common +=c;
				System.out.println(common);

			//System.out.println(common.indexOf(c));
			}
					}
	}
}
