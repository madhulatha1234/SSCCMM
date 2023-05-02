package ProgramsTY;

public class FirstMinNoWithoutBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {4,6,7,8,};
int min=arr[0];
for(int i=0;i<arr.length;i++) {
	if(min>arr[i]) {
		min=arr[i];
	}
	
}
System.out.println(min);
	}

}
