package ProgramsTY2Strings;

public class FindElementWhichHasMiimumLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a[]= {"haf","juh","uIU","uuO","IUYO","9a"};
String min_length=a[0];

for(int i=0;i<a.length;i++) {
	if(min_length.length()>a[i].length()) {
		min_length=a[i];
		
	}
}
for(int i=0;i<a.length;i++) {

	if(min_length.length()==a[i].length()) {
		min_length=a[i];
		System.out.println(a[i]+"  length is  "+a[i].length());
	}
}
	}

}
