package cp;
import java.util.*;
public class CarProblem {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter destination distance");
		int d=sc.nextInt();
		System.out.println("Enter capacity of car");
		int m=sc.nextInt(),temp=m;
		System.out.println("Enter no of pumps");
		int n=sc.nextInt();
		int [] a=new int[n+1];
		for(int i=0;i<n;i++){
			System.out.println("Enter the distance of "+(i+1)+"th pump");
		    a[i]=sc.nextInt();
		}
		a[n]=d;
		int count=0,distanceCovered=0;
		int i=0;
		boolean Possible=true;
		while(distanceCovered<d){
			
			if(a[0]>m) {
				Possible=false;
				break;
			}
	    	
	        if(a[i]<m) {
	        	distanceCovered=a[i];
	        	i++;
	        	continue;
	        }else if(a[i]>m) {
	        	distanceCovered=a[i];
	        	m=a[i-1]+temp;
	        	count++;
	        	if(m<distanceCovered) {
		        	count=-1;
		        	Possible=false;
		        	break;
	        }
        }
        else {
        	count++;
        	distanceCovered=a[i];
        	m=a[i]+temp;
        	if(m<distanceCovered) {
	        	count=-1;
	        	Possible=false;
	        	break;
        	}
        }
		    if(!Possible) break;
	}
		
		System.out.print("No of stops: "+count);

	}

}
