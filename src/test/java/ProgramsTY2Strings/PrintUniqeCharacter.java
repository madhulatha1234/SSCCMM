package ProgramsTY2Strings;

import java.util.LinkedHashSet;

public class PrintUniqeCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="TestYantra";
String st=s.toLowerCase();
LinkedHashSet<Character> set=new LinkedHashSet<Character>();
for(int i=0;i<st.length();i++) {
	set.add(st.charAt(i));
}
for(Character chh:set) {
	System.out.println(chh);
}
	}

}
