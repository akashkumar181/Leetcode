class Solution {

    public void level(TreeNode root, List<List<Integer>> list) {

        if (root == null) {
            return;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {

            int n = q.size();

            List<Integer> ans = new ArrayList<>();

            for (int i = 0; i < n; i++) {

                TreeNode front = q.poll();

                ans.add(front.val);

                if (front.left != null) {
                    q.add(front.left);
                }

                if (front.right != null) {
                    q.add(front.right);
                }
            }

            list.add(ans);
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> list = new ArrayList<>();

        level(root, list);

        return list;
    }
}