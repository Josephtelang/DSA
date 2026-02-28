class Solution {
    public int majorityElement(int[] nums) {
        int apperance = nums.length/2;
        for (int i =0 ; i<nums.length ; i++){
            int low = 0;
            int high = nums.length-1;
            int count =0;

            while(low < high){
                if (nums[low]==nums[i]){
                    count++;
                }
                if (nums[high]==nums[i]){
                    count++;
                }
                low++;
                high--;

            }
            if(low==high){
                if (nums[low]==nums[i]){
                    count++;
                }
            }
            if(apperance < count){
                return nums[i];
            }
        }

        return -1;

        
    }
}