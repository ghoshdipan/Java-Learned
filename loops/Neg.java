package loops;

import java.util.Scanner;

public class Neg {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		/*for(;;) {
			
			
			 * int n=sc.nextInt(); if(n<0) break;
			 */
			for(int i=1;i<=100;i++) {
				if(40<=i&&i<=50) {
					continue;
				}
				
				System.out.println(i);
				
			}
		}
	}


