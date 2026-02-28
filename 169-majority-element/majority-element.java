class Solution {
    public int majorityElement(int[] nums) {
        int appearance = nums.length/2;
        int candidate = nums[0];
        int count =0 ;
        if(nums.length ==0 || nums == null){
            return -1;
        }
        for (int i =0 ; i<nums.length ; i++){
            if(nums[i] == candidate){
                count ++;
            }
            else{
                count --;
            }
            if(count == 0){
                candidate = nums[i];
                count ++;
            }

        }
        
        int freq=0;
        for (int num : nums){
            if (num == candidate){
                freq++;
            }
        }

        if (freq > appearance){
            return candidate;
        }
        return -1;
        
    }
}