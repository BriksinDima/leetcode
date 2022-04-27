class Solution {
    public int countKDifference(int[] nums, int k) {
        int counter = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                int z = nums[i] - nums[j];
                if(z < 0){
                    z *=-1;
                }
                if(z == k){
                    counter++;
                }
            }
        }
        return counter;
    }
}