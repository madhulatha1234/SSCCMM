package ProgramsTY2Strings;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//*
//* *
//* * *		
//* * * *
//* * * * *		
	int row=5;
	int star=1;
	int space=4;
	for(int i=1;i<=row;i++) {
		for(int j=1;j<=star;j++) {
			System.out.print("*");
			
		}
		for(int k=1;k<=space;k++) {
			System.out.print(" ");
		}
		System.out.println();
		star++;
		space--;
	}
	}

}
