import java.util.Arrays;

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for(int i = 1; i < nums.length; i = i+2) {
            result+= nums[i-1];
        }
        
        return result;
    }
}