package ProgramsTY;

import java.util.LinkedHashSet;

import com.graphbuilder.struc.LinkedList;

public class WORK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="madhulatha";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<str.length();i++) {
			set.add(str.charAt(i));
		}
		
		for(Character sett:set) {
			System.out.println(sett);
		}
					 }
 
 
 
 	

}
