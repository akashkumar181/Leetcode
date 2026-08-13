/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void inorderr1(TreeNode p,List<Integer>list1){
                if(p==null){
                  list1.add(null);
                  return;
                }
         list1.add(p.val);
         inorderr1(p.left,list1);
         inorderr1(p.right,list1);
    }
    public void inorder2(TreeNode q,List<Integer>list2){
                if(q==null){
                   list2.add(null);
                   return;
                }
         list2.add(q.val);
         inorder2(q.left,list2);
         inorder2(q.right,list2);
    }
    
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        }
         if (p == null || q == null) {
            return false;
        }
        List<Integer>list1=new ArrayList<>();
        List<Integer>list2=new ArrayList<>();

        inorderr1(p,list1);
        inorder2(q,list2);
        return list1.equals(list2);
        
    }
}