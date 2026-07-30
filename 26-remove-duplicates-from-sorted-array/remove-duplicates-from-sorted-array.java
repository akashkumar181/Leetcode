class Solution {
    public int removeDuplicates(int[] nums) {
        int cm=1;
        int off=0;
        int count=1;
        int n=nums.length;
        while(cm<n && off <cm  ){
            if(nums[cm]==nums[cm-1]){
                cm++;
                continue;
            }
            nums[off+1]=nums[cm];
            cm++;
            off++;
            count++;
        }
        return count;
    }
}