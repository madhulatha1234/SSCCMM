package ProgramsTY;

public class First2MinNumNew {

	public static void main(String[] args) {
		// TODO Auto-generated method
	int arr[]= {0,2,1,5,8,2};
	int fmin=arr[0];
	int smin=arr[0];
	for(int i=0;i<arr.length;i++) {
	if(arr[i]<fmin) {
		if(arr[i]!=fmin) {
			smin=fmin;
		}
		fmin=arr[i];
	}
	else if(fmin==smin||smin>arr[i]) {
		smin=arr[i];
	}
	}
	System.out.println(fmin+"--->"+smin);
	}

}
