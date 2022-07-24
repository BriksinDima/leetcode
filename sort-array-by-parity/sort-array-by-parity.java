class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int evenPointer = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                int temp = nums[evenPointer];
                nums[evenPointer] = nums[i];
                nums[i] = temp;
                evenPointer++;
            }
        }
        return nums;
    }
}