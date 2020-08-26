package arrays;
import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of elements: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements: ");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++) {
			int minIndex=i;
			for(int j=i;j<n;j++) {
				if(a[j]<a[minIndex]) {
					minIndex=j;
				}
			}
			int temp=a[i];
			a[i]=a[minIndex];
			a[minIndex]=temp;
		}
		
		for(int e:a) {
			System.out.print(e+" ");
		}
	}

}
