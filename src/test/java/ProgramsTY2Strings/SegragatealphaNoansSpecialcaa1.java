package ProgramsTY2Strings;

public class SegragatealphaNoansSpecialcaa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="retCD124&^%*FRgk56";
//char[] ch = s.toCharArray();
String alpha=" ";
String  num=" ";
String spec=" ";
int sum=0;
for(int i=0;i<s.length();i++) {
//	if(ch[i]>='a'&&ch[i]<='z'||ch[i]>='A'&&ch[i]<='B') {
//		alpha=alpha+ch[i];
//	}
//	else if(ch[i]>='1'&&ch[i]<='9')
//{
//		num=num+ch[i];	
//		}
//
//else {
//	spec=spec+ch[i];
//}
//}
//System.out.println(alpha+" "+num+" "+" "+spec);
	
	if(s.charAt(i)>='A'&& s.charAt(i)<='Z'||s.charAt(i)>='a'&&s.charAt(i)<='z') {
		alpha=alpha+s.charAt(i);
	}
	 else if(s.charAt(i)>='1'&&s.charAt(i)<='9') {
		num=num+s.charAt(i);
		 //sum=sum+s.charAt(i)-48;
	}
	 else {
		 spec=spec+s.charAt(i);
		 
	 }
	//System.out.println(sum);
}

//System.out.println(alpha+"  "+num+" "+spec);
System.out.println(num+"  "+spec+" "+alpha);
	}
}
