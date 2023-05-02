package ProgramsTY2Strings;

import java.util.LinkedHashSet;

public class PrintVowelswithoutDublicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Rangasamudra";
		char[] ch = str.toCharArray();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<ch.length;i++) {
			set.add(str.charAt(i));
		}
		int count=0;
		for(Character chh:set) {
			if(chh=='a'||chh=='e'||chh=='i'||chh=='o'||chh=='u') {
				count++;
				System.out.println(chh);
			}
		}
		System.out.print("the vowels of count"+count);
	}

}
