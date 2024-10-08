class Solution {
    public int pivotIndex(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            int sumLeft = 0;
            for(int y = 0; y <= i; y++) {
                sumLeft += nums[y];
            }
            
            int sumRight = 0;
            for(int j = i; j < nums.length; j++) {
                sumRight += nums[j];
            }
            
            if(sumLeft == sumRight) {
                return i;
            }
        }
        
        return -1;
    }
}