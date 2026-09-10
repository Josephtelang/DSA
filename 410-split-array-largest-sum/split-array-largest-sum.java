class Solution {
    public int splitArray(int[] nums, int k) {
        int lowerBound = Arrays.stream(nums).max().getAsInt();
        int higherBound = Arrays.stream(nums).sum();
        int ans = -1;

        while(lowerBound <= higherBound){
            int mid = lowerBound + (higherBound - lowerBound)/2;

            int countSubArrays = 0;
            int sum = 0;

            for(int i=0 ; i<nums.length ; i++){
                if(sum + nums[i] <= mid){
                    sum += nums[i];
                }
                else{
                    if(sum > 0){
                        countSubArrays++;
                        sum = 0;
                    }
                    sum += nums[i];
                    
                }
            }
            if(sum>0){
                countSubArrays++;
            }

            if(countSubArrays <= k){
                ans = mid;
                higherBound = mid-1;
            }
            else{
                lowerBound = mid+1;
            }
        }

        return ans;
    }
}