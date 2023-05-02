package ProgramsTY;

public class Append0sAtTheLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {1,0,1,0,1};//o/p:- 1 1 0 0 0
int[] b=new int[a.length];
int m=0;
int n=a.length-1;
for(int i=0;i<a.length;i++) {
	{
		if(a[i]==1) 
		{
			b[m]=a[i];
			m++;
		}
		else {
			b[n]=a[i];
			n--;
		}
	}
	for(int i1=0;i1<b.length;i1++) 
	{
		System.out.println(b[i]+" ");
	}
}
 	}

}
