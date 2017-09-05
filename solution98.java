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
    public boolean isValidBST(TreeNode root) {
        if(root==null)
            return true;
        boolean l=helper(root.left,Long.MIN_VALUE,root.val);
        boolean r=helper(root.right,root.val,Long.MAX_VALUE);
        return l&r;
    }
    public boolean helper(TreeNode root,long l,long r)
    {
        if(root==null)
            return true;

        if(root.val<=l||root.val>=r)
            return false;
        return helper(root.left,l,root.val)&&helper(root.right,root.val,r);
    }
}
