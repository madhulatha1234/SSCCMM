package ProgramsTY2Strings;

public class ReverseAStringWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Welcome to to mysore mysore";
String st=s.toLowerCase();
String[] str = st.split(" ");
	
	for(int i=str.length-1;i>=0;i--) {
		System.out.println(str[i]+" ");
	 }
	
	//String s="Welcome to to mysore mysore";
	//String st=s.toLowerCase();
	//String[] str = st.split(" ");
	//String rev="";
	//for(int i=str.length-1;i>=0;i--) {
		//rev=rev+str[i]+"  ";
	//}
	//System.out.println(rev);
		
		
	}
}
