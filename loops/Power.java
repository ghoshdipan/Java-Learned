package loops;
import java.util.Scanner;

public class Power {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x and y: ");
		int x=sc.nextInt(),y=sc.nextInt();
		int power=1;
		
		for(int i=0;i<y;i++) {
			
			power*=x;
		}
		
		System.out.println("x raised to the power y = "+power);
	}

}
