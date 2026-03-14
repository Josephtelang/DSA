class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        if (i ==j){
            return true;
        }

        while(i<=j){
            
            while(i<j && Character.isLetterOrDigit(s.charAt(i))==false){
                i++;
            }
            while(i<j && Character.isLetterOrDigit(s.charAt(j))==false){
                j--;
            }

            if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))){
                return false;
            }
            else{
                i++;
                j--;
            }
            

        }
        return true;
    }
}