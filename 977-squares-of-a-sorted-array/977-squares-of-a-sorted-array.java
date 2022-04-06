class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int[] result = new int[nums.length];
        if(nums[0] >= 0){
            for(int i = 0; i < nums.length; i++){
                result[i] = nums[i] * nums[i];
            }
            return result;
        }

        int[] negNums = new int[nums.length];
        int j = 0;
        for(; j < nums.length; j++){
            if(nums[j] >= 0){
                break;
            }
            negNums[j] =nums[j] * nums[j];
        }

        if(j == nums.length){
            for (int n = 0; n < nums.length; n++)
                result[n] = negNums[nums.length - n - 1];
            return result;
        }

        int r = 0;
        int k = j - 1;
        int mul = 0;
        for(int t = j; t < nums.length; t++){
            mul = nums[t] * nums[t];
            while( k >= 0 && negNums[k] <= mul){
                result[r] = negNums[k];
                r++;
                k--;
            }
            if(r >= nums.length) break;
            result[r] = mul;
            r++;
        }

        if(k>= 0){
            for (int i = r; i < nums.length; i++) {
                result[i] = negNums[nums.length - i - 1];
            }
        }

        return result;
    }
}