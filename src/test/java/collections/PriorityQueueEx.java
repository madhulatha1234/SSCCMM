package collections;

import java.util.PriorityQueue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PriorityQueue<Object> pq=new PriorityQueue<>();
pq.add(7);
pq.add(2);
pq.add(3);
//pq.add(7);
System.out.println(pq.peek());
System.out.println(pq.poll());
System.out.println(pq);
	}

}
