package userInput;
import java.util.Scanner;

public class simpleInterest {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int p= sc.nextInt();
		float r=sc.nextFloat();
		float t=sc.nextFloat(),si=0;
		
		si=p*r*t/100;
		
		System.out.println("Simple interest is "+si);
	}

}
