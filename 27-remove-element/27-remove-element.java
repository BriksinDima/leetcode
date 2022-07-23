class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int counter = 0;
        int p1 = 0;
        int p2 = nums.length - 1;
        while(p1 <= p2){
            if(nums[p1] == val && nums[p2] == val){
                p2--;
                continue;
            }
            if(nums[p1] == val){
                int temp = nums[p2];
                nums[p2] = nums[p1];
                nums[p1] = temp;
                p1++;
                p2--;
            } else {
                p1++;
            }
            counter++;
        }
        return counter;
    }
}