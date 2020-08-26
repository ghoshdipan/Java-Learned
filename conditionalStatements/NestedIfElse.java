package conditionalStatements;
import java.util.Scanner;

public class NestedIfElse {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(), b=sc.nextInt(),c=sc.nextInt();
		int result=0;
		
		/*
		 * if(a>b) { if(a>c) { result=a; }else { result=c; } }else { if(c>b) { result=c;
		 * }else { result=b; } }
		 */	
		
		result=a>b ? a>c ? a:c:b>c ? b:c;
		
		System.out.println("Largest of three nos is "+result);
	}

}