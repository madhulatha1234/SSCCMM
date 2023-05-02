package Practice;

public class WORK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str[]= {"rakshit","chat","zoom"};
for(int i=0;i<str.length;i++) {
	char[] value = str[i].toCharArray();
	//System.out.println(value);
	int count=0;

	for(int j=0;j<value.length;j++) {
				if(value[j]=='a'||value[j]=='e'||value[j]=='i'||value[j]=='o'||value[j]=='u') {
			count++;
		}
		//System.out.print(value[j]+" "+count);
	}
	System.out.println(str[i]+" "+count);
}
	}

}
