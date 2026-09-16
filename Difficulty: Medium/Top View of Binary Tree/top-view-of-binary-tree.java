/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/
class Solution {
    static class Info{
        int hd;
        Node node;
        
        Info(int hd, Node node){
            this.hd = hd;
            this.node = node;
        }
    }
    public ArrayList<Integer> topView(Node root) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer,Node> map = new HashMap<>();
        
        q.add(new Info(0,root));
        q.add(null);
        
        int min = 0 , max=0;
        
        while(!q.isEmpty()){
            Info currInfo = q.remove();
            if(currInfo == null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                if(!map.containsKey(currInfo.hd)){
                    map.put(currInfo.hd , currInfo.node);
                }
                
                if(currInfo.node.left != null){
                    q.add(new Info(currInfo.hd -1 , currInfo.node.left));
                    min = Math.min(min,currInfo.hd -1);
                }
                
                if(currInfo.node.right != null){
                    q.add(new Info(currInfo.hd +1 , currInfo.node.right));
                    max = Math.max(max,currInfo.hd +1);
                }
            }
        }
        
        for(int i= min ; i<=max ; i++){
            result.add(map.get(i).data);
        }
        
        return result;
        
        
    }
}