package whileLoops;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");  
		int n=sc.nextInt(),temp=n,reverse=0;
		  
		  while(temp>0) {
			  int lastDigit =temp%10;
			  temp/=10;
			  
			  reverse=10*reverse+lastDigit;
		  }
		  if(reverse==n) {
			  System.out.println("Yepp! A Palindrome");
			  }else {
				  System.out.println("Not a Palindrome!");
			  }
	  }
}
