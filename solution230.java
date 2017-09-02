/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        if(root.left==null && root.right==null)
            return root.val;
        int a=number(root.left);
        if(a+1==k)
            return root.val;
        else
            if(a+1>k)
                return kthSmallest(root.left,k);
        else
            return kthSmallest(root.right,k-a-1);
    }
    public int number(TreeNode root)
    {
        if(root==null)
            return 0;
        int a=number(root.left);
        int b=number(root.right);
        return a+b+1;
    }
}
