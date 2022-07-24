class Solution {
    public int[] replaceElements(int[] arr) {
        int i = 1;
        int index = 0;
        while(arr.length  != i){
            int max = -1;
            for(int j = i; j < arr.length; j++ ){
                if(max < arr[j]){
                    max = arr[j];
                }
            }
            arr[index] = max;
            index++;
            i++;
        }
        
        arr[index] = -1;
        
        return arr;
    }
}