class Solution {
    public double myPow(double x, long n) {
        if (n==1){
            return x;
        }
        long N= n;
        if (n==0){
            return 1;
        }
        if(n <=0){
            return 1.0/myPow(x,-N);
        }
    

        double halfPower = myPow(x,N/2);
        double halfPowerSquare = halfPower * halfPower;

        //odd
        if(N%2 !=0){
            halfPowerSquare = x*halfPowerSquare;
        }

        return halfPowerSquare;
        
    }
}