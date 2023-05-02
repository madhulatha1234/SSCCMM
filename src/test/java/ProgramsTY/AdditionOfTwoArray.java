package ProgramsTY;

import org.apache.poi.util.SystemOutLogger;

public class AdditionOfTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {4,3,5,8,9,12,13};
int[] b= {6,9,4,9,7,9,8,9,5};  //o/p10,12,9,12
//int[] c=new int[b.length];
//int m=0;
//int c = 0;
for(int i=0;i<b.length;i++) {
	//c=a[i]+b[i];
	try {
	System.out.println(a[i]+b[i]);
	//System.out.println("try");
//	c[m]=a[i]+b[i];
//	m++;
//	System.out.println(c[m]);
	}
	catch(Exception e) {
		if(a.length<b.length) {
		System.out.println(b[i]);
		//System.out.println("if");
		}
//		else {
//			System.out.println(a[i]);
//			//System.out.println("else");
//		}	
	}
//	finally {
//		if(a.length<b.length) {
//			System.out.println("finally");
//			System.out.println(b[i]);
//		}
//			}
}
//System.out.println(c);
	}

}
