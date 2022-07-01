class Solution {
    public void duplicateZeros(int[] arr) {
        int length = arr.length - 1;
        int shift = 0;
        for(int i = 0; i <= length - shift; i++){
            int current = arr[i];
            if(current == 0){
                if(i == length - shift){
                    arr[length] = 0;
                    length -=1;
                    break;
                }
               shift++;
            }
        }
        int last = length - shift;
        for(int y = last; y >= 0; y--){
            if(arr[y] == 0 ){
                arr[y + shift] = arr[y];
                shift--;
                arr[y + shift] = 0;
            } else {
                arr[y + shift] = arr[y];
            }
        }
    }
}