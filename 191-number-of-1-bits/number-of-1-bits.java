class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        int bitmask = 1;
        while(n!=0){
            if((n & bitmask) !=0){
                count++;
            }
            n = n >> 1;
        }
        return count;

        // while(n!=0){
        //     n = n & (n-1);
        //     count++;
        // }
        // return count;
        
    }
}