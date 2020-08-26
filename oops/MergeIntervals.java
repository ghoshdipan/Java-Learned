package oops;
import java.util.*;

class Interval{
	int start;
	int end;
	
	Interval(int start,int end){
		this.start=start;
		this.end=end;
	}
}

public class MergeIntervals {
	
	public static List<Interval> mergeInterval(List<Interval> intervals){
		
		if(intervals==null || intervals.size()==0) return intervals;
		
		Collections.sort(intervals,Comparator.comparing((Interval it1)->it1.start));
		Interval current=intervals.get(0);
		for(int i=1;i<intervals.size();i++) {
			Interval next=intervals.get(i);
			if(current.end<=next.start) {
				current.end=Math.max(current.end,next.end);
			}else{
				intervals.add(next);
				current=next;
			}
		}
		intervals.add(current);
		return intervals;
	}

	public static void main(String[] args) {

		List<Interval> intervals=new ArrayList<>();
		
		intervals.add(new Interval(1,4));
		intervals.add(new Interval(2,5));
		intervals.add(new Interval(6,9));
		intervals.add(new Interval(7,8));
		intervals.add(new Interval(9,15));
		intervals.add(new Interval(14,25));
		intervals.add(new Interval(26,30));
		intervals.add(new Interval(30,255));
//		intervals.add(new Interval(2,3));
//		intervals.add(new Interval(5,9));
		
		mergeInterval(intervals);
		for(Interval result:intervals) {
			System.out.println(result.start+" "+result.end);
		}
		
	}

}
