class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            if(map.get(i) == null){
                map.put(i,i);
            } else {
                return true;
            }
        }
        return false;
    }
}