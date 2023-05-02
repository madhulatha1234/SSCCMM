package ProgramsTY;

public class FirstMinNoinBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {3,6,8,54,1,23};
for(int i=0;i<=arr.length;i++) {
	for(int j=i+1;i<=arr.length-1;j++) {
		if(arr[i]>arr[j]) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
	System.out.println(arr[i]);
	System.out.println("last minimum number"+arr[arr.length-1]);
}
	}

}
