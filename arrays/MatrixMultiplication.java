package arrays;
import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row & colum of a: ");
		int r1=sc.nextInt();
		int c1=sc.nextInt();
		
		System.out.println("Enter row & colum of b: ");
		int r2=sc.nextInt();
		int c2=sc.nextInt();
		
		if(c1==r2) {
				int a[][]=new int[r1][c1];
				int b[][]=new int[r2][c2];
				int c[][]=new int[r1][c2];
				
				System.out.println("Enter elements of array a: ");
				for(int i=0;i<r1;i++) {
					for(int j=0;j<c1;j++) {
						a[i][j]=sc.nextInt();
					}
				}
				System.out.println("Enter elements of array b: ");
				for(int i=0;i<r2;i++) {
					for(int j=0;j<c2;j++) {
						b[i][j]=sc.nextInt();
					}
				}
				for(int i=0;i<r1;i++) {
					for(int j=0;j<c2;j++) {
						for(int k=0;k<c1;k++) {
							c[i][j]+=a[i][k]*b[k][i];
						}
					}
				}
				System.out.println("Matrix c: ");
				for(int i=0;i<r1;i++) {
					for(int j=0;j<c2;j++) {
						System.out.print(c[i][j]+" ");
					}
					System.out.println();
				}
		}else {
			System.out.println("Invalid matrix a or b!");
		}
	}
}
