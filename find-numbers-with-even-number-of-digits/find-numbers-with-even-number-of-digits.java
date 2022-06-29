class Solution {
    public int findNumbers(int[] nums) {
        int result = 0;
        for(int i = 0; i < nums.length; i++){
            int current = nums[i];
            int numbers = 0;
            while(current > 0){
                current = current / 10;
                numbers++;
            }
            
            if(numbers % 2 == 0){
                result++;
            }
        }
        return result;
    }
}