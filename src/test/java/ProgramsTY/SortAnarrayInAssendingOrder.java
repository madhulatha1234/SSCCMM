package ProgramsTY;

public class SortAnarrayInAssendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {2,9,5,6,7};
for(int i=0;i<=arr.length-1;i++) {
	for(int j=i+1;j<=arr.length-1;j++) {
		if(arr[i]>arr[j]) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
	System.out.println(arr[i]);
}

	}

}
