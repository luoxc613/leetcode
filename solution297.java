 /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder str=new StringBuilder();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null)
            return str.toString();
        q.offer(root);
        while(!q.isEmpty()){
                TreeNode t=q.poll();
                if(t==null)
                {
                    str.append("n ");
                    continue;
                }
                str.append(t.val+" ");
                q.offer(t.left);
                 q.offer(t.right);
            
        }
        return str.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
       if (data.length()==0)return null;
        Queue <TreeNode> q= new LinkedList<>();
        String [] s=data.split(" ");
        TreeNode root=new TreeNode(Integer.parseInt(s[0]));
        q.add(root);
        for(int i=1;i<s.length;i++)
        {
         TreeNode t=q.poll();
            if(!s[i].equals("n"))
            {
                TreeNode l=new TreeNode(Integer.parseInt(s[i]));
                t.left=l;
                q.add(l);
            }
            if(i+1<s.length&&!s[++i].equals("n"))
            {
                TreeNode r=new TreeNode(Integer.parseInt(s[i]));
                t.right=r;
                q.add(r);
            }
        }
        return root;
    }
    
}
