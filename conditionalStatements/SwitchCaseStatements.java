package conditionalStatements;
import java.util.Scanner;


public class SwitchCaseStatements {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int dayOfWeek =sc.nextInt();
		
		switch(dayOfWeek) {
		case 1:
		case 2:
			System.out.println("I'm on leave");
			break;
		case 3:
			System.out.println("I'm in tution");
			break;
		case 4:
			System.out.println("I'm playing games!");
			break;
			
			default:
				System.out.println("I dont know what to do.");
		
		}
		
	}

}
