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
    public ListNode[] splitListToParts(ListNode head, int k) {
    ListNode temp=head;
    ListNode[] list=new ListNode[k];
    int size=0;
    while(temp!=null){
        size++;
        temp=temp.next;
    }
    int n=size/k;
    int m=size%k;
    ListNode curr=head;
    ListNode pre=curr;
    for(int i=0;i<k;i++){
       ListNode newPart=curr;
       int currsize=n;
       if(m>0){
           m--;
           currsize++;
        }
       int j=0;
       while(j<currsize){
          pre=curr;
          curr=curr.next;
          j++;
        }
       if(pre!=null){
          pre.next=null;
        }
       list[i]=newPart;
    }
     return list;
  }
}