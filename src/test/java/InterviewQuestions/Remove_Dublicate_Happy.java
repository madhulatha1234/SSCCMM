package InterviewQuestions;

public class Remove_Dublicate_Happy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String str="haappy";
char[] ch = str.toCharArray();
 for(int i=0;i<ch.length;i++) {
	 int count=0;
	 for(int j=0;j<ch.length;j++) {
if(ch[i]==ch[j]&&i>j)
{
	break;
}
if(ch[i]==ch[j]) 
		 {
			 count++;
		 }}
		 if(count>0) {
			 System.out.println(str.charAt(i));
		 }
	 
 }
	}

}
