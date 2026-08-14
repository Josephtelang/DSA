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
        ArrayList<ListNode> llHeads = new ArrayList<>();
        for(int i=0 ;i<lists.length ;i++){
            llHeads.add(lists[i]);
        }
        ListNode mergeHead = new ListNode(-1);
        ListNode mergeTail = mergeHead;

        while(true){
            ListNode smallNode = null;
            int smallNodeIndex = -1;
            for(int i=0 ;i<lists.length ;i++){
                if((llHeads.get(i) != null) && (smallNode == null || llHeads.get(i).val < smallNode.val)){
                    smallNode = llHeads.get(i);
                    smallNodeIndex = i;
                }
            }

            if(smallNode == null){
                break;
            }

            mergeTail.next = smallNode;
            llHeads.set(smallNodeIndex,smallNode.next);
            mergeTail = mergeTail.next;
        }

        return mergeHead.next;
    }
}