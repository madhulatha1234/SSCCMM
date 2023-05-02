package ProgramsTY;

public class removedub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="madhuu";
char[] s1 = str.toCharArray();
for(int i=0;i<str.length();i++) {
	for(int j=1;j<str.length();j++) {
		if(s1[i]==s1[j]) {
			System.out.print(s1[j]);
		}
	}
}
	}

}
