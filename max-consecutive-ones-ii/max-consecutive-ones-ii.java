class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int longestSequence = 0;
        int left = 0;
        int right = 0;
        int numZeroes = 0;
        
        while(right < nums.length){
            
            if(nums[right] == 0){
                numZeroes++;
            }
            
            while(numZeroes == 2){
                if(nums[left] == 0){
                    numZeroes--;
                }
                left++;
            }
            
            longestSequence = Math.max(longestSequence, right - left + 1);
            right++;
        }
        return longestSequence;
    }
}