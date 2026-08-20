class Solution {
    public int minSubArrayLen(int target, int[] nums) {
          int mini = Integer.MAX_VALUE;
        int sum=0;
        int n=nums.length;
        int i=0;
        int j=0;

        while(i<n){
            sum=sum+nums[i];
            

            while(sum>=target){
             int len=i-j+1;
             mini=Math.min(len,mini);
             sum=sum-nums[j];
             j++;
            }
            i++;
        }
        if(mini == Integer.MAX_VALUE){
            return 0;
        }
        return mini;
        
    }
}