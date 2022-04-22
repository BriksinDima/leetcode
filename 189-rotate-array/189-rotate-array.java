class Solution {
    public void rotate(int[] nums, int k) {
       int inputK = k;
       int[] tempArr = new int[nums.length];
       int correctK =  inputK % nums.length; //  31 % 7 = 3
       int shiftedOnKFromEnd = nums.length - correctK;
       int j = 0;

       // [5, 6, 7]
       for(int i = shiftedOnKFromEnd; i < nums.length; i++, j++){
           tempArr[j] = nums[i];
       }

       for(int i = 0; i < shiftedOnKFromEnd; i++, j++ ){
           tempArr[j] = nums[i];
       }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = tempArr[i];
        }


    }
}