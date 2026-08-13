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
    public void preorder1(List<Integer>list1,TreeNode root){
        if(root==null){
            list1.add(null);
            return;
        }
        list1.add(root.val);
        preorder1(list1,root.left);
        preorder1(list1,root.right);


    }
    public void preorder2(List<Integer>list2,TreeNode subRoot){
             if(subRoot==null){
            list2.add(null);
            return;
        }
        list2.add(subRoot.val);
        preorder2(list2,subRoot.left);
        preorder2(list2,subRoot.right);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        List<Integer>list1=new ArrayList<>();
        List<Integer>list2=new ArrayList<>();
       
        preorder1(list1,root);
        preorder2(list2,subRoot);
        for (int i = 0; i <= list1.size() - list2.size(); i++) {

    if (list1.subList(i, i + list2.size()).equals(list2)) {
        return true;
    }
}

return false;
        
        
    }
}