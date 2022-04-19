class Solution {
    public String freqAlphabets(String s) {
        var sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            var firstDigit = Character.getNumericValue(s.charAt(i));
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                var secondDigit = Character.getNumericValue(s.charAt(i + 1));
                sb.append((char) ('j' + firstDigit * 10 + secondDigit - 10));
                i = i + 2;
            } else {
                sb.append((char) ('a' + firstDigit - 1));                
            }
        }
        
        return sb.toString();
    }
}