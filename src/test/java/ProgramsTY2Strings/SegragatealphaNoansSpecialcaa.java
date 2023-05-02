package ProgramsTY2Strings;

public class SegragatealphaNoansSpecialcaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="ju765lou&^%";
String a="";
String b="";
String c="";

for(int i=0;i<s.length();i++) {
	char ch = s.charAt(i);
	if(Character.isLowerCase(ch)) {
		a=a+ch;
	}
	else if(Character.isDigit(ch)) {
		b=b+ch;
	
	}
	else {
		c=c+ch;
	}
	}
System.out.println(a+" "+b +""+" "+c);
System.out.println(b);

	}

}
