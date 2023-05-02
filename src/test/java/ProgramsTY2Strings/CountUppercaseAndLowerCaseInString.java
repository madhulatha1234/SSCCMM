package ProgramsTY2Strings;

public class CountUppercaseAndLowerCaseInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="MysoreCity";
int uppercase=0;
int lowercase=0;

for(int i=0;i<s.length();i++)
{
	
	//i=1 1<
	if(s.charAt(i)>='A'&& s.charAt(i)<='Z') {
		//           65                90
		uppercase++;
	}
	else if(s.charAt(i)>='a'&& s.charAt(i)<='z');
	//                    97                 122
	lowercase++;
}
System.out.println("uppercase   "+uppercase);
System.out.println("lowercase   "+lowercase);
	}
}
