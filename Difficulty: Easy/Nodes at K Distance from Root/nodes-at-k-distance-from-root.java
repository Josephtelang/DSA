/* Structure of Binary Tree Node 
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
};*/

class Solution {
    public void kthLevel(Node root,int k, int level, ArrayList<Integer> result){
        if(root == null){
            return;
        }
        
        if(level == k ){
            result.add(root.data);
            return;
        }
        
        kthLevel(root.left,k,level+1,result);
        kthLevel(root.right,k,level+1,result);
    }
    public ArrayList<Integer> kdistance(Node root, int k) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        
        kthLevel(root,k,0,result);
        
        return result;
    }
    
};