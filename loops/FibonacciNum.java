package loops;
import java.util.Scanner;

public class FibonacciNum {

	public static void main(String[] args) {

		//0 1 1 2 3 5 8 13 21
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the digit: ");
		int n=sc.nextInt();
		
		int a=0,b=1;
		System.out.print(a+" ");
		System.out.print(b+" ");
		
		for(int i=0;i<n-2;i++) {
			
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		
	}

}
