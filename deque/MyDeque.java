package deque;

public class MyDeque<E> {
	
	Node<E> head,tail;
	
	public void addToHead(E e) {
		Node<E> toAdd=new Node<>(e);
		if(head==null) {
			head=tail=toAdd;
		}
		head.next=toAdd;
		head=head.next;
		toAdd.prev=head;
	}
	
	public E removeLast() {
		if(head==null) {
			return null;
		}
		Node<E> temp=tail;
		tail=tail.next;
		tail.prev=null;
		if(tail==null) {
			head=null;
		}
		
		return temp.data;
		
	}
	
	public static class Node<E>{
		E data ;
		Node<E> next,prev;
		
		public Node(E data){
			this.data=data;
			this.next=this.prev=null;	
		}
	}

}
