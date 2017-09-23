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
    public boolean isSubtree(TreeNode s, TreeNode t) {
        return helper(s,t,0);
       
    }
    public boolean helper(TreeNode s, TreeNode t, int i)
    {
         if((s==null&&t!=null)||(s!=null&&t==null))
            return false;
        if(s==null&&t==null)
            return true;
        if(i==1)
        {
            if(s.val!=t.val)
                return false;
            else
                return helper(s.left,t.left,1)&&helper(s.right,t.right,1);
        }
        else{
        if(s.val==t.val)
            return (helper(s.left,t.left,1)&&helper(s.right,t.right,1))||(helper(s.left,t,0)||helper(s.right,t,0));
        else
            return helper(s.left,t,0) || helper(s.right,t,0);
        }
    }
}
