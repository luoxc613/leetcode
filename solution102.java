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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null)
            return res;
        Queue<TreeNode> q= new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            int n=q.size();
            List<Integer> r=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                TreeNode t=q.poll();
                r.add(t.val);
                if(t.left!=null)
                    q.offer(t.left);
                if(t.right!=null)
                    q.offer(t.right);
            }
            res.add(r);
        }
        return res;
    }
}
