package queue;
import linkedList.MyLinkedList.Node;
public class MyQueue<E> {
	
	public Node<E> head,rear;
	
	public void enqueue(E e){
		Node<E> toAdd=new Node<>(e);
		
		if(head==null) {
			head=rear=toAdd;
		}
		rear.next=toAdd;
		rear=rear.next;

	}
	
	public E peek() {
		if(head==null) {
			return null;
		}
		return head.data;
	}
	
	public E dequeue() {
		
		if(head==null) {
			return null;
		}
		Node<E> temp=head;
		if(head==null) {
			rear=head;
		}
		
		head=head.next;
		return temp.data;
	}
	
}
