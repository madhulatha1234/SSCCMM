package ProgramsTY;

public class First3MinimumNumberUsingBubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {4,62,76,2,54};
for(int i=0;i<arr.length;i++) {
	for(int j=i+1;j<arr.length;j++) {
		if(arr[i]>arr[j]) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
		}
	}
	System.out.println(arr[0]+""+arr[1]+""+arr[2]);
}
	}

}
