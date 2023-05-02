package InterviewQuestions;

public class i_am_madhu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="hi my name is madhulatha";
String[] val = str.split(" ");
 	for (int i = 0; i < val.length; i++) {
		char ch = val[i].charAt(0);
		String s = String.valueOf(ch).toUpperCase();
		String s2 = val[i].substring(1);
	System.out.println(s+s2);
}
 	
}
	
}


