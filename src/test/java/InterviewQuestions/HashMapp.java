package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class HashMapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Object, Object> map=new HashMap<Object, Object>();
map.put(1,"map" );
map.put(2,true);
map.put(3,6);
for (Map.Entry<Object,Object> mapp:map.entrySet()) {
	System.out.println(mapp.getKey()+":"+mapp.getValue());
}
	}

}
