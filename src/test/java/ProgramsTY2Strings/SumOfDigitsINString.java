package ProgramsTY2Strings;

import java.util.Scanner;

public class SumOfDigitsINString {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String st=sc.nextLine();
		int sum=0;
		for(int i=0;i<st.length();i++)
		{
		char ch=st.charAt(i);
		if(ch>='1'&&ch<='9')
		{
			sum=sum+ch-48;
		}}
		System.out.print(sum);
		

	}

}
