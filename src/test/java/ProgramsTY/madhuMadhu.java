package ProgramsTY;

public class madhuMadhu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="madhu";
		int length = str.length()-1;
		String rev="";
		for(int i=0;i<=str.length()-1;i++){
			
	rev=rev+str.charAt(i);
		//rev=str.charAt(i);
System.out.println(rev);
if(rev.length()>length) {
	for(int j=str.length()-1;j>0;j--) {
		System.out.println(rev);
		
	}
}
		}
		
	}

}