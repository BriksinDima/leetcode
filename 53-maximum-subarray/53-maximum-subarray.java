class Solution {
    public int maxSubArray(int[] nums) {
        int res = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i ++) {
            sum = nums[i] + (sum < 0 ? 0 : sum); 
            res = Math.max(res, sum);
        }
        return res;
    }
}