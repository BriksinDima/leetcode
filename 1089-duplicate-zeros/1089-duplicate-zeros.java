class Solution {
    public void duplicateZeros(int[] arr) {
        int length = arr.length - 1;
        int shift = 0;
        for (int i = 0; i < arr.length - shift; i++) {
            if (arr[i] == 0) {
                if(i == length - shift){
                    arr[length] = 0;
                    length--;
                    break;
                }
                shift++;
            }
        }

        int left = length - shift;

        for (int i = left; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[i + shift] = arr[i];
            }
            if (arr[i] == 0) {
                arr[i + shift] = arr[i];
                shift--;
                arr[i + shift] = 0;
            }
        }
    }
}