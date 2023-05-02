package ProgramsTY;

import java.util.Arrays;
import java.util.Collections;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="madhu";//adhmu
		int a=str1.length();

		String str2="uhdaa";
		int b=str2.length();
		char[] char1 = str1.toCharArray();
		char[] char2 = str2.toCharArray();
		

				Arrays.sort(char1);
				Arrays.sort(char2);
		
				if(a==b) {
					boolean eqe = Arrays.equals(char1, char2);
					if(eqe) {
						System.out.println("anagram");
					}
					else {
						System.out.println("not annagram");
		
					}}
				else {
					System.out.println("no");
				}




	}}

