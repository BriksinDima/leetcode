class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        List<Integer> li = new ArrayList<>();
        
        for(int i = 0;i<nums.length; i++){
            li.add(index[i],nums[i]);
        }
        for(int i = 0; i<li.size();i++){
            target[i] = li.get(i);   
        }
        return target;
    }
}