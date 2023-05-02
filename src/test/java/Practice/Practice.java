package Practice;

import java.util.Iterator;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String str="aDrK76oi98MM"	;
	char[] st = str.toCharArray();
	String sy = st.toString();
	//o/p=mmkr
	// o/p=8967
	for(int i=sy.length()-1;i>=0;i--) {
		if(sy.charAt(i)>='A'&&sy.charAt(i)<='Z') {
			String rr = sy.toLowerCase();
			System.out.println(rr);
		}
	}
	}
}
