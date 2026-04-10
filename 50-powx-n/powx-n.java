class Solution {
    public double myPow(double x, int n) {
        return helper(x,n);

    }

    private double helper(double x, long n){
         if (n==1){
            return x;
        }
        
        if (n==0){
            return 1;
        }
        if(n <=0){
            return 1/helper(x,-n);
        }
    

        double halfPower = helper(x,n/2);
        double halfPowerSquare = halfPower * halfPower;

        //odd
        if(n%2 !=0){
            halfPowerSquare = x*halfPowerSquare;
        }

        return halfPowerSquare;
       }
        
}