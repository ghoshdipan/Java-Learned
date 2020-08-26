package cp;

public class TwoSum {

	public static void main(String[] args) {
		
		int[] a= {3,2,4};
		
		System.out.println(twoSum(a,6));

	}
	

    public static int[] twoSum(int[] nums, int target) {

	    for(int i=0;i<nums.length;i++){
	        for(int j=i+1;j<nums.length;j++){
	            if(nums[i]+nums[j]==target) return new int[] {i,j};
	        }
	    }
	    
	    throw new IllegalArgumentException("No sum found");
	    
    }
}
