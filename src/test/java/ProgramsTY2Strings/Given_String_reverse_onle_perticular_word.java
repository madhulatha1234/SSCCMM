package ProgramsTY2Strings;

public class Given_String_reverse_onle_perticular_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hii java Hii mava";

		String[] va = s1.split(" ");
		for(int i=0;i<va.length;i++) {
			System.out.println();
			if(i==0) {
			System.out.print(va[i]+" ");
			}
				else {
				String fl = va[i];
				char cn = fl.charAt(i);
				for(int j=fl.length()-1;j>=0;j--) {
					System.out.print(fl.charAt(j)+"");
					//System.out.println();
				}
			}
		}


			}

	}


