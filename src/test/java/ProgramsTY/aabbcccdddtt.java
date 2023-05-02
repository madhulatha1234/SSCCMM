package ProgramsTY;

public class aabbcccdddtt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aabbhhyyyaabb";
		    String result = "";
		    int count = 1;
		   char cha = s.charAt(0);
		    char currentChar = s.charAt(0);

		    for (int i = 1; i < s.length(); i++) {
		        if (s.charAt(i) == currentChar) {
		            count++;
		        } else {
		        	//result=result+currentChar;
		            result += currentChar;
		            result += count;
		            count = 1;
		            currentChar = s.charAt(i);
		        }
		    }

		    result += currentChar;
		    result += count;

		   System.out.println(result);
		}

	

}
