package vectotAndStack;
import linkedList.MyLinkedList;

public class MyStack<E> {
	
	public MyLinkedList<E> mll=new MyLinkedList<>();
	
	public void push(E e) {
		mll.add(e);
	}
	
	public E pop() throws Exception {
		if(mll.isEmpty()) {
			throw new Exception("Cannot pop from a empty LinkedList");
		}
		return mll.RemoveLast();
	}
	
	public E peek() throws Exception {
		if(mll.isEmpty()) {
			throw new Exception("Cannot peek from a empty LinkedList");
		}
		return mll.LastElement();
		
	}
	
}
