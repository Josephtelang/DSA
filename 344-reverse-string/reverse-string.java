class Solution {
    public void reverseString(char[] s) {
        reverseString1(s,0,s.length-1);

        
    }
    public static void reverseString1(char s[],int left , int right){
        // base case
        if(left>=right){
            return;
        }

        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;

        reverseString1(s,left+1,right-1);

    }
}