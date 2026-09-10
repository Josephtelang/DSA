class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;
        int balanceSubStringsCount = 0;

        for(int i=0 ; i<s.length() ; i++){
            char currChar = s.charAt(i);
            if(currChar == 'L'){
                count++;
            }
            else{
                count--;
            }

            if(count==0){
                balanceSubStringsCount++;
            }
        }

        return balanceSubStringsCount++;
    }
}