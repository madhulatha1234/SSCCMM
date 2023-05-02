package ProgramsTY2Strings;

import java.util.LinkedHashSet;

public class OccuranceOfEachWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Welcome to the mysore city mysore city";
	//String s="mysorere";
	//char[] st = s.toCharArray();
		String[] st = s.split(" ");
	LinkedHashSet<String> set =new LinkedHashSet<String>();
	for(int i=0;i<st.length;i++) {
	set.add(st[i]);
	
	}
	for(String stt:set) {
		int count=0;
		for(int i=0;i<stt.length();i++) {
			if(stt.equals(st[i])) {
				count++;
				
			}
		}
		System.out.println(stt +"is repeted to"+ count+"times");
	}
	}

}
