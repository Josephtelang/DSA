class Solution {
    public int reverseBits(int n) {
        int total_result =0 ;
        for (int i=0 ; i<32 ; i++){
            int result = n & 1;
            total_result <<= 1;
            total_result |= result;
            n >>= 1;

            
        }
        return total_result;
        
    }
}