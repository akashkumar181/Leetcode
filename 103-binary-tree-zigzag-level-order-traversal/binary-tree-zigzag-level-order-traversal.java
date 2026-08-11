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
    public void zigzing(TreeNode root, List<List<Integer>>list){
        if(root==null){
            return;
        }
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        int count=0;

        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> ans = new ArrayList<>();
            for(int i=0;i<size;i++){
               
                TreeNode front=q.poll();
                ans.add(front.val);
                if(front.right!=null){
                    q.add(front.right);
                }
                if(front.left!=null){
                    q.add(front.left);
                }
            
            }
           
                if(count%2==0){
                    Collections.reverse(ans);
                }
            
            list.add(ans);
                count++;

        }
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>list=new ArrayList<>();
        zigzing(root,list);
        return list;
        
    }
}