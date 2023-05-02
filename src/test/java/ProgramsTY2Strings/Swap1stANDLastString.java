package ProgramsTY2Strings;

public class Swap1stANDLastString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Welcome to the mysore city";
		//int temp=a;
		//a=b;
		//b=temp;
		
		String[] st=s.split(" ");
		//st[0]=welcome;
		//st[1]=to;
		//st[2]=the;
		//st[3]=mysore;
		//st[4]=city;
		String temp=st[0];
		st[0]=st[st.length-1];
		st[st.length-1]=temp;
		for(int i=0;i<st.length;i++) {
			System.out.println(st[i]+" ");
		}
		
	}

}
