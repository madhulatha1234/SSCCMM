package Practice;

public class WorkOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Madhulatha";
char[] sttt = str.toCharArray();
for(int i=0;i<sttt.length;i++) {
	if(sttt[i]=='a'||sttt[i]=='e'||sttt[i]=='i'||sttt[i]=='o'||sttt[i]=='u') {
		System.out.println(sttt[i]);
	}
}
	}

}
