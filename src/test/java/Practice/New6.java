package Practice;

public class New6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="mysore";
char c[]=s.toCharArray();

for(int i=0;i<c.length;i++) {
	if(c[i]=='o') {
		c[i]='r';
	}
}
for(int i=0;i<c.length;i++) {
	System.out.println(c[i]);
}
	}

}
