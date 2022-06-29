class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int window = 0;
        int temp = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                temp++;
            } else {
                temp = 0;
            }
            if( temp > window){
                window = temp;
            }
        }
        return window;
    }
}