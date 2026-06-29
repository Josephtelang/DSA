class Solution {
    public int kthGrammar(int n, int k) {
        if (n==1){
            return 0;
        }

        int parent = (k+1)/2;
        if (k%2==0){
            return 1-kthGrammar(n-1,parent);
        }
        else{
            return kthGrammar(n-1,parent);
        }
        
    }
}