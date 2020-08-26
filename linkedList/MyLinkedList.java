package linkedList;

public class MyLinkedList<E>{
	
	Node<E> head;
	
	public void add(E data){
		Node<E> toadd=new Node<E>(data);
		Node<E> temp=head;
		
		if(temp==null) {
			head=toadd;
		}else {
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=toadd;
		}
	}
	
	public boolean isEmpty() {
		return head==null;
	}
	
	public E LastElement() throws Exception {
		Node<E> temp=head;
		
		if(temp==null) {
			throw new Exception("Cannot retrive element from empty Linked List.");
		}
		while(temp.next!=null) {
			temp=temp.next;
		}
		return temp.data;	
	}
	
	
	public E RemoveLast() throws Exception {
		Node<E> temp=head;
		
		if(temp==null) {
			throw new Exception("Cannot remove last element from empty Linked list.");
		} else if(temp.next==null) {
			Node<E> toRemove=head;
			head=null;
			return toRemove.data;
		}
		
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		Node<E> toRemove=temp.next;
		temp.next=null;
		
		return toRemove.data;
	}
	
	
	public void get(int pointer) {
		Node<E> current=head;
		
		for(int i=0;i<pointer;i++) {
			current=current.next;
		}
		System.out.println(current.data);
	}
	
	
	public void add(int pointer,E data){
		Node<E> toadd=new Node<E>(data);
		Node<E> current=head;
		
		if(head==null) {
			head=toadd;
		}else {
			for(int i=0;i<pointer-1;i++) {
				current=current.next;
			}
			toadd.next=current.next;
			current.next=toadd;
		}
	}
	
	
	public static class Node<E>{
		public E data;
		public Node<E> next;
		
		public Node(E data){
			this.data=data;
			next=null;
		}
	}
	
	public void remove(int index){
		Node<E> current=head;
		
		for(int i=0;i<index-1;i++) {
			current=current.next;
		}
		Node<E> todelete=current.next;
		current.next=todelete.next;
	}
	
	
	public Node<E> reverse() {
		
		Node<E> prev=null;
		Node<E> current=head;
		Node<E> next=null;
		
		while(current!=null) {
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;		
		return head;
	}

	
	public void set(int index,E data) {
		Node<E> current=head;
		
		if(head!=null) {
			for(int i=0;i<index-1;i++) {
				current=current.next;
			}
			Node<E> temp=current.next;
			temp.data=data;
		}
		
	}
	
	
	public void clear() {
		head=null;
	}
	
	public void print() {
		
		Node<E> temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();	
	}
	
	
}
