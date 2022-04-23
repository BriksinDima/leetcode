class Solution {
    public String reverseWords(String s) {
        String[] strArr = s.split(" ");
        for(int i = 0; i < strArr.length; i++){
            char[] charsToken = strArr[i].toCharArray();
            int left = 0, right = charsToken.length - 1;
            while(left < right){
                char temp = charsToken[left];
                charsToken[left++] = charsToken[right];
                charsToken[right--] = temp;
            }
            strArr[i] = String.valueOf(charsToken);
        }
        return String.join(" ", strArr);
    }
}