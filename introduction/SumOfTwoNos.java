package introduction;

public class SumOfTwoNos {

	public static void main(String[] args) {
		System.out.println("Dipan "+"Ghosh");
		System.out.println("Sum "+sum(4,5));
		System.out.println("Diff "+sub(6,2));
		System.out.println("Mul "+mul(6,2));
		System.out.println("Div "+div(6,2));
		System.out.println("Average "+avg(5,4,9,7,1));
		System.out.println("ASCII "+ascii('H'));
	}

	public static int ascii(char i) {
		return i;
	}

	public static float mul(int i, int j) {
		return (float)i*j;
	}
	
	public static float div(int i, int j) {
		return (float)i/j;
	}

	public static float avg(int i, int j, int k, int l, int m) {
		return (float)(i+j+k+l+m)/5;
	}

	public static int sub(int first, int second) {
		return first-second;
	}

	public static int sum(int first, int second) {
		return first+second;
		
	}
	

}
