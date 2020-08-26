package loops;

import java.util.Scanner;

public class SeriesSum {

	public static void main(String[] args) {

		System.out.println("Enter n ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		float result=0;
		
		/*
		 * for(float i=1;i<=n;i++) {
		 * 
		 * result+=1/i;
		 * 
		 * }
		 */
		
		for(float i=1;i<=n;i++) {
			
			if(i%2==0) {
				result-=i;
			}else {
				result+=i;
			}
		}
		
		System.out.println("Series: "+result);
	}

}
