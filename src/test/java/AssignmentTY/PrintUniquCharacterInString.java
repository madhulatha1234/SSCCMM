package AssignmentTY;

import java.util.LinkedHashSet;

public class PrintUniquCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Testyantra";
char ch[]=s.toCharArray();
LinkedHashSet<Character> set=new LinkedHashSet<>();
for(int i=0;i<ch.length;i++) {
	set.add(ch[i]);
	System.out.println(set);
}
	}

}
