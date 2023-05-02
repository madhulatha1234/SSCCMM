package ProgramsTY2Strings;

import java.util.LinkedHashSet;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="wwwwprreetrtw";
		//String s="mysorere";
		char[] st = s.toCharArray();
		
			//String[] st = s.split(" ");
		LinkedHashSet<Character> stt =new LinkedHashSet<Character>();
		for(int i=0;i<st.length;i++) {
		stt.add(st[i]);
		
		}
		for(Character sttt:stt) {
			int count=0;
			for(int i=0;i<st.length;i++) {
				if(sttt.equals(st[i])) {
					count++;
					
				}
			}
			System.out.println(stt +"is repeted to"+ count+"times");
		}	}
}
