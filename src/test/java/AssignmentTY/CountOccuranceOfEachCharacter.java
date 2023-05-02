package AssignmentTY;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class CountOccuranceOfEachCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Testyantra";
		char ch[]=s.toCharArray();
		LinkedHashSet<Character> set =new LinkedHashSet<>();
		for(int i=0;i<ch.length;i++) {
		set.add(ch[i]);
		}
		for(Character chh:set) {
			int count=0;
			//int i1=0;
			for(int i=0;i<ch.length;i++) {
				if(ch.equals(set)) {
					count++;
				
							}
				System.out.println(ch+"is position "+count);
				}
			
		}
	}

}
