class Solution {
public:

    int preIndex = 0;

    TreeNode* tt(vector<int>& preorder, vector<int>& inorder,
                 int start, int end)
    {
        if(start > end)
            return NULL;

        TreeNode* root = new TreeNode(preorder[preIndex++]);

        int index;

        for(int i = start; i <= end; i++)
        {
            if(inorder[i] == root->val)
            {
                index = i;
                break;
            }
        }

        root->left = tt(preorder, inorder, start, index-1);
        root->right = tt(preorder, inorder, index+1, end);

        return root;
    }

    TreeNode* buildTree(vector<int>& preorder, vector<int>& inorder) {

        int start = 0;
        int end = preorder.size()-1;

        return tt(preorder, inorder, start, end);
    }
};