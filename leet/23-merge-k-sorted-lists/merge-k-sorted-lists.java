/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)
            return null;
        ListNode ans=lists[0];
        if(lists.length==1)
            return ans;
        ListNode cur=ans;
        while(cur!=null){
            if(cur.next==null)
                break;
            cur=cur.next;
        }
        //System.out.println(cur.val);
        for(int i=1;i<lists.length;i++){
            if(lists[i]==null)
                continue;
            ListNode start=new ListNode();
            ListNode end=start;
            ListNode tmp=ans;
            while(tmp!=null&&lists[i]!=null){
                if(tmp.val<lists[i].val){
                    end.val=tmp.val;
                    end.next=new ListNode();
                    end=end.next;
                    tmp=tmp.next;
                }else{
                    end.val=lists[i].val;
                    end.next=new ListNode();
                    end=end.next;
                    lists[i]=lists[i].next;
                }
            }
            if(tmp!=null){
                end.val=tmp.val;
                end.next=tmp.next;
            }
            if(lists[i]!=null){
                end.val=lists[i].val;
                end.next=lists[i].next;
            }
            ans=start;
        }
        return ans;
    }
}