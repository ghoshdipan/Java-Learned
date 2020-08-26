package queue;

public class MainClass {

	public static void main(String[] args) {
		
		MyQueue<Integer> mq=new MyQueue<>();
		
		mq.enqueue(15);
		mq.enqueue(305);
		mq.enqueue(3);
		mq.enqueue(75);
		
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		mq.enqueue(705);
		System.out.println(mq.peek());
	}

}
