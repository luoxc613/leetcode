public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res=new ArrayList<>();
        if(root==null)
            return res;
        String a=new String(String.valueOf(root.val));
        List<String> l=binaryTreePaths(root.left);
        List<String> r=binaryTreePaths(root.right);
        if(l.size()==0&&r.size()==0)
        {
            res.add(a);
            return res;
        }
      
        for(int i=0;i<l.size();i++)
        {
            String t=l.get(i);
            t=a+"->"+t;
            res.add(t);
        }
        for(int i=0;i<r.size();i++)
        {
            String t=r.get(i);
            t=a+"->"+t;
            res.add(t);
        }
        return res;
    }
}
