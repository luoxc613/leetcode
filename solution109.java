/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer>  l= new ArrayList<>();
        while(head!=null)
        {
            l.add(head.val);
            head=head.next;
        }
        return getTree(l,0,l.size()-1);
    }
    public TreeNode getTree(List<Integer> l, int s,int e)
    {
        if(s<e)
        {
            int mid=s+(e-s)/2;
            TreeNode root= new TreeNode(l.get(mid));
            root.left=getTree(l,s,mid-1);
            root.right=getTree(l,mid+1,e);
            return root;
        }
        else if(e<s)
            return null;
        else 
            return new TreeNode(l.get(s));
    }
}
