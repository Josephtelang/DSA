class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        Deque<Integer> indexDq = new ArrayDeque<>();
        int result[] = new int[n-k+1];
        
        for(int i=0 ; i<n ; i++){
            int windowLastIdx = i;
            while(!indexDq.isEmpty() && nums[indexDq.peekLast()] <= nums[windowLastIdx]){
                indexDq.removeLast();
            }

            indexDq.add(i);

            int windowStartIdx = i-k+1;
            while(!indexDq.isEmpty() && indexDq.peekFirst() < windowStartIdx){
                indexDq.removeFirst();
            }

            if(i >= k-1){
                result[i-k+1] = nums[indexDq.peekFirst()];
            }
        }
        return result;
    }
}