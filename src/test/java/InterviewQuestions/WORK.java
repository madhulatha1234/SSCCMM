package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class WORK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Object, Object> map= new HashMap<Object, Object>();
map.put(1,"hhh");
map.put(4,false);
map.put(6,88.99);
for(Map.Entry<Object,Object> mapp:map.entrySet()) {
	System.out.println(mapp.getKey()+":"+mapp.getValue());
}
	}

}
