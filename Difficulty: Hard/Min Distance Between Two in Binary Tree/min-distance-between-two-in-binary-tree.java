/* A binary tree node
class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public static Node lac(Node root, int a, int b){
        if(root == null || root.data == a || root.data == b){
            return root;
        }
        
        Node foundLeft = lac(root.left,a,b);
        Node foundRight = lac(root.right,a,b);
        
        if(foundLeft == null){
            return foundRight;
        }
        
        if(foundRight == null){
            return foundLeft;
        }
        
        return root;
    }
    
    public static int distFromLac(Node root, int n){
        if(root == null){
            return -1;
        }
        
        if(root.data == n){
            return 0;
        }
        
        int leftDist = distFromLac(root.left, n);
        int rightDist = distFromLac(root.right, n);
        
        if(leftDist == -1 && rightDist == -1){
            return -1;
        }
        else if(leftDist == -1){
            return rightDist + 1;
        }
        else{
            return leftDist + 1;
        }
    }
    public int findDist(Node root, int a, int b) {
        // code here
        Node lac = lac(root,a,b);
        
        int leftDist = distFromLac(lac,a);
        int rightDist = distFromLac(lac,b);
        
        return leftDist + rightDist;
    }
}