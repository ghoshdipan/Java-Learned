package linkedList;

public class Mainclass {

	public static void main(String[] args) {

		MyLinkedList<Integer> mll=new MyLinkedList<>();
		
		for(int i=0;i<11;i++) {
			mll.add(i*2);
		}
		mll.get(6);
		mll.set(2, 55);
		mll.print();
		mll.set(6,100);
		mll.print();
		mll.remove(6);
		mll.print();
		
	}

}
