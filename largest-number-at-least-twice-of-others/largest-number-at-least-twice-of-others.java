class Solution {
    public int dominantIndex(int[] nums) {
        
        int maxIndex = 0;
        int maxValue = 0;
        for(int i = 0; i < nums.length; i++) {
            if(maxValue <= nums[i]) {
                maxIndex = i;
                maxValue = nums[i];
            }
        }
        
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != maxValue && maxValue < (nums[i] * 2)){
                return -1;
            }
        }
        
        return maxIndex;
    }
}