package vectotAndStack;
//import java.util.*;

public class MainClass {

	public static void main(String[] args) throws Exception {

		MyStack<Integer> stack=new MyStack<>();
			
		
		stack.push(15);
		stack.push(55);
		stack.push(60);
		
		for(int i=5;i>=1;i--) {
			stack.push(i*3);
		}
		stack.pop();
		int popped=stack.pop();
		stack.pop();
		
		
		System.out.println(popped);
		int peeked=stack.peek();
		
		System.out.println(peeked);
	}

}
