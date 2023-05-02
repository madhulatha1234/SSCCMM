package ProgramsTY2Strings;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="TestYentra";
//String rev="";
//for(int i=0;i<=s.length();i++) {
	//rev=rev+s.toCharArray();
//}
//System.out.println(rev);
//for(int i=s.length()-1;i>=0;i--) {
	//System.out.println(s.charAt(i));
//}
//String rev="";
//for(int i=s.length()-1;i>0;i--) {
	//rev=rev+s.charAt(i);
//}
//System.out.println(rev);
char[] st = s.toCharArray();
int count=0;
for(char c:st) {
	count++;
}
for(int i=s.length()-1;i>0;i--) {
	System.out.println(st[i]);
}

	}

}
