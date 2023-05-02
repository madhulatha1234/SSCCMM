package ProgramsTY;

public class FirstmaxnumWithoutBubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,6,7,8,};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				arr[i]=max;
			}
			
		}
		System.out.println(max);

	}

}
