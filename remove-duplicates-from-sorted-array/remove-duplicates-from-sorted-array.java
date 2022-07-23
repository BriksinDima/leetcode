class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 1;
        int current = nums[0];
        for(int j = 1; j < nums.length; j++){
            if(current != nums[j]){
                nums[i] = nums[j];
                current = nums[i];
                i++;
            }
        }
        return i;
    }
}