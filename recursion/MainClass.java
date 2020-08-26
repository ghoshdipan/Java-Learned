package recursion;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		float x=sc.nextFloat();
		float y=sc.nextFloat();
		if(x%5==0){
		    System.out.println(y-x-0.5);
		}
		System.out.println(y);

	}
	
//	static int sum(int n) {
//		if(n==1) {
//			return 1;
//		}
//		return n+sum(n-1);
//	}
//	
//	static int pow(int a,int b) {
//		if(b==0) {
//			return 1;
//		}
//		return a*pow(a,b-1);
//	}

}
