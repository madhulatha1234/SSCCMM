package InterviewQuestions;

public class Input123output345 {

	public static void main(String[] args) {
	int a[]= {1,2,3};
	for(int i=0;i<=a.length-1;i++) {
		System.out.print(a[i]+" ");
	}
	int a1 = a[0]+a[1];
	int a2=a[0]+a[2];
	int a3=a[2]+a[1];
	System.out.print(+a1+"  "+a2+"  "+a3);

	}

}
