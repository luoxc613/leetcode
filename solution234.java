/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null)
            return true;
        ListNode t=head;
        List<Integer> l=new ArrayList<>();
        while(t!=null)
        {
            l.add(t.val);
            t=t.next;   
        }
        int n=l.size();
        for(int i=0,j=n-1;i<=j;i++,j--)
        {
            if((int)l.get(i)!=(int)l.get(j))
                return false;
        }
        return true;
        
    }
}
