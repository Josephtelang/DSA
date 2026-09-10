class Solution {
    public String getSmallestString(int n, int k) {
        StringBuilder resultStr = new StringBuilder("a".repeat(n));
        int extra = k-n;

        for(int i=n-1 ; i>=0 ; i--){
            if(extra>0){
                int take = Math.min(extra, 25);
                resultStr.setCharAt(i,(char)('a'+take));
                extra -= take;

            }
            else{
                break;
            }
        }

        return resultStr.toString();
        
    }
}