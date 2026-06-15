class Solution {
    public int addDigits(int num) {
        //base case
        if (num<10){
            return num;
        }

        int digitSum = sumDigits(num);

        return addDigits(digitSum);
        
    }

    public static int sumDigits(int num){
        if (num == 0){
            return 0;

        }

        int lastDigit = num % 10;

        int newDigit = num / 10;

        return lastDigit + sumDigits(newDigit);
    }
}