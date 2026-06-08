class Solution {
    public int longestConsecutive(int[] nums) {
        
     int maxi = Integer.MIN_VALUE;
    if(nums.length<1)
        return 0;
    	
  

    Arrays.sort(nums);
    for(int num:nums)
    	System.out.println(num);
    int res=1;
    maxi=res;
    for(int i=0;i<nums.length-1;i++){
        if(nums[i+1]==nums[i]+1)
        {
            res++;
            maxi = Math.max(res,maxi);
        }
        else if(nums[i+1]==nums[i])
        	continue;
        else
            res=1;

    
    }


        return maxi;
    }
}
