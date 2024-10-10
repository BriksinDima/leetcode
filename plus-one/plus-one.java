class Solution {
    public int[] plusOne(int[] digits) {
        int lastDigit = digits[digits.length-1];
    
    
        int carry = 0;
        for(int i = digits.length-1; i >= 0; i--) {
            int newSum = 0;
            if(i == digits.length - 1) {
              newSum = digits[i] + 1;  

            } else {
              newSum = digits[i] + carry;
              carry = 0;
            }

            if(newSum > 9) {
                carry = 1;
                digits[i] = 0;
            }  else {
                digits[i] = newSum;
            }
            
                // do carry and in the if carry >  0 then extend array + 1 and copy all digits
        }
        
        if(carry == 1) {
            int[] newArr = new int[digits.length + 1];
            newArr[0] = carry;
            for(int i = 0, j = 1; i < digits.length; i++, j++) {
                newArr[j] = digits[i];
            }
            digits = newArr;
        }
      
        return digits;
    }
}