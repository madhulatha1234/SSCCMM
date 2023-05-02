package ProgramsTY;

import java.util.LinkedHashSet;

public class NEWNEW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="aabbnnll";
int count=0;
char s1 = str.charAt(0);

for(int i=0;i<str.length();i++) {
	if(s1==str.charAt(i)) {
		count++;
	}
	else {
		System.out.println(s1+"--"+count);
	}
}
	System.out.println(s1+"--"+count);
	
	}

}
