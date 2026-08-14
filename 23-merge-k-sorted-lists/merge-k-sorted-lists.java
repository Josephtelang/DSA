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

    public static ListNode mergeKLists(ListNode lists[] , int start  , int end ){
        if(start == end ){
            return lists[start];
        }

        int mid = start + (end - start)/2;

        ListNode leftNode = mergeKLists(lists,start,mid);
        ListNode rightNode = mergeKLists(lists,mid+1,end);

        return mergeTwoLists(leftNode,rightNode);
    }

    public static ListNode mergeTwoLists(ListNode leftNode, ListNode rightNode){
        ListNode mergeHead = new ListNode(-1);
        ListNode mergeTail = mergeHead;

        while(leftNode != null && rightNode != null){
            if(leftNode.val <= rightNode.val){
                mergeTail.next = leftNode;
                leftNode = leftNode.next;
            }
            else{
                mergeTail.next = rightNode;
                rightNode = rightNode.next;
            }
            mergeTail = mergeTail.next;
        }

        // remain left
        while(leftNode != null){
            mergeTail.next = leftNode;
            leftNode = leftNode.next;
            mergeTail = mergeTail.next;
        }

        // remain right
        while(rightNode != null){
            mergeTail.next = rightNode;
            rightNode = rightNode.next;
            mergeTail = mergeTail.next;
        }

        return mergeHead.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0){
            return null;
        }

        return mergeKLists(lists,0,lists.length-1);


    //     ArrayList<ListNode> llHeads = new ArrayList<>();
    //     for(int i=0 ;i<lists.length ;i++){
    //         llHeads.add(lists[i]);
    //     }
    //     ListNode mergeHead = new ListNode(-1);
    //     ListNode mergeTail = mergeHead;

    //     while(true){
    //         ListNode smallNode = null;
    //         int smallNodeIndex = -1;
    //         for(int i=0 ;i<lists.length ;i++){
    //             if((llHeads.get(i) != null) && (smallNode == null || llHeads.get(i).val < smallNode.val)){
    //                 smallNode = llHeads.get(i);
    //                 smallNodeIndex = i;
    //             }
    //         }

    //         if(smallNode == null){
    //             break;
    //         }

    //         mergeTail.next = smallNode;
    //         llHeads.set(smallNodeIndex,smallNode.next);
    //         mergeTail = mergeTail.next;
    //     }

    //     return mergeHead.next;
        

    }
}