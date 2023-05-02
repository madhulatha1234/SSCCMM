package ProgramsTY;

public class Reverse_Only_Two_Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "What is your name"	;
		String[] arr = str.split(" ");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println();
			if(i==3||i==2) {
				String val = arr[i];
				String rev="";
			
			for(int j=val.length()-1;j>=0;j--) {
				System.out.print(val.charAt(j)+"");
			}
		}
			else {
				System.out.print(arr[i]);
			}
			}

	}

}
