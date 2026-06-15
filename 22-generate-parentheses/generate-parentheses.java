class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        return generate(n,0,0,"",result);


        
    }

    public static List<String> generate(int n , int open , int close , String currentStr , List<String> result){
        if (currentStr.length() == n*2){
            result.add(currentStr);
            return result; // return is not needed it is for readability
        }

        if (close<open){
            generate(n,open,close+1,currentStr+")",result);
        }
        if(open<n){
            generate(n,open+1,close,currentStr+"(",result);
        }

        return result;

        


    }


}















































































































