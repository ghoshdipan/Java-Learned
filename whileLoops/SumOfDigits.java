package whileLoops;
import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {

		  Scanner sc=new Scanner(System.in);
		  int n=sc.nextInt(),temp=n,sum=0;
		  
		  while(n>0) {
			  int lastDigit=n%10;
			  n/=10;
			  
			  sum+=lastDigit;
//			  System.out.println(lastDigit+"  "+n+"  "+sum);
		  }
		  System.out.println("The sum of digits of "+temp+" is "+sum);
		  
		  int noofdigits= (int)Math.log10(temp)+1;
		  System.out.println(noofdigits);
	}

}
