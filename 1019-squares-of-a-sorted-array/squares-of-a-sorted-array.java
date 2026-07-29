class Solution {
    public int[] sortedSquares(int[] nums) {
       int n=nums.length;
       ArrayList<Integer>list1=new ArrayList<>();
       ArrayList<Integer>list2=new ArrayList<>();
       for(int i=0;i<n;i++){
        if(nums[i]>=0){
         list1.add(nums[i]*nums[i]);
        }else{
            list2.add(nums[i]*nums[i]);
        }
       }
        Collections.reverse(list2);
        ArrayList<Integer>ans=new ArrayList<>();
        int n1=list1.size();
        int n2=list2.size();
        int i=0;
        int j=0;
        while(i<n1 && j<n2){
            if(list1.get(i)<=list2.get(j)){
                ans.add(list1.get(i));
                i++;
            }else{
                ans.add(list2.get(j));
                j++;
            }
        }
        while(i<n1){
            ans.add(list1.get(i));
            i++;
        }
           while(j<n2){
            ans.add(list2.get(j));
            j++;
        }
        int[]finala=new int[ans.size()];
        for(int k=0;k<finala.length;k++){
            finala[k]=ans.get(k);

        }
        return finala;
       
    }
}