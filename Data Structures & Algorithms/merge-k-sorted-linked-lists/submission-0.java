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

        if(lists==null || lists.length==0){
            return null;
        }
        return mergelist(lists,0,lists.length-1);

    }

    public ListNode mergelist(ListNode[] list,int start,int end){
        if(start==end){
            return list[start];
        }
        int mid=start+(end-start)/2;
        ListNode list1=mergelist(list,start,mid);
        ListNode list2=mergelist(list,mid+1,end);

        return merge(list1,list2);
    }

    public ListNode merge(ListNode list1,ListNode list2){
        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy;
        while(list1!=null && list2!=null){

            if(list1.val<=list2.val){
                curr.next=list1;
                list1=list1.next;
            }
            else{
                 curr.next=list2;
                list2=list2.next;

            }
            curr=curr.next;
        }
        if(list1!=null){
            curr.next=list1;

        }
        else{
              curr.next=list2;

        }
        return dummy.next;
    }
}
