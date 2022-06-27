class Solution {
    public int[] shuffle(int[] nums, int n) {
            int[] resultNums = new int[n*2];
    
    int resultNumsIndex = 0;
    
    for (int i = 0; i < n; i++) {
        int x = nums[i];
        int y = nums[i+n];
        
        resultNums[resultNumsIndex] = x;
        resultNums[resultNumsIndex+1] = y;
        resultNumsIndex = resultNumsIndex +2;
    }
    return resultNums;
    
    }
}