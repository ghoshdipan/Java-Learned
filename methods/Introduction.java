package methods;

public class Introduction {

	public static void main(String[] args) {
		
		int firstNo=34;
		int secondNo=54;
		
		int result=maxOf(firstNo,secondNo);
		System.out.println(result);
		
		maxOf(76,22);
		sayHi();
	}
	
	static int maxOf(int a,int b) {
		if(a>b) {
			return a;
		}else return b;
	}
	
	static void sayHi() {
		System.out.println("Hi!");
		System.out.println("Good Mrng");

	}
}
