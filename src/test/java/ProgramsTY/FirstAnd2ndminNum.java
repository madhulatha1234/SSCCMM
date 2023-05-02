package ProgramsTY;

public class FirstAnd2ndminNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {34,76,12,6,32,89};
int fmin=arr[0];
int smin=arr[0];
for(int i=0;i<=arr.length-1;i++) {
	if(fmin>arr[i]) {
	
		smin=fmin;
		fmin=arr[i];
	}else if(smin>arr[i]){
		smin=arr[i];
	}		
		}
System.out.println(fmin+"--->"+smin);
}
	}


