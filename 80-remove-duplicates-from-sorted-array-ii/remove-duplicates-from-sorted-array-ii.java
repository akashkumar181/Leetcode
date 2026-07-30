class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        if (n <= 2)
            return n;
        int count=2;
        int cm=2;
        int off=1;
        while(cm<n ){
            if(nums[off-1]==nums[cm]){
                cm++;
            }else{
                nums[off+1]=nums[cm];
                off++;
                cm++;
                count++;
            }
        }
        return count;
    }
}