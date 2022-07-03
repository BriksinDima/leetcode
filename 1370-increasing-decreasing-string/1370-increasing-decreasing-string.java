class Solution {
     public String sortString(String s) {
        int[] arr = new int[26];
        for(char ch: s.toCharArray())
            arr[ch-'a']++;
        
        StringBuilder sb = new StringBuilder();
        while(sb.length() < s.length()){
            for(int i=0; i<26; i++){
                if(arr[i] > 0){
                    sb.append((char)(i+'a'));
                    arr[i]--;
                }
            }
            for(int i=25; i>=0; i--){
                if(arr[i] > 0){
                    sb.append((char)(i+'a'));
                    arr[i]--;
                }
            }
        }
        return sb.toString();
    }        
}