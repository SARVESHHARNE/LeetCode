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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        int re=0,c=0;
        ListNode l3=null;
        ListNode l4=null;
        while(true){

            if(l1!=null){
                re+=l1.val;
                l1=l1.next;
            }
           if(l2!=null){
                re+=l2.val;
                l2=l2.next;
            }
            if(c!=0){
            re+=c;
            c=0;
            }
            
            System.out.println(re);
            if(re/10>0){
                c=re/10;
            }
            if(l3!=null)
            l3=new ListNode(re%10,l3);
            else 
            l3=new ListNode(re%10);
            if(l1==null && l2==null)
            break;
            re=0;
        }
        if(c!=0)
            l3=new ListNode(c,l3);
        
        while(l3!=null){
            if(l4==null)
            l4=new ListNode(l3.val);
            else
            l4=new ListNode(l3.val,l4);
            l3=l3.next;
        }

        return l4;
    }
}