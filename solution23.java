/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode res=new ListNode(0);
        if(lists.length==0||lists==null)
            return null;
        if(lists.length==1)
            return lists[0];
        int size=lists.length;
        
        res.next=mergeL(lists,0,size-1);
        return res.next;
    }
    
    public ListNode mergeL(ListNode[] lists, int s,int e)
    {
        if(s==e)
            return lists[s];
        if(s==e-1)
            return mergeTwo(lists[s],lists[e]);
        else
        {
            int m=(s+e)/2;
            ListNode l1=mergeL(lists,s,m);
            ListNode l2=mergeL(lists,m+1,e);
            return mergeTwo(l1,l2);
        }
    }
    public ListNode mergeTwo(ListNode l1, ListNode l2)
    {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        
        if(l1.val < l2.val) {
            l1.next = mergeTwo(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwo(l2.next, l1);
            return l2;
        }
        
    }
    
}
