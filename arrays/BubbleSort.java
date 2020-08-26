package arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter no of elements: ");
		int n=sc.nextInt();
		boolean sorted=true;
		int a[]=new int[n];
		System.out.println("Enter the elements: ");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++) {		
			for(int j=0;j<n-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
					sorted=false;
				}
			}
			if(sorted) break;
		}
		for(int i:a) {
			System.out.print(i+" ");
		}
	}

}
