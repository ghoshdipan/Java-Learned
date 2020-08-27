package cp;
import java.util.*;
public class CarProblem {

	public static void main(String[] args) {
		
		
		/*
		 * Scanner sc=new Scanner(System.in);
		 * System.out.println("Enter destination distance"); int d=sc.nextInt();
		 * System.out.println("Enter capacity of car"); int m=sc.nextInt(),temp=m;
		 * System.out.println("Enter no of pumps"); int n=sc.nextInt(); int [] a=new
		 * int[n+1]; for(int i=0;i<n;i++){
		 * System.out.println("Enter the distance of "+(i+1)+"th pump");
		 * a[i]=sc.nextInt(); } a[n]=d; int count=0,distanceCovered=0; int i=0; boolean
		 * Possible=true;
		 * 
		 * while(distanceCovered<d){
		 * 
		 * if(a[0]>m) { Possible=false; break; }
		 * 
		 * if(a[i]<m) { distanceCovered=a[i]; i++; continue; }else if(a[i]>m) {
		 * distanceCovered=a[i]; m=a[i-1]+temp; count++; if(m<distanceCovered) {
		 * count=-1; Possible=false; break; } } else { count++; distanceCovered=a[i];
		 * m=a[i]+temp; if(m<distanceCovered) { count=-1; Possible=false; break; } }
		 * if(!Possible) break; }
		 * 
		 * System.out.print("No of stops: "+count);
		 */
		int[] a= {9,11,20,29,31,40,49,51};
		//int[] a= {1,2,5,9,10};
		 System.out.println(carProblem(60,10,a));
	}
	
		static public int carProblem(int d,int m,int[] a) {
			int n=a.length;
			int current=0;
			int currentFuel=m;
			//int distanceToCover=0;
			int refill=0;
			
			while(current<n-1) {
				if(currentFuel<a[current+1]-a[current]) {
					currentFuel=m;
					refill++;
				}
				
				currentFuel-=a[current+1]-a[current];
				current++;
				if(currentFuel<0) {
					refill=-1;
				}
			}
			return refill;
			
			
			

			/*
			 * if(a[0]<=m) { distanceToCover=m-a[0]; }else return -1;
			 * 
			 * while(current!=n-2) {
			 * 
			 * if(distanceToCover<a[next]-a[current]) { refill++; distanceToCover=m;
			 * 
			 * if(a[next]-a[current]>distanceToCover) { refill=-1; break; } }else {
			 * current++; next++; distanceToCover-=a[next]-a[current]; } }
			 * 
			 * if(d-a[current]>distanceToCover) { refill++;
			 * distanceToCover=m-(d-a[current]); }
			 * 
			 * return refill;
			 */
	}
}
