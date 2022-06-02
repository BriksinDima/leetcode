class Solution {
    public int[] decompressRLElist(int[] nums) {
          int size = 0;
        for (int i = 0; i < nums.length; i += 2) { // to compute res array size
            size += nums[i];
        }
                
        int[] res = new int[size];
        
        for (int i = 1, k = 0; i < nums.length; i += 2) {
            for (int j = 0; j < nums[i - 1]; j++) {
                res[k++] = nums[i];
            }
        }
        
        return res;
    }
}