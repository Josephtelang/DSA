class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> results = new HashSet<>();
        Arrays.sort(nums);
        for(int i= 0 ; i<nums.length-2; i++){
            int high = nums.length-1;
            int low = i+1;

            while(low < high){
                int sum = nums[i]+nums[low]+nums[high];
                if(sum == 0){
                    List<Integer> triplet = Arrays.asList(nums[i],nums[low],nums[high]);
                    results.add(triplet);
                    low ++;
                    high --;

                }
                else if(sum<0){
                    low ++;
                }
                else{
                    high --;
                }
            }
    
        }
        return new ArrayList<>(results);
        
    }
}