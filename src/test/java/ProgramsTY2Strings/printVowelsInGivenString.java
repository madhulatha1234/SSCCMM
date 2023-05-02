package ProgramsTY2Strings;

public class printVowelsInGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Rangasamudra";
	int count=0;
//		char[] c = str.toCharArray();
//		for(int i=0;i<c.length;i++) {
//			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u') {
//				count++;
//				System.out.println(c[i]);
//			}
//			//System.out.println(count);
//		}
//		//System.out.println(count);
		
	for(int i=0;i<str.length();i++)	{
		if(str.charAt(i)=='a'||str.charAt(i)=='g') {
			count++;
			System.out.println(str.charAt(i) +" "+count);
		}
	}
		
	}
}
		
	


