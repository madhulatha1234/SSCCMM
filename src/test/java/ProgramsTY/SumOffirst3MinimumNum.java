package ProgramsTY;

public class SumOffirst3MinimumNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,6,8,54};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) 
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}

	}
	int sum=0;
	int count=3;
	for(int k=0;k<count;k++) {
		sum=sum+arr[k];
		System.out.println("Sum first three num"+sum);
	}

}}
