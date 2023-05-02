package Practice;

public class practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String arr="maddhuu";

for (int i = 0; i < arr.length; i++){
	int count =0;
	for (int j = 0; j < arr.length; j++) {

		if(arr[i]==arr[j]) {
			if(j<i){
				break;
			}
			count++;
		}
	}
	if(count>1) {
		System.out.print(arr[i]+" ");
	}
}
System.out.print(" ]");
}
	}

}
