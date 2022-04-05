class Solution {
    public int balancedStringSplit(String s) {
        char[] chars = s.toCharArray();
        int balance = 0;
        int result = 0;
        for(int i = 0; i < chars.length; i++){
            if(chars[i] == 'L'){
                balance++;
            } else {
                balance--;
            }
            if(balance == 0) result++;
        }
        return result;
    }
}