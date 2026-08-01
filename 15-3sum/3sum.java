class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
       List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<n-2;i++){
            int left=i+1;
            int right=n-1;
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            while(left<right){
         int sum=nums[i]+nums[left]+nums[right];
         if(sum==0){
           List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);

                    ans.add(list);
         
         while(left<right && nums[left]==nums[left+1]){
          left++;
         }
           while(left<right && nums[right]==nums[right-1]){
            right--;
         }
         left++;
         right--;
            }else if(sum<0){
                left++;
               
            }else{
               right--;
            }
            }

        }
        return ans;
    }
}